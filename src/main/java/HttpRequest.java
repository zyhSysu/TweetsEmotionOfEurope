import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/*
Class HttpRequest help construct the HTTP request 
using the URL and parameters passed by user.

Function sendGet send the HTTP request and return 
the reply delivered from remote server to user.
*/

public class HttpRequest {

	 public static String sendGet(String url, String param) {
	        String result = "";
	        BufferedReader in = null;
			
	        try {
	            String urlNameString = url + "?" + param;
	            URL realUrl = new URL(urlNameString);
	            
				//build connection
	            URLConnection connection = realUrl.openConnection();
	            
	            connection.setRequestProperty("accept", "*/*");
	            connection.setRequestProperty("connection", "Keep-Alive");
	            connection.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            
	            connection.connect();

				//buffer the server reply
	            in = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
						
	            String line;
				
				//fetch the result from the buffer
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("Get Error!" + e);
	            e.printStackTrace();
	        }
	       
	        finally {
	            try {
	                if (in != null) {
	                    in.close();
	                }
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }
	        return result;
	    }
}
