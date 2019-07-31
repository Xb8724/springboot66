package com.qf.springbootmybatis.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qf.springbootmybatis.entity.ResultBean;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ControllerAdvice
public class GolbalExceptionHandler {

    @ExceptionHandler(Exception.class)
//    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultBean handlerException(Exception exception){
        exception.printStackTrace();

        return new ResultBean("404","您的输入错误");
    }
   /* public ResultBean validationErrorHandler(BindException ex) throws JsonProcessingException {
        //先获取BindingResult
        BindingResult bindingResult=ex.getBindingResult();
        //获取错误信息
        List<FieldError> fieldErrors=bindingResult.getFieldErrors();
        //组装异常信息
        Map<String,String> message=new HashMap<>();
        for (FieldError fieldError : fieldErrors) {
            message.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        //将map转换为json
        ObjectMapper objectMapper=new ObjectMapper();
        String json= objectMapper.writeValueAsString(message);
        //返回错误信息
        return  new ResultBean("400",json);
    }*/

}
