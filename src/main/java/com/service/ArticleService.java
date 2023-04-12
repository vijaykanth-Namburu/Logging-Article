package com.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.article.Article;


@Service
public class ArticleService {
	
	
	Logger logger = LoggerFactory.getLogger(ArticleService.class);
	
	public List<Article> getArticles(){
		
		logger.debug("Error in the getArticles() method");
		return Arrays.asList(new Article(1,"java"),new Article(2,"springboot"));
		
	}

}
