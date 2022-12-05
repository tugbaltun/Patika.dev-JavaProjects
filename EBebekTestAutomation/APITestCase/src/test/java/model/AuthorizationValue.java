package model;

import lombok.Data;

@Data
public class AuthorizationValue {
    private String value;
    private String type;
    private String keyName;
    private String urlMatcher;
}
