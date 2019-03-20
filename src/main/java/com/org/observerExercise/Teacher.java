package com.org.observerExercise;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;

public class Teacher {

    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void subscribe(Object obj){
        PublishEvent publishEvent = (PublishEvent) obj;
        Question question = publishEvent.question;
        GPer gper = publishEvent.gper;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }



}
