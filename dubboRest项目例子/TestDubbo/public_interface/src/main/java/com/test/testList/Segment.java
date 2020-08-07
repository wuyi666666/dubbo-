package com.test.testList;

public class Segment<K, V> {
    private K result1;
    private V result2;

    public K getResult1() {
        return result1;
    }

    public Segment setResult1(K result1) {
        this.result1 = result1;
        return this;
    }

    public V getResult2() {
        return result2;
    }

    public Segment setResult2(V result2) {
        this.result2 = result2;
        return this;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "result1=" + result1 +
                ", result2=" + result2 +
                '}';
    }
}
