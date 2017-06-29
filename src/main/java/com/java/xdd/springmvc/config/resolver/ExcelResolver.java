package com.java.xdd.springmvc.config.resolver;

import com.java.xdd.springmvc.config.view.ExcelView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Excel视图解析器
 */
public class ExcelResolver  implements ViewResolver {
    public ExcelResolver() {
        System.out.println("ExcelResolver");
    }

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return new ExcelView();
    }
}
