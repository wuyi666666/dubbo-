package com.test.testSPI;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Robot {
    void sayHello();
}
