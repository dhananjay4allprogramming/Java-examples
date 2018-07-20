package highlevelRest;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;

public class Test {

	public static void main(String[] args) {
		IndexRequest indexRequest=null;
		// create and  connect to elasticsearch server
		RestHighLevelClient client =
				new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http"), new HttpHost("192.168.0.250", 9200, "http")));
		
		
		// *****************************************************Indexing way*************************************************************
		
		/* indexRequest = new IndexRequest("myindex","mytype","1");
		
		String jsonString = "{" +
		        "\"user\":\"Dhananjay\"," +
		        "\"postDate\":\"2018-04-10\"," +
		        "\"message\":\"trying out Elasticsearch\"" +
		        "}";
		request.source(jsonString, XContentType.JSON);*/
		
		
		//Document source provided as a Xbuilder api  which gets automatically converted to JSON format
		
	/*	try {
		XContentBuilder builder = XContentFactory.jsonBuilder();
		builder.startObject();
		{
		    builder.field("user", "Dhananjay");
		    builder.field("postDate", new Date());
		    builder.field("message", "this is second way of indexing");
		}
		builder.endObject();
		indexRequest = new IndexRequest("test", "doc", "1").source(builder);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		
	//Document source provided as a Map which gets automatically converted to JSON format	
/*
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("user", "Dhananjay");
		jsonMap.put("postDate", new Date());
		jsonMap.put("message", "This is the third way of indexing");
		indexRequest = new IndexRequest("test", "doc", "1").source(jsonMap);*/
		
		/*try {
			IndexResponse response = client.index(indexRequest);
			System.out.println(response.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	//*******************************************************************searching data***************************************************	

		
		
	}

}
