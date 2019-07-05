package com.xx.CustomerExcption;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        CustomException customException;
        if (ex instanceof CustomException)
            customException =(CustomException) ex;
        else {
            customException=new CustomException("页面异常");
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("erro",customException.getMessage());
        mv.setViewName("erro");
        return mv;
    }
}
