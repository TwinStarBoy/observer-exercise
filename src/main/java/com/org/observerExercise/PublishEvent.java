package com.org.observerExercise;

import com.google.common.eventbus.EventBus;

public class PublishEvent {
    public GPer gper;

    public Question question;

    public EventBus eventBus;


    public PublishEvent setGper(GPer gper) {
        this.gper = gper;
        return this;
    }

    public PublishEvent setQuestion(Question question) {
        this.question = question;
        return this;
    }

    public PublishEvent setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
        return this;
    }

}
