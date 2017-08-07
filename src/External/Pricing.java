package External;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



public class Pricing {
	String url = "https://forex.1forge.com/1.0.2/quotes?pairs=USDEUR,USDGBP,USDAUD&api_key=6ktQMblY43jNmYMNn8lzLXg7kV51LEBy";
	CloseableHttpClient httpclient = HttpClients.createDefault();
	CloseableHttpResponse response1;
	public void conneect(){
		try{
			HttpGet httpGet = new HttpGet(url);
			response1 = httpclient.execute(httpGet);
			System.out.println(response1.getStatusLine());
		    HttpEntity entity = response1.getEntity();
		    // do something useful with the response body
		    // and ensure it is fully consumed
		    String responseString = EntityUtils.toString(entity, "UTF-8");
		    System.out.println(responseString);
		    EntityUtils.consume(entity);
		}catch (Exception ex){
			System.out.println(ex.toString());
		}finally{
			try {
				response1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
	

