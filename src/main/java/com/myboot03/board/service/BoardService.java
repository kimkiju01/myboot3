package com.myboot03.board.service;
import java.util.List;
import java.util.Map;

import com.myboot03.board.vo.ArticleVO;



public interface BoardService {
	public List<ArticleVO> selectAllArticlesList() throws Exception;
	public int insertNewArticle(Map articleMap) throws Exception;
	public ArticleVO selectArticle(int articleNO) throws Exception;
	//public Map viewArticle(int articleNO) throws Exception;
	public void updateArticle(Map articleMap) throws Exception;
	public void deleteArticle(int articleNO) throws Exception;
}
