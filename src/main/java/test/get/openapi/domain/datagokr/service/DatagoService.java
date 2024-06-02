package test.get.openapi.domain.datagokr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class DatagoService {

    @Value("${openapi.datagokr.serviceKey}")
    private String serviceKey;

    private final RestTemplate restTemplate;



    public String getStatistics() throws UnsupportedEncodingException {
        String encodedServiceKey = URLEncoder.encode(serviceKey, StandardCharsets.UTF_8.toString());
        try{
            StringBuilder urlBuilder = new StringBuilder("http://kosis.kr/openapi/Data/statisticsList.do"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("vwCd","UTF-8") + "=" + URLEncoder.encode("MT_ZTITLE", "UTF-8")); /*서비스뷰 코드 · MT_ZTITLE : 주제별 통계 · MT_OTITLE : 기관별 통계 · MT_CHOSUN_TITLE : 광복이전통계 (1908~1943) · MT_HANKUK_TITLE : 대한민국통계연감 · MT_STOP_TITLE : 작성중지통계 · MT_ATITLE01 : 지역통계 (주제별) · MT_ATITLE02 : 지역통계 (기관별) · MT_GTITLE01 : e-지방지표(주제별) · MT_ETITLE : 영문KOSIS*/
            urlBuilder.append("&" + URLEncoder.encode("parentListId","UTF-8") + "=" + URLEncoder.encode("A", "UTF-8")); /*시작목록 ID*/
            urlBuilder.append("&" + URLEncoder.encode("format","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과 유형*/
            urlBuilder.append("&" + URLEncoder.encode("method","UTF-8") + "=" + URLEncoder.encode("getList", "UTF-8")); /*호출메서드*/
            urlBuilder.append("&" + URLEncoder.encode("jsonVD","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*JSON 키값 쌍따옴표 유무*/
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
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
