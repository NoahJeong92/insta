package com.jth.study.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jth.study.dto.Article;

@Mapper
public interface ArticleDao {
	boolean modifyArticle(@Param("id") int id, @Param("title") String title, @Param("body") String body);

	void writeArticle(@Param("boardId") int boardId, @Param("memberId") int memberId, @Param("title") String title, @Param("body") String body);

	Article getArticleById(@Param("id") int id);
	
	int getLastInsertId();

	void deleteArticleById(@Param("id") int id);
}