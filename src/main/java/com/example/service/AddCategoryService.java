package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Category;
import com.example.mapper.CategoryMapper;

@Service
@Transactional
public class AddCategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	public void addCategory(String name) {
		categoryMapper.insert(name);
	}
	public List<Category> findAllCategory(){
		return categoryMapper.findAll();
	}
	
}
