package test.get.openapi.domain.kosiskr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KosiskrDto {

    @JsonProperty(value = "TBL_NM", defaultValue = "null")
    private String tableNm;

    @JsonProperty(value = "PRD_DE", defaultValue = "null")
    private String periodDate;

    @JsonProperty(value = "TBL_ID", defaultValue = "null")
    private String tableId;

    @JsonProperty(value = "ITM_NM",defaultValue = "null")
    private String itemNm;

    @JsonProperty(value = "ITM_ID",defaultValue = "null")
    private String itemId;

    @JsonProperty(value = "UNIT_NM",defaultValue = "null")
    private String unitNm;

    @JsonProperty(value = "ORG_ID",defaultValue = "null")
    private String orgId;

    @JsonProperty(value = "C1_OBJ_NM", defaultValue = "null")
    private String c1ObjNm;

    @JsonProperty(value = "C2_OBJ_NM", defaultValue = "null")
    private String c2ObjNm;

    @JsonProperty(value = "DT", defaultValue = "null")
    private String data;

    @JsonProperty(value = "PRD_SE", defaultValue = "null")
    private String periodSe;

    @JsonProperty(value = "C2", defaultValue = "null")
    private String c2;

    @JsonProperty(value = "C1", defaultValue = "null")
    private String c1;

    @JsonProperty(value = "C1_NM", defaultValue = "null")
    private String c1Nm;

    @JsonProperty(value = "C2_NM", defaultValue = "null")
    private String c2Nm;

    @JsonProperty(value = "LST_CHN_DE", defaultValue = "null")
    private String lastChangedDate;

    // Getters and Setters

}