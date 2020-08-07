package com.test.testList;

import java.util.List;

public class Wrapper<T> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Wrapper setList(List<T> list) {
        this.list = list;
        return this;
    }

    public static class Wrapper1{

    }
}
