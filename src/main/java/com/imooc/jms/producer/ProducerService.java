package com.imooc.jms.producer;

import javax.jms.Message;

public interface ProducerService {

    void sendMessage(String message);
}
