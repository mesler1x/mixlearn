package com.asparagus.MixLearn.controller;

import com.asparagus.MixLearn.exception.ArticleNotFoundException;
import com.asparagus.MixLearn.model.Article;
import com.asparagus.MixLearn.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article/{id}")
    Article articleById(@PathVariable Long id){
        return articleService.findOne(id).orElseThrow(()->new ArticleNotFoundException(id));
    }

    @PostMapping("/article")
    Article newArticle(@RequestBody Article article){
        return articleService.save(article);
    }

    @GetMapping("/articles")
    List<Article> articleList(){
        return articleService.findAll();
    }

    @GetMapping("/articles")
    List<Article> articleList(){
        return articleRepository.findAll();
    }
}
