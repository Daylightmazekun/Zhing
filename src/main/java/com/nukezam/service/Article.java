package com.nukezam.service;

import java.util.List;

public interface Article {
    List<Article> findArticleByUserId(String userId);
}
