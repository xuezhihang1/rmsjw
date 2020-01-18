package com.itdr.dao;

import com.itdr.pojo.Product;
import com.itdr.pojo.Users;
import com.itdr.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {

    public Users selectByUserNameAndPassword(String username, String password) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "select id,username,password,type,create_time,update_time from neudeu_user where username= ? and password = ?";

        Users u = null;
        try {
            u = qr.query(sql,new BeanHandler<Users>(Users.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
}
