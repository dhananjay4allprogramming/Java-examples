package com.pagination;

import java.io.IOException;
import java.util.Collections;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;

public class ElasticLogic {
	HttpHost host = new HttpHost("192.168.0.250",9200,"http");
	RestClient client = RestClient.builder(host).build();
	
	public String search(String from) throws IOException {
		  HttpEntity entity = new NStringEntity(

				  "{\r\n" +
				  " \"from\" :"+from+", \"size\" : 10,"+
				  "    \"query\" : {\r\n" + 
				  "        \"match_all\" : {}\r\n" + 
				  "    }\r\n" + 
				  "}",
			  ContentType.APPLICATION_JSON);
			  Response response = client.performRequest("GET","knowledgebase/doc/_search", Collections.emptyMap(), entity);
			  String jsonString=  EntityUtils.toString(response.getEntity());
			  return jsonString;
	}
}
