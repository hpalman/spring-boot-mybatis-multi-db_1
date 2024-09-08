package com.example.mybatisdemo.service;

import com.example.mybatisdemo.model.UserMySQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMySQLService {

    private final SqlSession sqlSession;

    public UserMySQLService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public UserMySQL findById(Long id) {
        return sqlSession.selectOne("UserMapperMySQL.findById", id);
    }

    public List<UserMySQL> findAll() {
        return sqlSession.selectList("UserMapperMySQL.findAll");
    }

    public void save(UserMySQL user) {
        if (user.getId() == null) {
            sqlSession.insert("UserMapperMySQL.insert", user);
        } else {
            sqlSession.update("UserMapperMySQL.update", user);
        }
    }

    public void delete(Long id) {
        sqlSession.delete("UserMapperMySQL.delete", id);
    }
}
