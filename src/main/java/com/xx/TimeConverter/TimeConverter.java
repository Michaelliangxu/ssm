package com.xx.TimeConverter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (!StringUtils.isEmpty(source)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return sdf.parse(source);
            } catch (ParseException e) {
                throw new RuntimeException("时间格式有问题");
            }
        } else {
            throw new NullPointerException("时间为空");
        }
    }
}
