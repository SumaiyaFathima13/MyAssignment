package week3.day1;

public class APIClientOverloading {
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint is "+endpoint+"\n"+"Request Body is "+requestBody+"\n"+"Request Status is "+requestStatus);
	}
	
	public static void main(String[] args) {
		APIClientOverloading a = new APIClientOverloading();
		
		a.sendRequest("API");
		a.sendRequest("Automation", "Testing", false);
	}
}
