package test.get.openapi.domain.kosiskr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class KosiskrService {

    private final RestTemplate restTemplate;

    @Value("${openapi.kosiskr}")
    private String apiKey;

    public String  testService(){

        String apiUrl = "https://kosis.kr/openapi/Param/statisticsParameterData.do";
        URI uri = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103135559I+")
                .queryParam("objL1", "ALL")
                // Add all other query parameters here
                .queryParam("format", "json")
                .queryParam("jsonVD", "Y")
                .queryParam("prdSe", "Y")
                .queryParam("newEstPrdCnt", "3")
                .queryParam("orgId", "136")
                .queryParam("tblId", "DT_136006_10878")
                .build()
                .toUri();

        return restTemplate.getForObject(uri, String.class);
    }
}
