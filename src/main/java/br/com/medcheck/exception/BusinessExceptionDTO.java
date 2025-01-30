package br.com.medcheck.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessExceptionDTO {

    private String message;
    private int httpCode;

    public BusinessExceptionDTO(String message, int httpCode) {
        this.message = message;
        this.httpCode = httpCode;
    }

}
