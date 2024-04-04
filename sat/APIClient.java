package assignment3.sat;

public class APIClient {
public void sendRequest(String endpoint) {
	System.out.println("EndPoint is :"+endpoint);
	
}

public void sendRequest(String endpoint,String requestBody, Boolean requestStatus ) {
	System.out.println("EndPoint is  : "+endpoint);
	System.out.println("RequestBody is  :"+requestBody);
	System.out.println("Request Status is  :"+requestStatus);
}
public static void main(String[] args) {
	APIClient api=new APIClient();
	api.sendRequest("Initiated");
	api.sendRequest("Initiated", "Processing", true);
	
}
}
