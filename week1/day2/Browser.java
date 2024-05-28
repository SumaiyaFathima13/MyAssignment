package week1.day2;

public class Browser {
		public String launchBrowser(String BrowserName)
		{
		return BrowserName;
		}

		public void loadUrl()
		{
			System.out.println("Application url loaded successfully");
		}
		
		public static void main(String[] args) {
			Browser launchBrowser = new Browser();
			System.out.println(launchBrowser.launchBrowser("Browser launched successfully"));
			launchBrowser.loadUrl();
			
		}
	}
