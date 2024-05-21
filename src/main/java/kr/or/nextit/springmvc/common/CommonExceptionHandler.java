package kr.or.nextit.springmvc.common;

import kr.or.nextit.springmvc.exception.MemberNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice("kr.or.nextit.springmvc")
public class CommonExceptionHandler {
    @ExceptionHandler(MemberNotFoundException.class)
    public String handleMemberNotFoundExeption() {
        return "error/memberNotFound";
    }

}
