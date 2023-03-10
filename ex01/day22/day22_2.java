package java200.ex01.day22;

import java.io.IOException;

public class day22_2 {
	String result;
	public void getAllHtml(String newurls) {
		HttpGet request = new HttpGet(newurls);
		try(ClosealbeHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(request)){
			HttpEntity entity = response.getEntity();
			if(entity != null) {
				result = EntityUtils.toString(entity);
			}
		}catch(IOException e) {
			System.out.println("Billboard parsing error!!");
		}
	}
	public  void printHtml() {
		System.out.println(result);
	}
}
