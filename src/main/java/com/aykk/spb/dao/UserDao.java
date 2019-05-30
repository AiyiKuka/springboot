package com.aykk.spb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.aykk.spb.bean.User;

/**
 * 
 * spring data jpa 默认预先生成了一些基本的CURD的方法
 * 
 * •mapper : 在接口上添加了这个注解表示这个接口是基于注解实现的CRUD。
 * <p>
 * •Results: 返回的map结果集property 表示User类的字段，column 表示对应数据库的字段。
 * <p>
 * •Param:sql条件的字段。
 * <p>
 * •Insert、Select、Update、Delete:对应数据库的增、查、改、删。
 * 
 * 
 * @author Aiyikuka
 *
 */
@Mapper
public interface UserDao {

	@Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
	void addUser(User user);

	@Update("update t_user set name=#{name},age=#{age} where id=#{id}")
	void updateUser(User user);

	@Delete("delete from t_user where id=#{id}")
	void deleteUser(int id);

	@Select("select id,name,age from t_user where name=#{name}")
	User findByName(@Param("name") String userName);

	@Select("select id,name,age from t_user")
	List<User> findAll();
}
