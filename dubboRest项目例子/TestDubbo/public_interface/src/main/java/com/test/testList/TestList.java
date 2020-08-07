package com.test.testList;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestList {
    private static List<MyUser> list;
    static{
        list = new ArrayList<>();
        list.add(new MyUser(1, "zhangsan", 111));
        list.add(new MyUser(2, "lisi", 222));
        list.add(new MyUser(3, "wangwu", 333));
    }

    public static void main(String[] args) {
        List<Segment<String, Integer>> collect = list.stream().map((Function<MyUser, Segment<String, Integer>>) myUser -> {
            return new Segment<String, Integer>().setResult1(myUser.getName()).setResult2(myUser.getPhone());
        }).collect(Collectors.toList());
        Wrapper wrapper = new Wrapper<Segment<String, Integer>>().setList(collect);
        System.out.println(JSONObject.toJSONString(wrapper));
        System.out.println(list);
    }
}
