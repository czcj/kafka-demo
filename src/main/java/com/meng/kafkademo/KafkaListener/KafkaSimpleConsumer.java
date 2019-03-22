package com.meng.kafkademo.KafkaListener;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class KafkaSimpleConsumer {
    @KafkaListener(groupId = "simpleGroup",topics = "IRS_MCM_RECORD")
    public void consumer1_1(ConsumerRecord<String,Object> record, @Header(KafkaHeaders.RECEIVED_TOPIC)String topic, String consumer){
        System.out.println("消费者1-1收到消息:" + JSON.toJSONString(record.value()) + "; topic:" + topic);
        /*
         * 如果需要手工提交异步 consumer.commitSync();
         * 手工同步提交 consumer.commitAsync()
         */
    }
    @KafkaListener(groupId = "simpleGroup",topics = "IRS_MCM_RECORD")
    public void consumer1_2(ConsumerRecord<String,Object> record, @Header(KafkaHeaders.RECEIVED_TOPIC)String topic, String consumer){
        System.out.println("消费者1-2收到消息:" + JSON.toJSONString(record.value()) + "; topic:" + topic);
        /*
         * 如果需要手工提交异步 consumer.commitSync();
         * 手工同步提交 consumer.commitAsync()
         */
    }

    @KafkaListener(groupId = "simpleGroup2",topics = "IRS_MCM_RECORD")
    public void consumer2_1(ConsumerRecord<String,Object> record, @Header(KafkaHeaders.RECEIVED_TOPIC)String topic, String consumer){
        System.out.println("消费2-1收到消息:" + JSON.toJSONString(record.value()) + "; topic:" + topic);
        /*
         * 如果需要手工提交异步 consumer.commitSync();
         * 手工同步提交 consumer.commitAsync()
         */
    }
}
