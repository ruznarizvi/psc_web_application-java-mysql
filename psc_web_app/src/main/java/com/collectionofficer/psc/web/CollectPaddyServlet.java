package com.collectionofficer.psc.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collectionofficer.psc.bean.CollectPaddy;
import com.collectionofficer.psc.bean.Farmer;
import com.collectionofficer.psc.bean.IssuedPayment;
import com.collectionofficer.psc.bean.PaddyPricing;
import com.collectionofficer.psc.bean.RegionalCenter;
import com.collectionofficer.psc.dao.CollectPaddyDao;
import com.collectionofficer.psc.dao.FarmerDao;
import com.collectionofficer.psc.dao.IssuedPaymentDao;
import com.collectionofficer.psc.dao.PaddyPricingDao;
import com.collectionofficer.psc.dao.RegionalCenterDao;



/**
 * Servlet implementation class CollectPaddyServlet
 */
@WebServlet("/")
public class CollectPaddyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CollectPaddyDao collectPaddyDao;
	private IssuedPaymentDao issuedPaymentDao;
	private PaddyPricingDao paddyPricingDao;
	private FarmerDao farmerDao;
	private RegionalCenterDao regionalCenterDao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		  collectPaddyDao = new CollectPaddyDao();
		  issuedPaymentDao = new IssuedPaymentDao();
		  paddyPricingDao = new PaddyPricingDao();  
		  farmerDao = new FarmerDao();
		  regionalCenterDao = new RegionalCenterDao();
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		try {
		//writing a switch case to handle all the actions
		switch(action)
		{
		case "/new":
			//if the action is new, we are going to call the showNewForm method
			// we are passing the request and response to the http servlet
			showNewForm(request, response);
		break;
		case "/pricelist":
			//if the action is new, we are going to call the showNewForm method
			// we are passing the request and response to the http servlet
			listPaddyPricing(request, response);
		break;
		case "/farmerslist":
			//if the action is new, we are going to call the showNewForm method
			// we are passing the request and response to the http servlet
			listFarmers(request, response);
		break;
		case "/dashboardlist":
			//if the action is new, we are going to call the showNewForm method
			// we are passing the request and response to the http servlet
			listDashbaord(request, response);
		break;
		case "/insert":
			insertPaddy(request, response);
				//create another method in here to run both methods simultaneously (CollectionOfficer)
			insertIssuedPaymentDetails(request, response);	
			updateCurrentCapacity(request, response);
			break;
		
		case "/delete":
				deletePaddy(request, response);		
			break;
			
		case "/edit":
				showEditForm(request, response);
		
			break;
	
		case "/update":
				updatePaddy(request, response);
//				updateCurrentCapacity(request,response);
			break;
	
			//if there is any other action other than the above then it will go to default
			//the list keyword will be handled by the default section
			//simply said it will call the user list KEY and show all the list users in the page
			default:
				listPaddy(request, response);
				break;
		}
	}
		catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	

		
		private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("collectPaddyForm.jsp");
			//to forward the request and response to the user form.jsp file
			dispatcher.forward(request, response);
			
		}
		

		//insert user method
		private void insertPaddy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {		
			//by the help of the request object using the get parameter method, we are taking the farmer_Id, paddy_Id and total_weight from the jsp page		
			int farmer_Id = Integer.parseInt(request.getParameter("farmer_Id"));	
			int paddy_Id = Integer.parseInt(request.getParameter("paddy_Id"));
			int total_weight = Integer.parseInt(request.getParameter("total_weight"));	
	
			
			//using session to get current user
			String session = (String) request.getSession(false).getAttribute("collection_officer_Email");
			
			CollectPaddyDao obJDBConnection = new CollectPaddyDao();
			Connection connection = obJDBConnection.getConnection();
					
			PreparedStatement ps=null;
			ResultSet rq=null;				
			
			//selecting all paddy related details from tbl_paddy
			String query = "select paddy_Id,paddy_Type,selling_price_per_Kg,buying_price_per_Kg,head_office_Id from tbl_paddy where paddy_Id ='"+paddy_Id+"'";
			ps = connection.prepareStatement (query);
			rq = ps.executeQuery();
			
			while(rq.next()) {
				
			double buying_price_per_Kg = rq.getDouble("buying_price_per_Kg");	
			int buying_price_per_Kg_int = rq.getInt("buying_price_per_Kg");
			//getting total amount by multiplying buying_price_per_Kg*total_weight
			int total_amount = buying_price_per_Kg_int*total_weight;

			//getting current date and assigning it to purchase_date variable
		    long millis=System.currentTimeMillis();  
		    java.sql.Date date=new java.sql.Date(millis);
			Date purchase_date;			
			purchase_date = date;

			PreparedStatement pc=null;
			ResultSet rc=null;				
			
			//getting collection officer details using session via collection_officer_Email 
			String queryc = "select collection_officer_Id,collection_officer_Name,collection_officer_Username,collection_officer_Email,"
					+ "collection_officer_Address,collection_officer_Contact,collection_officer_Password,regional_center_Id"
					+ " from tbl_collection_officer where collection_officer_Email ='"+session+"'";
			pc = connection.prepareStatement (queryc);
			rc = pc.executeQuery();
			
			while(rc.next()) {			
			int collection_officer_Id = rc.getInt("collection_officer_Id");
			int regional_center_Id = rc.getInt("regional_center_Id");
		
			//after that we are storing it in the CollectPaddy bean class
			//the newPaddy variable contains the data
			CollectPaddy newPaddy = new CollectPaddy (farmer_Id, paddy_Id, total_weight, total_amount, purchase_date, collection_officer_Id, regional_center_Id);
			
			collectPaddyDao.insertPaddy(newPaddy);
			//sending a response to the sendRedirect list taking the action as a list
			//the list action will be handled by the default in the switch statement since its different
			System.out.println("Paddy collection inserted successfully!");
			response.sendRedirect("list");		
    	}			
	  }			
	}
		
		
		//insert issued payment details
		//insert user method
		private void insertIssuedPaymentDetails(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			
			//by the help of the request object using the get parameter method, we are taking the name, email, country from the jsp page
			String session = (String) request.getSession(false).getAttribute("collection_officer_Email");
			
			int farmer_Id = Integer.parseInt(request.getParameter("farmer_Id"));	
			int paddy_Id = Integer.parseInt(request.getParameter("paddy_Id"));
			int total_weight = Integer.parseInt(request.getParameter("total_weight"));
		
			IssuedPaymentDao obJDBConnection = new IssuedPaymentDao();
			Connection connection = obJDBConnection.getConnection();
					
			PreparedStatement ps=null;
			ResultSet rq=null;				
			
			//String query = "select * from users";
			String query = "select paddy_Id,paddy_Type,selling_price_per_Kg,buying_price_per_Kg,head_office_Id from tbl_paddy where paddy_Id ='"+paddy_Id+"'";
			ps = connection.prepareStatement (query);
			rq = ps.executeQuery();
			
			while(rq.next()) {
				
			double buying_price_per_Kg = rq.getDouble("buying_price_per_Kg");	
			int buying_price_per_Kg_int = rq.getInt("buying_price_per_Kg");
			int total_amount = buying_price_per_Kg_int*total_weight;

		    long millis=System.currentTimeMillis();  
		    java.sql.Date date=new java.sql.Date(millis);
			Date purchase_date;			
			purchase_date = date;
			
			String issued_status = "Not Issued";
			
			PreparedStatement pc=null;
			ResultSet rc=null;				
			
			//getting collection officer details using session via collection_officer_Email 
			String queryc = "select collection_officer_Id,collection_officer_Name,collection_officer_Username,collection_officer_Email,"
					+ "collection_officer_Address,collection_officer_Contact,collection_officer_Password,regional_center_Id"
					+ " from tbl_collection_officer where collection_officer_Email ='"+session+"'";
			pc = connection.prepareStatement (queryc);
			rc = pc.executeQuery();
			
			while(rc.next()) {
				//after that we are storing it in the userBean class
				//the newUser variable contains the data
				int regional_center_Id = rc.getInt("regional_center_Id");
				IssuedPayment newIssuedPayment = new IssuedPayment (issued_status,farmer_Id, paddy_Id, total_weight, total_amount, purchase_date, regional_center_Id);
				
				issuedPaymentDao.insertIssuedPaymentDetails(newIssuedPayment);
				//sending a response to the sendRedirect list taking the action as a list
				//the list action will be handled by the default in the switch statement since its different
			}

		
			
  				
	  }
			
	}
				

		//delete user method
		private void deletePaddy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			//getting the id from the request object using the getParamter method and transfering into integer type and passing into the id variable
			int collected_paddy_details_Id = Integer.parseInt(request.getParameter("collected_paddy_details_Id"));
			try {
			//calling the deleteUser method of the userDao class created directly and passing the id to delete the user according to that id
			collectPaddyDao.deletePaddy(collected_paddy_details_Id);
			}catch (Exception e) {
				e.printStackTrace();
			}
			//after that returning the response to the list, it will handle in the swicth case of the default section
			System.out.println("Paddy collection deleted successfully!");
			response.sendRedirect("list");
		}
		
		
		
		//showedit form method
		private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
			//getting the id from the request object using the getParamter method and transfering into integer type and passing into the id variable
			int collected_paddy_details_Id = Integer.parseInt(request.getParameter("collected_paddy_details_Id"));
			
			//creating an existing user object
			CollectPaddy existingPaddy;
			try {
			//calling the selectUser method in the userDao class and passing the id and we are storing it in the existingUser variable
			existingPaddy = collectPaddyDao.selectPaddy(collected_paddy_details_Id);
			// forward the user-form.jsp PAGE!
			RequestDispatcher dispatcher = request.getRequestDispatcher("collectPaddyForm.jsp");
			//set the existing user object to the user key using the set attribute method of the request object
			request.setAttribute("collectPaddy", existingPaddy);
			//forward the request to the user-form.jsp page
			dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//update method
		private void updatePaddy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			int collected_paddy_details_Id = Integer.parseInt(request.getParameter("collected_paddy_details_Id"));
			//taking the name, email, and country from the jsp page using the request object and get paramater method
			int farmer_Id = Integer.parseInt(request.getParameter("farmer_Id"));
			int paddy_Id = Integer.parseInt(request.getParameter("paddy_Id"));
			int total_weight = Integer.parseInt(request.getParameter("total_weight"));
			
			
			CollectPaddyDao obJDBConnection = new CollectPaddyDao();
			Connection connection = obJDBConnection.getConnection();
			
			PreparedStatement ps=null;
			ResultSet rq=null;				
			
			//String query = "select * from users";
			String query = "select paddy_Id,paddy_Type,selling_price_per_Kg,buying_price_per_Kg,head_office_Id from tbl_paddy where paddy_Id ='"+paddy_Id+"'";
			ps = connection.prepareStatement (query);
			rq = ps.executeQuery();
			
			while(rq.next()) {
				
			int buying_price_per_Kg = rq.getInt("buying_price_per_Kg");	
			int total_amount = buying_price_per_Kg*total_weight;

			//after that we are storing it in the userBean class
					//the newUser variable contains the data
			CollectPaddy collectPaddy = new CollectPaddy(collected_paddy_details_Id, farmer_Id, paddy_Id, total_weight, total_amount);
			//calling user update method using the userdao object
			collectPaddyDao.updatePaddy(collectPaddy);
			System.out.println("Paddy collection updated successfully!");
			response.sendRedirect("list");
		}
		
		}
		
		private void updateCurrentCapacity(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			
			
			CollectPaddyDao obJDBConnection = new CollectPaddyDao();
			Connection connection = obJDBConnection.getConnection();
			
			String session = (String) request.getSession(false).getAttribute("collection_officer_Email");
				
			PreparedStatement pc=null;
			ResultSet rc=null;				
			
			//getting collection officer details using session via collection_officer_Email 
			String queryc = "select collection_officer_Id,collection_officer_Name,collection_officer_Username,collection_officer_Email,"
					+ "collection_officer_Address,collection_officer_Contact,collection_officer_Password,regional_center_Id"
					+ " from tbl_collection_officer where collection_officer_Email ='"+session+"'";
			pc = connection.prepareStatement (queryc);
			rc = pc.executeQuery();	

			while(rc.next()) {
		
				
				int regional_center_Id = rc.getInt("regional_center_Id");
				
				PreparedStatement ps=null;
				ResultSet rq=null;	
				
				String query = "select regional_center_Name, regional_center_Address, regional_center_Capacity, head_office_Id, current_capacity from tbl_regional_center where regional_center_Id ='"+regional_center_Id+"'";
				
				//String query = "select * from users";
//				String query = "select total_weight from tbl_collected_paddy_details where regional_center_Id ='"+regional_center_Id+"'";
				ps = connection.prepareStatement (query);
				rq = ps.executeQuery(); 
			
			while(rq.next()) {

//				int total_weight = Integer.parseInt(request.getParameter("total_weight"));
				int capacity = rq.getInt("current_capacity");	
				int total_weight = Integer.parseInt(request.getParameter("total_weight"));
		
					//after that we are storing it in the userBean class
				    //the newUser variable contains the data
				
			    int current_capacity = capacity + total_weight;
					
					RegionalCenter regionalCenter = new RegionalCenter(regional_center_Id, current_capacity);
					//calling user update method using the userdao object
					regionalCenterDao.updateCurrentCapacity(regionalCenter); 
				

			
			}	
				
			}

			
	
	}
		
		//default method
			private void listPaddy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
			try {
			//calling the Selectallusers method from the userdao class and storing them in a list
			List<CollectPaddy> listPaddy = collectPaddyDao.selectAllPaddy();
			//setting the listUsers to the listUser key by using the request object setAttribute method
			//so that we could use the key in the JSP page to list out all the users
			request.setAttribute("listPaddy", listPaddy);
			//here we are using the getRequestDispatcher to forward the list to the user-list.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("collectedPaddyList.jsp");
			dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		private void listDashbaord(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
			try {
			
			//calling the Selectallusers method from the userdao class and storing them in a list
			List<CollectPaddy> listDashboard = collectPaddyDao.selectRecentPaddy();
			//setting the listUsers to the listUser key by using the request object setAttribute method
			//so that we could use the key in the JSP page to list out all the users
			request.setAttribute("listDashboard", listDashboard);
			//here we are using the getRequestDispatcher to forward the list to the user-list.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("collectionOfficerDashboard.jsp");
			dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		private void listPaddyPricing(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
			try {
			
			//calling the Selectallusers method from the userdao class and storing them in a list
			List<PaddyPricing> listPaddyPricing = paddyPricingDao.selectAllPaddyPricingDetails();
			//setting the listUsers to the listUser key by using the request object setAttribute method
			//so that we could use the key in the JSP page to list out all the users
			request.setAttribute("listPaddyPricing", listPaddyPricing);
			//here we are using the getRequestDispatcher to forward the list to the user-list.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("paddyPricingList.jsp");
			dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private void listFarmers(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
			try {
			
			//calling the Selectallusers method from the userdao class and storing them in a list
			List<Farmer> listFarmers = farmerDao.selectAllFarmers();
			//setting the listUsers to the listUser key by using the request object setAttribute method
			//so that we could use the key in the JSP page to list out all the users
			request.setAttribute("listFarmers", listFarmers);
			//here we are using the getRequestDispatcher to forward the list to the user-list.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("farmersList.jsp");
			dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	
}
