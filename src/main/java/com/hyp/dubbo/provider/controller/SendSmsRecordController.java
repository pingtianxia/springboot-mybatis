package com.hyp.dubbo.provider.controller;

import com.hyp.dubbo.provider.beans.SendSmsRecord;
import com.hyp.dubbo.provider.service.SendSmsRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SendSmsRecordController {

    @Autowired
    private SendSmsRecordService sendSmsRecordService;

    @RequestMapping("/getSendSmsRecordList")
    @ResponseBody
    public List<SendSmsRecord> getSendSmsRecordList(){
        return  sendSmsRecordService.selectSendSmsRecordList();
    }
}
