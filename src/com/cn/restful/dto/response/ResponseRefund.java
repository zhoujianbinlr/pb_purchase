/**
 

 *  <P> Copyright 2014 . </p>

 *  <p> Created on 2017年9月22日</p>
 *  <p> Created by hqy</p>
 
 
 */
package com.cn.restful.dto.response;

import com.cn.restful.dto.TradeParams;

/**
 * @Project: zhoujb 
 * @Package: com.cn.restful.dto.response
 * @ClassName: ResponseRefund
 * @Description: <p>退费交易返回参数</p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月22日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class ResponseRefund extends TradeParams {

	/**
	 * 
	 */
	private static final long serialVersionUID = 406356857203634737L;

	/**
	 * 商户订单号
	 */
	private String outOrderNo;

	/**
	 * 平台订单号
	 */
	private String tradeNo;

	/**
	 * 商户退费订单号
	 */
	private String outRefundNo;

	/**
	 * 平台退费订单号
	 */
	private String refundNo;

	/**
	 * 退费金额,单位分
	 */
	private String refundFee;

	/**
	 * 退费时间
	 */
	private String refundTime;

	/**
	 * 退款原因
	 */
	private String refundDesc;

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundNo() {
		return refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getRefundDesc() {
		return refundDesc;
	}

	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

}
