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
        /*urlBuilder.append("&" + URLEncoder.encode("serviceKey","UTF-8") + "=" + URLEncoder.encode("����Ű(URL Encode)", "UTF-8")); /*�������������п��� ���� ����Ű*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*��������ȣ*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("5", "UTF-8")); /*�� ������ ��� ��*/
        urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*JSON������� ȣ�� �� �Ķ���� resultType=json �Է�*/
        urlBuilder.append("&" + URLEncoder.encode("areaIndex","UTF-8") + "=" + URLEncoder.encode("221251", "UTF-8")); /*�������ڵ�*/
        urlBuilder.append("&" + URLEncoder.encode("controlnumber","UTF-8") + "=" + URLEncoder.encode("2019101109", "UTF-8")); /*�����ð�*/
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
