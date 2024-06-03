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

    @Value("${openpai.kosiskr}")
    private String url;

    public String  ForestProducts(){

       URI uri = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("method", "getList")
                .queryParam("apiKey", apiKey)
                .queryParam("itmId", "13103135559I+")
                .queryParam("objL1", "ALL")
                .queryParam("objL2",objL2)
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

    /**
     *
     * @return
     */
    public String ForestProductsBam(){
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

        return restTemplate.getForObject(uri, String.class);
    }

    private static String objL2 = "13102135559X.192+13102135559X.196+13102135559X.199+13102135559X.200+13102135559X.202+13102135559X.203+13102135559X.205+13102135559X.206+13102135559X.208+13102135559X.209+13102135559X.211+13102135559X.212+13102135559X.214+13102135559X.215+13102135559X.217+13102135559X.218+13102135559X.220+13102135559X.221+13102135559X.223+13102135559X.224+13102135559X.226+13102135559X.227+13102135559X.229+13102135559X.230+13102135559X.232+13102135559X.233+13102135559X.235+13102135559X.236+13102135559X.239+13102135559X.240+13102135559X.242+13102135559X.243+13102135559X.245+13102135559X.246+13102135559X.248+13102135559X.249+13102135559X.251+13102135559X.252+13102135559X.254+13102135559X.255+13102135559X.257+13102135559X.258+13102135559X.261+13102135559X.262+13102135559X.264+13102135559X.265+13102135559X.267+13102135559X.268+13102135559X.270+13102135559X.271+13102135559X.273+13102135559X.274+13102135559X.276+" +
            "13102135559X.277+13102135559X.279+13102135559X.280+13102135559X.283+13102135559X.284+13102135559X.286+13102135559X.287+13102135559X.289+13102135559X.290+13102135559X.293+13102135559X.294+13102135559X.297+13102135559X.298+13102135559X.302+13102135559X.303+13102135559X.306+13102135559X.307+13102135559X.309+13102135559X.310+13102135559X.312+13102135559X.313+13102135559X.315+13102135559X.316+13102135559X.318+13102135559X.319+13102135559X.321+13102135559X.322+13102135559X.324+13102135559X.325+13102135559X.328+13102135559X.329+13102135559X.331+13102135559X.332+13102135559X.334+13102135559X.335+13102135559X.337+13102135559X.338+13102135559X.340+13102135559X.341+13102135559X.343+13102135559X.344+13102135559X.346+13102135559X.347+13102135559X.349+13102135559X.350+13102135559X.352+13102135559X.353+";
}
