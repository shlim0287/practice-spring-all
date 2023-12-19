package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Slf4j
public class StringToIntegerConverter implements Converter<String,Integer> {
    @Override
    public Integer convert(String source) {
        log.info("convert source={}",source);
        return Integer.valueOf(source);
    }
}
