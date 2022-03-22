package com.learn.patterns.observer.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class XiaoLong implements IObserver {
    @Override
    public void update(String title) {
        System.out.println("小龙收到了公众号发布的文章《" + title + "》");
    }
}
