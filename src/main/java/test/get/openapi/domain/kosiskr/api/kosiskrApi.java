package test.get.openapi.domain.kosiskr.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kosiskr")
public class kosiskrApi {

    @Value("${openapi.kosiskr.serviceKey")
    private String serviceKey;


}
