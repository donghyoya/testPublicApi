package test.get.openapi.global.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import test.get.openapi.domain.kosiskr.dto.KosiskrDto;

import java.io.IOException;

public class ConverterUtils {
    public static String json2Html(String htmlContent) {
        Document doc = Jsoup.parse(htmlContent);
        Element scriptElement = doc.select("script[type='application/json']").first();
        return scriptElement != null ? scriptElement.html() : null;
    }

    public static KosiskrDto convertJsonToDto(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, KosiskrDto.class);
    }
}