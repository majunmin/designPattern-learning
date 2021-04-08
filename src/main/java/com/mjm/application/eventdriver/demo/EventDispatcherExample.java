package com.mjm.application.eventdriver.demo;

import com.mjm.application.eventdriver.Channel;
import com.mjm.application.eventdriver.Event;
import com.mjm.application.eventdriver.EventDispatcher;
import com.mjm.application.eventdriver.Message;
import lombok.Getter;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-08 08:47
 * @since
 */
public class EventDispatcherExample {

    @Getter
    static class InputEvent extends Event {

        private final int x;
        private final int y;

        public InputEvent(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @Getter
    static class ResultEvent extends Event {
        private final int result;

        public ResultEvent(int result) {
            this.result = result;
        }
    }

    static class ResultEventHandler implements Channel<ResultEvent> {

        @Override
        public void dispatch(ResultEvent message) {
            System.out.println("the result is: " + message.getResult());
        }
    }

    static class InputEventHandler implements Channel<InputEvent> {

        private final EventDispatcher dispatcher;

        public InputEventHandler(EventDispatcher dispatcher) {
            this.dispatcher = dispatcher;
        }

        @Override
        public void dispatch(InputEvent message) {
            System.out.println(message.toString());
            int result = message.getX() + message.getY();
            dispatcher.dispatch(new ResultEvent(result));
        }
    }


    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerChannel(InputEvent.class, new InputEventHandler(dispatcher));
        dispatcher.registerChannel(ResultEvent.class, new ResultEventHandler());
        dispatcher.dispatch(new InputEvent(1, 2));
    }
}
