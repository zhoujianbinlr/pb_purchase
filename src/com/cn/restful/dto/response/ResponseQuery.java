/**
 



 *  <p> Created on 2017年9月20日</p>

 
 
 */
package com.cn.restful.dto.response;

import java.util.List;

import com.cn.common.GlobalConstant;
import com.cn.framework.common.PKGenerator;
import com.cn.restful.dto.TradeParams;

/**
 * @Project: zhoujb 
 * @Package: com.cn.restful.dto.response
 * @ClassName: ResponsePay
 * @Description: <p>支付交易返回参数</p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年9月20日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class ResponseQuery extends TradeParams {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4717862058266728073L;

	/**
	 * 交易状态
	 */
	private String tradeState;

	/**
	 * 支付金额、总金额
	 */
	private String totalFee;

	/**
	 * 平台支付交易订单号
	 */
	private String tradeNo;

	/**
	 * 商户订单号
	 */
	private String outOrderNo;

	/**
	 * 支付时间
	 */
	private String payTime;

	/**
	 * 附加参数，原样返回
	 */
	private String attach;

	/**
	 * 退费交易订单号
	 */
	private String refundNo;

	/**
	 * 商户退费业务订单号
	 */
	private String outRefundNo;

	/**
	 * 退费金额
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

	/**
	 * 渠道编码
	 */
	private String channelCode;

	/**
	 * 第三方平台编码
	 */
	private String platformCode;

	/**
	 * 部分退费记录
	 */
	private List<RefundOrders> refundOrders;

	/**
	 * 
	 */
	public ResponseQuery() {
		super();
	}

	public String getTradeState() {
		return tradeState;
	}

	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getRefundNo() {
		return refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
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

	/** 
	* 获取渠道编码 
	* @return channelCode
	*/
	public String getChannelCode() {
		return channelCode;
	}

	/** 
	* 设置渠道编码 
	* @param channelCode
	*/
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/** 
	* 获取第三方平台编码 
	* @return platformCode
	*/
	public String getPlatformCode() {
		return platformCode;
	}

	/** 
	* 设置第三方平台编码 
	* @param platformCode
	*/
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public List<RefundOrders> getRefundOrders() {
		return refundOrders;
	}

	public void setRefundOrders(List<RefundOrders> refundOrders) {
		this.refundOrders = refundOrders;
	}

}
