import java.io.UnsupportedEncodingException;

class ZimbraCracker
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        HTTPRequest request = new HTTPRequest();
        //Set content types and such	
        request.setUserAgent("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9) Gecko/2008061015 Firefox/3.0");		
        //Get URL
        String source = request.get("http://zimbra.earlham.edu/zimbra");
        //Print source
        System.out.println("Page Source: " + source);
        
        //Create variables for username and password
        String username = "";
        String password = "";
        
        //Populate Post Data
        String postData = "?loginOp" + "=" + "login" +
                "&" + "username" + "=" + username +
                "&" + "password" + "=" + password;
        //Set content types again, just to be sure
        request.setUserAgent("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9) Gecko/2008061015 Firefox/3.0");		
		request.setAccept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "en-us,en;q=0.5",
				"ISO-8859-1,utf-8;q=0.7,*;q=0.7");
        //Set URL
        request.setURL("http://zimbra.earlham.edu/zimbra");
        //Send post data
        request.post("", postData);
        //Get new source and print it to the screen
        System.out.println("New Source:" + request.get(""));
    }
}