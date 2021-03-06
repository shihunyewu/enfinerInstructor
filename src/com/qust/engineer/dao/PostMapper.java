package com.qust.engineer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qust.engineer.pojo.Post;

public interface PostMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    List<Post> selectByTitle(String key);
    
    Post selectByPrimaryKeyRetrunShowcase(Integer pId);
    
    
    @Select("select * from tbl_post")
    List<Post> selectAllPost();
    
    @Select("select * from tbl_post ORDER BY p_time")
    List<Post> selectNewPost();
}