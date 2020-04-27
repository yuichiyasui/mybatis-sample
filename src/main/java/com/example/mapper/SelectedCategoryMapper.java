package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.SelectedCategory;

@Mapper
public interface SelectedCategoryMapper {

	public void insert(SelectedCategory selectedCategory);
}
