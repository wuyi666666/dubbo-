package com.test.callback;

public interface Notify {
    void onReturn(Integer id);
    void onThrow(Throwable ex, Integer id);
}
