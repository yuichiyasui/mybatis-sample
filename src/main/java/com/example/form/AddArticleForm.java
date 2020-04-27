package com.example.form;

import lombok.Data;

@Data
public class AddArticleForm {

	private String name;
	private String url;
	private Integer selectedCategory[];
	
}
