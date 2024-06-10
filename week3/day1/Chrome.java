package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito(){
		System.out.println("I am in openIncognito");
	}

	public void clearCache() {
		System.out.println("I am in clearCache");
	}
	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.browserName = "Chromebrowser";
		c.browserVersion = "12.2";
		System.out.println(c.browserName);
		System.out.println(c.browserVersion);
		c.openUrl();
		c.closeBrowser();
		c.navigateBrowser();
		
		c.openIncognito();
		c.clearCache();
		
	}

}
