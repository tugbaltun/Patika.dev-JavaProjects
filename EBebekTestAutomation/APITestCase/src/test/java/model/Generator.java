package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Generator {

    @JsonProperty("spec")
    private String spec;

    @JsonProperty("options")
    private Options options;

    @JsonProperty("swaggerUrl")
    private String swaggerUrl;

    @JsonProperty("authorizationValue")
    private AuthorizationValue authorizationValue;

    @JsonProperty("usingFlattenSpec")
    private boolean usingFlattenSpec;

    @JsonProperty("securityDefinition")
    private SecurityDefinition securityDefinition;
}
