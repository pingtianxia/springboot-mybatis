package com.hyp.dubbo.provider.dao;

import com.hyp.dubbo.provider.beans.SendSmsRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SendSmsRecordMapper {
    public List<SendSmsRecord> selectSendSmsRecordList();
}
