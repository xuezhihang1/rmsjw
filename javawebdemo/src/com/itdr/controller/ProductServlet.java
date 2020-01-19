package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;
import com.itdr.service.ProductService;
import com.itdr.service.UserService;
import com.itdr.service.impl.ProductServiceImpl;
import com.itdr.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/backed/product/*")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    private ProductService productService = new ProductServiceImpl();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");


        switch (split[split.length - 1]){
            case "getall":
                getAllProduct(request,response);
                break;
            case "totype":
                toType(request,response);
                break;
            case "fuzzysearch":
                fuzzysearch(request,response);
                break;
        }
    }

    //获取所有商品数据
    private void getAllProduct(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        ResponseCode allProduct = productService.getAllProduct();
        request.setAttribute("plist",allProduct);
        request.getRequestDispatcher("/WEB-INF/plist.jsp").forward(request,response);
    }

    //商品下架
    private void toType(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        ResponseCode allProduct = productService.toType(id);
        //把数据转成json格式返回
        response.getWriter().write(allProduct.toString());
    }
    //根据商品名称模糊查询
    private void fuzzysearch(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String key = request.getParameter("key");
        ResponseCode allProduct = productService.fuzzysearch(key);
        request.setAttribute("plist",allProduct);
        request.getRequestDispatcher("/WEB-INF/plist.jsp").forward(request,response);
    }
}
