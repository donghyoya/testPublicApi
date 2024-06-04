package test.get.openapi.domain.kosiskr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.get.openapi.domain.kosiskr.dto.KosiskrDto;
import test.get.openapi.domain.kosiskr.service.KosiskrService;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/kosiskr")
public class KosiskrApi {

    @Autowired
    private KosiskrService kosiskrService;

    @GetMapping("/ForestProducts")
    public ResponseEntity<List<Map<String, Object>>> getForestProducts() {
        List<Map<String,Object>> data = kosiskrService.ForestProducts();
        return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
    }

    @GetMapping("/ForestProducts/seoul")
    public ResponseEntity<List<Map<String,Object>>>getSeoulForestProducts(){
        List<Map<String,Object>> data = kosiskrService.SeoulForestProducts();
        return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
    }

    @GetMapping("/ForestProducts/deagu")
    public ResponseEntity<List<Map<String,Object>>>getDeaguForestProducts(){
        List<Map<String,Object>> data = kosiskrService.DaeguForestProducts();
        return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
    }

    @GetMapping("/ForestProducts/incheon")
    public ResponseEntity<List<Map<String,Object>>>getIncheonForestProducts(){
        List<Map<String,Object>> data = kosiskrService.IncheonForestProducts();
        return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
    }


}
