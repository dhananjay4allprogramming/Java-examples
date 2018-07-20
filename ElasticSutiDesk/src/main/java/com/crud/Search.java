package com.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
@WebServlet("/search")
public class Search extends HttpServlet {
	ElasticCRUD crud = new ElasticCRUD();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String jsonString=crud.search(request.getParameter("searchText"));
		JSONObject source;
		JSONArray jsonArray =crud.parseJSONToJava(jsonString);
		
		out.print("<table class='table'>");
		for(int i=0;i<jsonArray.length();i++) {
			source=jsonArray.getJSONObject(i).getJSONObject("_source");
			out.print("<td>"+source.getString("id")+"</td><td>"+source.getString("name")+"</td><td>"+source.getString("email")+
					"</td><td>"+source.getString("salary")+"</td><td>"+source.getString("description")+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}
}
