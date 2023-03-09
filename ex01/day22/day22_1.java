package java200.ex01.day22;

import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class day22_1 {

	public static void main(String[] args) {
		String newurls = "https://ko.wikipedia.org/wiki/ISO_3166-1";
		HttpGet request = new HttpGet(newulrs);
		CloseableHttpClient httpClient=null;
		Document doc = null;
		try {
			httpClient= HttpClients.createDefault();
			response=httpClient.excute(request);
			StringBuffer sb = new StringBuffer();
			HttpEntity entity = response.getEntity();
			if(entity != null) {
				String result = EntityUtils.toSting(entity);
				sb.append(result);
			}
			doc=Jsoup.parse(sb.toString());
			String id="charts";
			Element eid=doc.getElementById(id);
			String sdate=eid.attr("data-chart-data");
			System.out.println("이번 빌보드 차트 날자:"+sdate.trim());
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
