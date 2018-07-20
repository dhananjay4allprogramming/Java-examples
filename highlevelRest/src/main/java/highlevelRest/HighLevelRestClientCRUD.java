package highlevelRest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

public class HighLevelRestClientCRUD {
	IndexRequest indexRequest=null;
	// create and  connect to elasticsearch server
	RestHighLevelClient client =
			new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http"), new HttpHost("192.168.0.250", 9200, "http")));
/**
 * this method is use to insert record into elasticsearch
 * @param id
 * @param name
 * @param message
 * @return
 */
	public String InsertRecord(String id, String name, String email, String phone, String salary, String description) {
		
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("id", id);
		jsonMap.put("name", name);
		jsonMap.put("email", email);
		jsonMap.put("phone", phone);
		jsonMap.put("salary", salary);
		jsonMap.put("description", description);
		
		indexRequest = new IndexRequest("employee", "doc", id).source(jsonMap);
		
		try {
			IndexResponse response = client.index(indexRequest);
			System.out.println(response.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	public String deleteRecord() {
		return "success";
	}
	
	public String searchRecord() {
		SearchRequest searchRequest = new SearchRequest();
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(QueryBuilders.matchAllQuery());
		return searchRequest.source(searchSourceBuilder).toString();
	}
	
}
