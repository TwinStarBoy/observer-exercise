package com.org.observerExercise;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {

        //初始化社区
        GPer gper = GPer.getInstance();
        //初始化老师
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("mic");
        //初始化问题
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        //初始化消息总线
        EventBus eventBus = new EventBus();
        //注册订阅者
        eventBus.register(tom);
        eventBus.register(mic);
        //初始化发布对象
        PublishEvent publishEvent = new PublishEvent();
        publishEvent.setGper(gper).setQuestion(question).setEventBus(eventBus);

        //发布问题
        gper.publishQuestion(publishEvent);

    }
}
