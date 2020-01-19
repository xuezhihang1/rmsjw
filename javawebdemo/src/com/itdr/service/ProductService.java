package com.itdr.service;

import com.itdr.common.ResponseCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ProductService {
    ResponseCode getAllProduct();

    ResponseCode toType(String id);

    ResponseCode fuzzysearch(String key);
}
