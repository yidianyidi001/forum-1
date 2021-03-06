package com.jyl.springboot_forum.mapper;


import com.jyl.springboot_forum.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface QuestionMapper {

    //发布文章
    void create(Question question);

    //查询文章列表
    List<Question> list();

    //查询指定用户发布的文章列表
    List<Question> list2(Integer id);

    //查询指定id的单个问题详情
    Question getById(Integer id);

    //更新问题
    void update(Question question);

    //增加阅读数
    void addviewCount(Integer id);

    //增加回复数
    void addCommentCount(Long parentId);

    //按标签数组 查询对应相关问题
    List<Question> selectRelated(Question question);

    //按标签差问题列表
    List<Question> listbytag(String tag);

    //根据问题id来查询这个问题的发布人id
    Question getUserIdByParentId(Long parentId);

    //搜索功能
    List<Question> searchTitle(String search);
}