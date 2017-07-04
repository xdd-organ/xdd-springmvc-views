package com.java.xdd.web.controller;

import com.java.xdd.web.pojo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

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

    @RequestMapping(value = {"/getDemo2"}, method = RequestMethod.GET)
    public String getDemo2(Model model){
        return "stream";
    }

    @RequestMapping(value = {"/getDemo1"}, produces = "text/event-stream", method = RequestMethod.GET)
    @ResponseBody
    public String getDemo1(Model model, HttpServletResponse response){
        response.setContentType("text/event-stream; charset=UTF-8");
        //response.setCharacterEncoding("UTF-8");
        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "123" + random.nextInt();
    }

}