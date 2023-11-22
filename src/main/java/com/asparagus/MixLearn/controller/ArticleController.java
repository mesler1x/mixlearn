package com.asparagus.MixLearn.controller;

import com.asparagus.MixLearn.exception.ArticleNotFoundException;
import com.asparagus.MixLearn.exception.UserNotFoundException;
import com.asparagus.MixLearn.model.Article;
import com.asparagus.MixLearn.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173/")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/article/{id}")
    Article articleById(@PathVariable Long id){
        return articleRepository.findById(id).orElseThrow(()->new ArticleNotFoundException(id));
    }

    @PostMapping("/article")
    Article newArticle(@RequestBody Article article){
        return articleRepository.save(article);
    }
}
