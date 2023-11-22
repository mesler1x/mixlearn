package com.asparagus.MixLearn.repository;

import com.asparagus.MixLearn.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
