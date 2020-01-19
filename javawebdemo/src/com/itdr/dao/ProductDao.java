package com.itdr.dao;

import com.itdr.pojo.Product;
import com.itdr.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDao {

    public List<Product> selectAll(){
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "select id,pname,price,pnum,ptype,create_time,update_time from neudeu_product";

        List<Product> query = null;
        try {
            query = qr.query(sql,new BeanListHandler<Product>(Product.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    public Product selectById(int i) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "select id,pname,price,pnum,ptype,create_time,update_time from neudeu_product where id = ?";

        Product query = null;
        try {
            query = qr.query(sql,new BeanHandler<Product>(Product.class),i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    public int updateById(int i) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "update neudeu_product set ptype = 1,update_time=now() where id = ?";

        int m = 0;
        try {
            m = qr.update(sql,i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }

    public List<Product> selectByPname(String key) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "select id,pname,price,pnum,ptype,create_time,update_time from neudeu_product where pname like ?";

        List<Product> query = null;
        try {
            query = qr.query(sql,new BeanListHandler<Product>(Product.class),key);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
}
