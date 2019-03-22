package com.meng.kafkademo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/testData")
    public String testData(@RequestBody KafkaMsgDto kafkaMsgDto){
        kafkaTemplate.send("IRS_MCM_RECORD",JSON.toJSONString(kafkaMsgDto));
//        kafkaTemplate.send("data_transfer",JSON.toJSONString(kafkaMsgDto));
        return JSON.toJSONString(kafkaMsgDto) + "||\r\n" + "kafka-发送完毕";
    }

    @RequestMapping("/test")
    public String test(@RequestBody Lo kafkaMsgDto){
        kafkaTemplate.send("IRS_MCM_RECORD",JSON.toJSONString(kafkaMsgDto));
//        kafkaTemplate.send("data_transfer",JSON.toJSONString(kafkaMsgDto));
        return JSON.toJSONString(kafkaMsgDto) + "||\r\n" + "kafka-发送完毕";
    }
    //IRS_MASTER_STATUS
    @RequestMapping("/test2")
    public String testSuc(@RequestBody Lo kafkaMsgDto){
        kafkaTemplate.send("IRS_MASTER_STATUS",JSON.toJSONString(kafkaMsgDto));
//        kafkaTemplate.send("data_transfer",JSON.toJSONString(kafkaMsgDto));
        return JSON.toJSONString(kafkaMsgDto) + "||\r\n" + "kafka-发送完毕";
    }
}
