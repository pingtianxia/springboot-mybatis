package com.hyp.dubbo.provider.service;

import com.hyp.dubbo.provider.beans.SendSmsRecord;
import com.hyp.dubbo.provider.dao.SendSmsRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendSmsRecordServiceImpl implements  SendSmsRecordService{
    @Autowired
    private SendSmsRecordMapper sendSmsRecordMapper;

    @Override
    public List<SendSmsRecord> selectSendSmsRecordList() {
        return sendSmsRecordMapper.selectSendSmsRecordList();
    }
}
