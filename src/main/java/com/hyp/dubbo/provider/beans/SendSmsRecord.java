package com.hyp.dubbo.provider.beans;

import java.util.Date;

public class SendSmsRecord {
    private Integer id;
    private String sendPhone;
    private String SignName;
    private String TemplateCode;
    private String RequestId;
    private String Code;
    private String Message;
    private String BizId;
    private String content;
    private Date sendDate;
    private Date receiveDate;
    private String sendStatus;

    @Override
    public String toString() {
        return "SendSmsRecord{" +
                "id=" + id +
                ", sendPhone='" + sendPhone + '\'' +
                ", SignName='" + SignName + '\'' +
                ", TemplateCode='" + TemplateCode + '\'' +
                ", RequestId='" + RequestId + '\'' +
                ", Code='" + Code + '\'' +
                ", Message='" + Message + '\'' +
                ", BizId='" + BizId + '\'' +
                ", content='" + content + '\'' +
                ", sendDate=" + sendDate +
                ", receiveDate=" + receiveDate +
                ", sendStatus='" + sendStatus + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getSignName() {
        return SignName;
    }

    public void setSignName(String signName) {
        SignName = signName;
    }

    public String getTemplateCode() {
        return TemplateCode;
    }

    public void setTemplateCode(String templateCode) {
        TemplateCode = templateCode;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getBizId() {
        return BizId;
    }

    public void setBizId(String bizId) {
        BizId = bizId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }
}
