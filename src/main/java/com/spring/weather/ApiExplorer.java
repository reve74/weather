<<<<<<< HEAD
package com.spring.weather;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=QVWDM9ZUKGDJ%2BZ46qFzKBatWi3Kc8Fp1WdNpIaERUzVjt0Xq4ha9p7BYowPw079DWuvSKjQrXlIFSSI8%2FhvE0w%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*í•œ íŽ˜ì´ì§€ ê²°ê³¼ ìˆ˜*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*íŽ˜ì´ì§€ ë²ˆí˜¸*/
        urlBuilder.append("&" + URLEncoder.encode("stationName","UTF-8") + "=" + URLEncoder.encode("ì¢…ë¡œêµ¬", "UTF-8")); /*ì¸¡ì •ì†Œ ì´ë¦„*/
        urlBuilder.append("&" + URLEncoder.encode("dataTerm","UTF-8") + "=" + URLEncoder.encode("DAILY", "UTF-8")); /*ìš”ì²­ ë°ì´í„°ê¸°ê°„ (í•˜ë£¨ : DAILY, í•œë‹¬ : MONTH, 3ë‹¬ : 3MONTH)*/
        urlBuilder.append("&" + URLEncoder.encode("ver","UTF-8") + "=" + URLEncoder.encode("1.3", "UTF-8")); /*ë²„ì „ë³„ ìƒì„¸ ê²°ê³¼ ì°¸ê³ ë¬¸ì„œ ì°¸ì¡°*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
=======
package com.spring.weather;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/6260000/AirQualityInfoService/getAirQualityInfoClassifiedByStation"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=QVWDM9ZUKGDJ%2BZ46qFzKBatWi3Kc8Fp1WdNpIaERUzVjt0Xq4ha9p7BYowPw079DWuvSKjQrXlIFSSI8%2FhvE0w%3D%3D"); /*Service Key*/
        /*urlBuilder.append("&" + URLEncoder.encode("serviceKey","UTF-8") + "=" + URLEncoder.encode("ÀÎÁõÅ°(URL Encode)", "UTF-8")); /*°ø°øµ¥ÀÌÅÍÆ÷ÅÐ¿¡¼­ ¹ÞÀº ÀÎÁõÅ°*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*ÆäÀÌÁö¹øÈ£*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("5", "UTF-8")); /*ÇÑ ÆäÀÌÁö °á°ú ¼ö*/
        urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*JSON¹æ½ÄÀ¸·Î È£Ãâ ½Ã ÆÄ¶ó¹ÌÅÍ resultType=json ÀÔ·Â*/
        urlBuilder.append("&" + URLEncoder.encode("areaIndex","UTF-8") + "=" + URLEncoder.encode("221251", "UTF-8")); /*ÃøÁ¤¼ÒÄÚµå*/
        urlBuilder.append("&" + URLEncoder.encode("controlnumber","UTF-8") + "=" + URLEncoder.encode("2019101109", "UTF-8")); /*ÃøÁ¤½Ã°£*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
		/* return.sb.toString(); */
        System.out.println(sb.toString());
    }

}
>>>>>>> 41ed8247ed57f732826ed185abaf0a63b816d2a7
