package test.get.openapi.domain.datagokr.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.get.openapi.domain.datagokr.service.DatagoService;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/datagokr")
@RequiredArgsConstructor
public class DatagokrApi {

    private final DatagoService datagoService;

    @GetMapping("/api/statistics")
    public ResponseEntity<String> fetchStatistics() throws UnsupportedEncodingException {
        return ResponseEntity.ok(datagoService.getStatistics());
    }
}
