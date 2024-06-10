package week3.day1;

public class Safari extends Browser {

	
		public void readMode(){
			System.out.println("I am in takeSnap");
		}

		public void fullScreenMode() {
			System.out.println("I am in clearCache");
		}
		
		public static void main(String[] args) {
			Safari s = new Safari();
			s.browserName = "Safaribrowser";
			s.browserVersion = "12.2";
			System.out.println(s.browserName);
			System.out.println(s.browserVersion);
			s.openUrl();
			s.closeBrowser();
			s.navigateBrowser();

			s.readMode();
			s.fullScreenMode();
	}

}
