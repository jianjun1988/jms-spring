package com.imooc.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class AppProducer {

    @Resource(name = "producerService")
    private ProducerService producerService;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            producerService.sendMessage("test" + i);
        }
        context.close();
    }
}
