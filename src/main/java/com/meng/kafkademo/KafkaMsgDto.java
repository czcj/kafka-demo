package com.meng.kafkademo;

import java.util.List;

/**
 * date: 18/5/30 上午11:22 <br/>
 *
 * @author guilbert
 */
public class KafkaMsgDto<T> {
    private String msgId;
    private int batchSize;
    private String objectType;
    private String action;

    private List<T> data;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
