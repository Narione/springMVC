package kr.or.nextit.springmvc.exception;

public class DuplicateMemberException extends RuntimeException {
    public DuplicateMemberException(String message){
        super(message);
    }
}
