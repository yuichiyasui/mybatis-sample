package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Article;
import com.example.domain.SelectedCategory;
import com.example.form.AddArticleForm;
import com.example.mapper.ArticleMapper;
import com.example.mapper.SelectedCategoryMapper;

@Service
@Transactional
public class ArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private SelectedCategoryMapper selectedCategoryMapper;

	public List<Article> findAllArticles() {
		List<Article> articleList = articleMapper.findAll();
		return articleList;
	}

//	public List<Article> findAllArticlesWithCategory() {
//		List<Article> articleList = articleMapper.findAllWithCategory();
//		return articleList;
//	}

	public void insert(AddArticleForm form) {
		Article article = new Article();
		article.setName(form.getName());
		article.setUrl(form.getUrl());
		articleMapper.insert(article);
		for (Integer categoryId : form.getSelectedCategory()) {
			SelectedCategory selectedCategory = SelectedCategory.builder().categoryId(categoryId)
					.articleId(article.getId()).build();
			selectedCategoryMapper.insert(selectedCategory);
		}
	}

	public void deleteArticle(Integer id) {
		articleMapper.deleteById(id);
	}

}
