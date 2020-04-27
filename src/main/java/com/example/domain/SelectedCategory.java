package com.example.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SelectedCategory {

	private Integer id;
	private Integer categoryId;
	private Integer articleId;
	private Category category;
}
