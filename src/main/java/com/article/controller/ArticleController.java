package com.article.controller;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.article.Article;
import com.service.ArticleService;


@Controller
public class ArticleController {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(ArticleService.class);
	  
	@Autowired
	private ArticleService service;
	
	@GetMapping("/articles")
    public List<Article> getArticles() {
        logger.info("Error in controller get Articles() Method");
		return service.getArticles();
        
    }

}
