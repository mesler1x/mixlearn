package com.asparagus.MixLearn.services;

import com.asparagus.MixLearn.model.Article;
import com.asparagus.MixLearn.model.Message;
import com.asparagus.MixLearn.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public Optional<Article> findOne(Long id) {
        Optional<Article> foundArticle = articleRepository.findById(id);
        return foundArticle;
    }

    @Transactional
    public Article save(Article article){
        return articleRepository.save(article);
    }
}
