package me.kimyeseo.springbootdeveloper.repository;

import me.kimyeseo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
