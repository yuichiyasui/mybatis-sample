package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Category;

@Mapper
public interface CategoryMapper {

	public void insert(String name);
	
	public List<Category> findAll();
}
