package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import highlevelRest.HighLevelRestClientCRUD;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/insert")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     HighLevelRestClientCRUD crud = new HighLevelRestClientCRUD();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertController() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String salary = request.getParameter("salary");
		String description = request.getParameter("description");
		
		String insertRecord = crud.InsertRecord(id, name, email, phone, salary, description);
		if(insertRecord.equals("success")) {
			System.out.println("record inserted...");
		}else {
			System.out.println("record not inserted...");
		}
	}

}
