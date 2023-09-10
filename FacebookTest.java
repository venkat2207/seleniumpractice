package seleniumpractice;

public class FacebookTest {

	public static void main(String[] args) {
		
		
	    BrowserUtil brUtil=new BrowserUtil();
	    
	    
	    brUtil.initDriver("chrome");
	    
	    brUtil.launchUrl("https://facebook.com/");
	    
	    String pageTitle = brUtil.getPageTitle();
	    
	    System.out.println(pageTitle);
	    
	    
	    brUtil.quitBrowser();
	    
	    
	

	}

}
