package com.test.testSPI;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.common.threadpool.ThreadPool;
import org.junit.Test;

import javax.xml.ws.Service;
import java.util.ServiceLoader;
import java.util.function.Consumer;

public class JavaSPITest {
    @Test
    public void testJAVASPI() {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(new Consumer<Robot>() {
            @Override
            public void accept(Robot robot) {
                robot.sayHello();
            }
        });
    }

    @Test
    public void testDUBBOSPI() throws Exception {
        /*ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();*/
        ExtensionLoader<ThreadPool> extensionLoader = ExtensionLoader.getExtensionLoader(ThreadPool.class);
        ThreadPool adaptiveExtension = extensionLoader.getAdaptiveExtension();

    }
}
