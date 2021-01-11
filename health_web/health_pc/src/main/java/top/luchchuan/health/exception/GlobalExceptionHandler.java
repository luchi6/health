package top.luchchuan.health.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.luchchuan.health.entity.Result;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Result exceptionHandle(Exception ex){
        ex.printStackTrace();
        String errorMsg = ex.getMessage();
        if(errorMsg.length() > 200)
            return new Result(false,errorMsg.substring(0,200) + "...");
        else
            return new Result(false,errorMsg);
    }

}
