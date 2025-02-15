package br.com.medcheck.commons;

public record HttpResponse(
        int status,
        String message
) {
}
