package com.meng.kafkademo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaDemoApplicationTests {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void contextLoads() {
//        String message = "{\"msgId\":\"21765c52821c19d4173afed1dad753e3\",\"batchSize\":8,\"objectType\":\"ALGO_MODEL\",\"action\":\"UPDATE\",\"data\":[{\"algoGroupId\":\"2\",\"algoName\":\"\\u80fd\\u529b\\u503c\\u7b97\\u6cd5\\u6a21\\u578bv2\",\"algoCode\":\"ABILITY_ALGO\",\"algoVersion\":\"ABI_V2\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:57:08\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u80fd\\u529b\\u503c\\u4f20\\u9012\\u7b97\\u6cd5v1\",\"algoCode\":\"ABILITY_TRANS_ALGO\",\"algoVersion\":\"TRANS_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:57:22\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u6d4b\\u8bd5\\u9636\\u6bb5\\u63a8\\u77e5\\u8bc6\\u70b9v1\",\"algoCode\":\"RECOM_ASSESMENT_LO_ALGO\",\"algoVersion\":\"KST_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:57:32\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u5b66\\u4e60\\u9636\\u6bb5\\u63a8\\u77e5\\u8bc6\\u70b9v1\",\"algoCode\":\"RECOM_STUDY_LO_ALGO\",\"algoVersion\":\"NLI_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:57:40\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u63a8\\u9898\\u7b97\\u6cd5v2\",\"algoCode\":\"RECOM_ITEM_LO_ALGO\",\"algoVersion\":\"ASSE_V2\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:57:57\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u9057\\u5fd8\\u590d\\u4e60\\u7b97\\u6cd5v1\",\"algoCode\":\"FORGETTION_ALGO\",\"algoVersion\":\"FOR_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:58:08\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u7a33\\u5b9a\\u6027\\u7b97\\u6cd5v1\",\"algoCode\":\"STOPPOLICY_ALGO\",\"algoVersion\":\"STOP_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:58:16\"},{\"algoGroupId\":\"2\",\"algoName\":\"\\u638c\\u63e1\\u7a0b\\u5ea6\\u7b97\\u6cd5v1\",\"algoCode\":\"MASTERY_ABI_ALGO\",\"algoVersion\":\"MAS_V1\",\"createTime\":\"2019-01-17 10:54:57\",\"updateTime\":\"2019-03-04 13:58:27\"}]}";
//        JSONObject jsonObject = JSON.parseObject(message);
//        kafkaTemplate.send("data_transfer_test",JSON.toJSONString(jsonObject));

        List<Lo> los = new ArrayList<>();
        Lo lo1 = new Lo();
        Lo lo2 = new Lo();
        Lo lo3 = new Lo();
        Lo lo4 = new Lo();
        lo1.setName("1.0");
        lo2.setName("2.0");
        lo3.setName("3.0");
        lo4.setName("4.0");
        los.add(lo1);
        los.add(lo2);
        los.add(lo3);
        los.add(lo4);
        Collections.shuffle(los);
        System.out.println(JSON.toJSONString(los));
        Collections.sort(los,(candidateItem1,candidateItem2) ->{
            int diff1 = Double.valueOf(candidateItem1.getName().trim()).intValue();
            int diff2 = Double.valueOf(candidateItem2.getName().trim()).intValue();
            return diff1 - diff2;
        });
        System.out.println(JSON.toJSONString(los));
    }

}
