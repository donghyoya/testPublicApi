package test.get.openapi.domain.kosiskr.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import test.get.openapi.domain.kosiskr.dto.KosiskrDto;
import test.get.openapi.global.utils.ConverterUtils;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class KosiskrService {

    private final RestTemplate restTemplate;
    Logger log = LoggerFactory.getLogger(KosiskrService.class);

    @Value("${openapi.kosiskr.serviceKey}")
    private String apiKey;

    @Value("${openapi.kosiskr.url}")
    private String url;

    public List<Map<String,Object>> ForestProducts(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON)); // JSON 응답 강제
        HttpEntity<String> entity = new HttpEntity<>(headers);

        URI uri = UriComponentsBuilder
                .fromHttpUrl(url)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103135559I+")
                .queryParam("objL1", "ALL")
                .queryParam("objL2", totalobjL2)
                .queryParam("format", "json")
                .queryParam("jsonVD", "Y")
                .queryParam("prdSe", "Y")
                .queryParam("newEstPrdCnt", "3")
                .queryParam("orgId", "136")
                .queryParam("tblId", "DT_136006_10878")
                .build()
                .toUri();


        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Map<String, Object>>>(){}
        );


        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            log.error("Failed to fetch data with status code: " + response.getStatusCode());
            return new ArrayList<>(); // 실패 시 빈 리스트 반환
        }
    }

    public List<Map<String, Object>>SeoulForestProducts(){
        URI uri = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103135567I+")
                .queryParam("objL1", seoulObjL1)
                .queryParam("objL2", seoulObjL2)
                .queryParam("format", "json")
                .queryParam("jsonVD", "Y")
                .queryParam("prdSe", "Y")
                .queryParam("newEstPrdCnt", "3")
                .queryParam("orgId", "136")
                .queryParam("tblId", "DT_136006_10894")
                .build()
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON)); // JSON 응답 강제
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Map<String, Object>>>(){}
        );


        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            log.error("Failed to fetch data with status code: " + response.getStatusCode());
            return new ArrayList<>(); // 실패 시 빈 리스트 반환
        }
    }

    public List<Map<String,Object>> BusanForestProducts(){
        URI uri = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103135562I+")
                .queryParam("objL1", "ALL")
                .queryParam("objL2", "ALL")
                .queryParam("format", "json")
                .queryParam("jsonVD", "Y")
                .queryParam("prdSe", "Y")
                .queryParam("newEstPrdCnt", "3")
                .queryParam("orgId", "136")
                .queryParam("tblId", "DT_136006_10895")
                .build()
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON)); // JSON 응답 강제
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Map<String, Object>>>(){}
        );


        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            log.error("Failed to fetch data with status code: " + response.getStatusCode());
            return new ArrayList<>(); // 실패 시 빈 리스트 반환
        }
    }

    /**
     *
     * @return
     */
    public List<Map<String, Object>> ForestProductsBam(){
        URI uri = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103133767I")
                .queryParam("objL1", "ALL")
                .queryParam("objL2", "ALL")
                .queryParam("format", "json")
                .queryParam("jsonVD", "Y")
                .queryParam("prdSe", "Y")
                .queryParam("newEstPrdCnt", "3")
                .queryParam("orgId", "136")
                .queryParam("tblId", "DT_136033_9534")
                .build()
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON)); // JSON 응답 강제
        HttpEntity<String> entity = new HttpEntity<>(headers);


        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Map<String, Object>>>(){}
        );

        return response.getBody();
    }




    private static String totalobjL2 = "13102135559X.192+13102135559X.196+13102135559X.199+13102135559X.200+13102135559X.202+13102135559X.203+13102135559X.205+13102135559X.206+13102135559X.208+13102135559X.209+13102135559X.211+13102135559X.212+13102135559X.214+13102135559X.215+13102135559X.217+13102135559X.218+13102135559X.220+13102135559X.221+13102135559X.223+13102135559X.224+13102135559X.226+13102135559X.227+13102135559X.229+13102135559X.230+13102135559X.232+13102135559X.233+13102135559X.235+13102135559X.236+13102135559X.239+13102135559X.240+13102135559X.242+13102135559X.243+13102135559X.245+13102135559X.246+13102135559X.248+13102135559X.249+13102135559X.251+13102135559X.252+13102135559X.254+13102135559X.255+13102135559X.257+13102135559X.258+13102135559X.261+13102135559X.262+13102135559X.264+13102135559X.265+13102135559X.267+13102135559X.268+13102135559X.270+13102135559X.271+13102135559X.273+13102135559X.274+13102135559X.276+" +
            "13102135559X.277+13102135559X.279+13102135559X.280+13102135559X.283+13102135559X.284+13102135559X.286+13102135559X.287+13102135559X.289+13102135559X.290+13102135559X.293+13102135559X.294+13102135559X.297+13102135559X.298+13102135559X.302+13102135559X.303+13102135559X.306+13102135559X.307+13102135559X.309+13102135559X.310+13102135559X.312+13102135559X.313+13102135559X.315+13102135559X.316+13102135559X.318+13102135559X.319+13102135559X.321+13102135559X.322+13102135559X.324+13102135559X.325+13102135559X.328+13102135559X.329+13102135559X.331+13102135559X.332+13102135559X.334+13102135559X.335+13102135559X.337+13102135559X.338+13102135559X.340+13102135559X.341+13102135559X.343+13102135559X.344+13102135559X.346+13102135559X.347+13102135559X.349+13102135559X.350+13102135559X.352+13102135559X.353+";
    private static String seoulObjL1 ="13102135567119+13102135567120+13102135567121+13102135567122+13102135567123+13102135567124+13102135567125+13102135567126+13102135567127+13102135567128+13102135567129+13102135567130+13102135567131+13102135567132+13102135567133+13102135567134+13102135567135+13102135567136+13102135567137+13102135567138+13102135567139+13102135567140+13102135567141+13102135567142+13102135567143+13102135567144+13102135567145+13102135567146+13102135567147+13102135567148+13102135567149+13102135567150+13102135567151+13102135567152+13102135567153+13102135567154+13102135567155+13102135567156+13102135567157+13102135567158+13102135567159+13102135567160+13102135567161+13102135567162+13102135567163+13102135567164+13102135567165+13102135567166+13102135567167+13102135567168+13102135567169+13102135567170+13102135567171+13102135567172+13102135567173+13102135567174+13102135567175+13102135567176+13102135567177+13102135567178" +
            "+13102135567179+13102135567180+13102135567181+13102135567182+13102135567183+13102135567184+13102135567185+13102135567186+13102135567187+13102135567188+13102135567189+13102135567190+13102135567191+13102135567192+13102135567193+13102135567194+13102135567195+13102135567196+13102135567197+13102135567198+13102135567199+13102135567200+13102135567201+13102135567202+13102135567203+13102135567204+13102135567205+13102135567206+13102135567207+13102135567208+13102135567209+13102135567210+13102135567211+13102135567212+13102135567213+13102135567214+13102135567215+13102135567216+13102135567217+13102135567218+";

    private static String seoulObjL2 = "13102135567X.5+13102135567X.6+13102135567X.8+13102135567X.9+13102135567X.11+13102135567X.12+13102135567X.14+13102135567X.15+13102135567X.17+13102135567X.18+13102135567X.20+13102135567X.21+13102135567X.23+13102135567X.24+13102135567X.26+13102135567X.27+13102135567X.29+13102135567X.30+13102135567X.32+13102135567X.33+13102135567X.35+13102135567X.36+13102135567X.38+13102135567X.39+13102135567X.41+13102135567X.42+13102135567X.44+13102135567X.45+13102135567X.47+13102135567X.48+13102135567X.50+13102135567X.51+13102135567X.53+13102135567X.54+13102135567X.56+13102135567X.57+13102135567X.59+13102135567X.60+13102135567X.62+13102135567X.63+13102135567X.65+13102135567X.66+13102135567X.68+13102135567X.69+13102135567X.71+13102135567X.72+13102135567X.74+13102135567X.75+13102135567X.77+13102135567X.78+";


}
