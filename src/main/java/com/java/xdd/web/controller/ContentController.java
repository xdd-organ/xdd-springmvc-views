package com.java.xdd.web.controller;

import com.java.xdd.web.pojo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ContentController {

    @RequestMapping(value = {"/getDemo"}, method = RequestMethod.GET)
    public Object getDemo(Model model){//Model model
        Map<String, String> aa = new HashMap<String, String>();
        aa.put("a", "1");
        aa.put("b", "2");
        aa.put("c", "3");
        //model.addAllAttributes(aa);

        List<Article> articles = new ArrayList<Article>();
        for (int i = 0; i < 5; i++) {
            Article article = new Article();
            article.setTitle("title" + i);
            article.setContent("content" + i);
            articles.add(article);
        }
        //model.addAllAttributes(articles);
        return articles;
    }
}