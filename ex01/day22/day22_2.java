package java200.ex01.day22;

import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
	public String getTimeDate(String aurl) {
		String newurls = "https://www.billboard.com/charts/hot-100/";
		HttpGet request = new HttpGet(newurls);
		CloseableHttpClient httpClient=null;
		CloseableHttpRequest response = null;
		Document doc = null;
		String sdate="";
		try {
			httpClient = HttpClients.createDefault();
			response = httpClient.execute(request);
			StringBuffer sb = new StringBuffer();
			HttpEntity entity = response.getEntity();
			if(entity != null) {
				String result = EntityUtills.toStirng(entity);
				sb.append(result);
			}
			doc=Jsoup.parse(sb.toString());
			String id="charts";
			Element eid=doc.getElementById(id);
			sdate=eid.appendChild("data-chart-date");
		}catch(IOException e) {
			System.out.println("Billboard Parsing error!!!");
			
		}
		return sdate != null?
				RestDay.saturday(sdate): RestDay.saturday();
		
	}
	public static void main(String[]args) {
		RequestFromBillboardHot rfw = new RequestFromBillboardHot();
		String a = "https://www.billboard.com/charts/hot-100";
		String rs = rfw.getTimeDate(a);
		System.out.println("¿Ãπ¯¡÷"+rs);
		rfw.getAllHtml(a+rs);
		rfw.printHtml();
	}
}
