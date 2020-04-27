package com.example.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 記事のドメインクラス.
 * 
 * @author yuichi
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	/** ID */
	@Id
	private Integer id;
	/** 記事名 */
	private String name;
	/** URL */
	private String url;
	/** カテゴリーリスト */
	private List<SelectedCategory> selectedCategoryList;

}
