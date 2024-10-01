package me.kimyongwoo.springbootdeveloper.repository;

import me.kimyongwoo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
