package com.test.callback.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifyImpl /*implements Notify*/{
    public Map<Integer, String> map = new HashMap<>();
    public void onInvoke(){
        map.put(0, "onInvoke");
    }
    public void onReturn(String msg, Integer id) {
        map.put(id, msg+" onReturn");
    }
    public void onThrow(Throwable ex, Integer id) {

    }
}
