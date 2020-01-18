package com.itdr.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Util {

    private static ComboPooledDataSource com = new ComboPooledDataSource();

    public static ComboPooledDataSource getCom(){
        return com;
    }
}
