package com.pagination;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test {
	public static void main(String[] args) throws IOException {
		ElasticLogic elasticLogic = new ElasticLogic();
		String data = elasticLogic.search("10");
		
		
		JSONObject json = new JSONObject(data);
		JSONObject hitsObj = json.getJSONObject("hits");
		JSONArray hitsArr = hitsObj.getJSONArray("hits");
		
		for(Object str :hitsArr) {
			JSONObject obj = (JSONObject)str;
			System.out.println(obj.get("_source"));
		}
		
		
	}
}
