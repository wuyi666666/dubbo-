package com.test.run;


import com.test.wy.RestService;


public class RestServiceImpl implements RestService {

    public String getUser(int id) {
        System.out.println(id);
        return "你的ID是："+id;
    }
}
