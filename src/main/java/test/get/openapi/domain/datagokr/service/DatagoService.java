package test.get.openapi.domain.datagokr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class DatagoService {

    @Value("${openapi.datagokr.serviceKey}")
    private String serviceKey;

    private final RestTemplate restTemplate;


    public String getStatistics() {
        URI uri = UriComponentsBuilder.fromHttpUrl("http://kosis.kr/openapi/Data/statisticsList.do")
                .queryParam("serviceKey", serviceKey)
                .queryParam("vwCd", "MT_ZTITLE")
                .queryParam("parentListId", "A")
                .queryParam("format", "json")
                .queryParam("method", "getList")
                .queryParam("jsonVD", "Y")
                .build()
                .toUri();

        return restTemplate.getForObject(uri, String.class);
    }
}
