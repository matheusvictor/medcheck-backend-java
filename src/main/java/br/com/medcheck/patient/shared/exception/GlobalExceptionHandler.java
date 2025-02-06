package br.com.medcheck.patient.shared.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<BusinessExceptionDTO> handleNotFoundException(final NotFoundException ex) {
        final BusinessExceptionDTO businessExceptionDTO = new BusinessExceptionDTO(ex.getMessage(), HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(businessExceptionDTO);
    }

//    @ResponseBody
//    @ExceptionHandler(EntityNotFoundException.class)
//    public ResponseEntity<Object> handleBusinessException(
//            final EntityNotFoundException ex,
//            final WebRequest request) {
//
//        final Map<String, Object> body = Map.of(
//                "message", "Entity not found",
//                "error", ex.getMessage()
//        );
//
//        return new ResponseEntity<>(body, HttpStatus.valueOf(HttpStatus.NOT_FOUND.value()));
//    }
}