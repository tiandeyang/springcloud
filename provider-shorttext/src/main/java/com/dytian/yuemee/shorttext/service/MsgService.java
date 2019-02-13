package com.dytian.yuemee.shorttext.service;

public interface MsgService {

	String sendMsg(String phone, String content) throws Exception;
	
	String getResultMsg(int result);
	
	String sendInvoiceMsg(String phone, String content) throws Exception;
	
	String sendInvoiceMsg2(String phone, String content) throws Exception;
}
