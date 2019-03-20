package com.org.observerExercise;

import com.google.common.eventbus.EventBus;

public class GPer {
    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(PublishEvent publishEvent){
        System.out.println(publishEvent.question.getUserName() + "在" + this.name + "上提交了一个问题。");
        //@发布消息
        publishEvent.eventBus.post(publishEvent);
    }
}
