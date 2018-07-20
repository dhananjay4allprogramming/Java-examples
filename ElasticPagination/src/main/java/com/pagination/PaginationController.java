package com.pagination;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
@WebServlet("/PaginationController")
public class PaginationController extends HttpServlet {   
	private String data;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ElasticLogic elasticLogic = new ElasticLogic();
		String from = request.getParameter("from");
		data =  elasticLogic.search(from);
		JSONObject json = new JSONObject(data);
		JSONObject hitsObj = json.getJSONObject("hits");
		JSONArray hitsArr = hitsObj.getJSONArray("hits");
		for(Object str :hitsArr) {
			JSONObject obj = (JSONObject)str;
			out.println(obj.get("_source")+"<br>************************************************************<br>");
			System.out.println(obj.get("_source"));
		}
	}

}
