package week3.day1;

public class Edge extends Browser {
	
	public void takeSnap(){
		System.out.println("I am in takeSnap");
	}

	public void clearCookies() {
		System.out.println("I am in clearCache");
	}

	public static void main(String[] args) {
		Edge e = new Edge();
		e.browserName = "Edgebrowser";
		e.browserVersion = "12.2";
		System.out.println(e.browserName);
		System.out.println(e.browserVersion);
		e.openUrl();
		e.closeBrowser();
		e.navigateBrowser();

		e.takeSnap();
		e.clearCookies();
	}

}
