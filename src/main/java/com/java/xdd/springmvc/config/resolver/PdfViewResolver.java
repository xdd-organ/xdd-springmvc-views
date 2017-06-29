package com.java.xdd.springmvc.config.resolver;

import com.java.xdd.springmvc.config.view.PdfView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * PDF视图解析器
 */
public class PdfViewResolver implements ViewResolver {
    public PdfViewResolver() {
        System.out.println("PdfViewResolver");
    }

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return new PdfView();
    }
}
