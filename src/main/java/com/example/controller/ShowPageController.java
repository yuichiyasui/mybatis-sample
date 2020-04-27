package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.AddArticleForm;
import com.example.service.AddCategoryService;
import com.example.service.ArticleService;

@Controller
public class ShowPageController {

	@Autowired
	private ArticleService articleService;
	@Autowired
	private AddCategoryService addCategoryService;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		return "contents/index.html";
	}

	@RequestMapping("/showAddArticle")
	public String showAddArticles(Model model) {
		model.addAttribute("categoryList", addCategoryService.findAllCategory());
		return "contents/add_article.html";
	}

	@RequestMapping("/getAllArticles")
	public String getAllArticles(Model model) {
		model.addAttribute("articles", articleService.findAllArticles());
//		model.addAttribute("withCategory", articleService.findAllArticlesWithCategory());
		return "contents/articles.html";
	}

	@RequestMapping("/addArticle")
	public String addArticle(AddArticleForm form) {
		articleService.insert(form);
		return "redirect:/getAllArticles";
	}
	
	@RequestMapping("/deleteArticle")
	public String deleteArticle(Integer id) {
		articleService.deleteArticle(id);
		return "redirect:/getAllArticles";
	}
	
	@RequestMapping("/showAddCategory")
	public String showAddCategory(Model model) {
		model.addAttribute("categoryList", addCategoryService.findAllCategory());
		return "contents/add_category.html";
	}
	
	@RequestMapping("/addCategory")
	public String addCategory(String name) {
		addCategoryService.addCategory(name);
		return "redirect:/showAddCategory";
	}
}
