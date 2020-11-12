package com.spring.weather;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {

    	String a = "부산진구";
    	System.out.println(api11(a));
        
    }
    
    static String api11(String a) throws IOException {
    	StringBuilder urlBuilder = new StringBuilder("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty"); /*URL*/
        urlBuilder.append("?ServiceKey=QVWDM9ZUKGDJ%2BZ46qFzKBatWi3Kc8Fp1WdNpIaERUzVjt0Xq4ha9p7BYowPw079DWuvSKjQrXlIFSSI8%2FhvE0w%3D%3D"); /*Service Key*/
        urlBuilder.append("&numOfRows=1"); /*                */
        urlBuilder.append("&pageNo=1"); /*         ȣ*/
        urlBuilder.append("&stationName="+a); /*        ̸ */
        urlBuilder.append("&dataTerm=DAILY"); /*  û      ͱⰣ ( Ϸ  : DAILY,  Ѵ  : MONTH, 3   : 3MONTH)*/
        urlBuilder.append("&ver=1.3"); /*                         */
        urlBuilder.append("&_returnType=json"); /*                         */
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
		return sb.toString();
	}
    
    
}