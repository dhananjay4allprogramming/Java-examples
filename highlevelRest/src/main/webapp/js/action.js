$(document).ready(function(){
	
	/**
	 * This is use for hit the search servlet action  on button click 
	 */
	
   /* $("#searchBtn").click(function(){
        $.ajax({
        	type : "POST",
        	url : 'search',
			data : {
				searchText : $('#searchText').val()
			},
        	success : function(result){
            					$("#searchData").html(result);
       		 }
        });
    });*/
	
	
	
	$("#searchText").keyup(function(){
        $.ajax({
           type : "POST",
           url : "SearchController",
            data : {
                searchText : $("#searchText").val()
            },
            success : function(result){
                $("#searchData").html(result);
            }
        }); 
    });
    
    /**
     * This method is use to insert data into elastic search
     */
    
    $("#insertBtn").click(function(){
    	$.ajax({
    		type : "POST",
    		url : "insert",
    		data : {
    			id : $("#id").val(),
    			name : $("#name").val(),
    			email : $("#email").val(),
    			phone : $("#phone").val(),
    			salary : $("#salary").val(),
    			description : $("#description").val()
    		},
    		success : function(){
    			alert("Success.");
    			$("#id").val(" ");
        		$("#name").val(" ");
        		$("#email").val(" ");
        		$("#phone").val(" ");
        		$("#salary").val(" ");
        		$("#description").val(" ");
        	}
    	});
    });
    
});