package com.zcwork.zfc.exception;


import com.zcwork.zfc.api.CommonResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult ExceptionHandler(Exception e) {
        CommonResult commonResult;
        e.printStackTrace();
        // 从异常对象中拿到ObjectError对象
        if(e instanceof Exception ){
            ObjectError objectError = ((MethodArgumentNotValidException)e).getBindingResult().getAllErrors().get(0);
            // 然后提取错误提示信息进行返回

           commonResult = CommonResult.validateFailed(objectError.getDefaultMessage());

            return commonResult;
        }

        commonResult = CommonResult.failed(e.getMessage());

        return commonResult;
    }

    @ExceptionHandler(BusinessException.class)
    public CommonResult ExceptionHandler(BusinessException e) {
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());

    }



}