package com.hyp.dubbo.provider.service;

import com.hyp.dubbo.provider.beans.SendSmsRecord;

import java.util.List;

public interface SendSmsRecordService {
    public List<SendSmsRecord> selectSendSmsRecordList();
}
