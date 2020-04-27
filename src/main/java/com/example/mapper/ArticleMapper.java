package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Article;

@Mapper
public interface ArticleMapper {

	public List<Article> findAll();

	public void insert(Article article);

	public void deleteById(Integer id);

//	public List<Article> findAllWithCategory();
}
