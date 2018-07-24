/**
 

 *  <P> Copyright 2014 . </p>

 *  <p> Created on 2017年10月29日</p>
 *  <p> Created by shitou</p>
 
 
 */
package com.cn.mobileapp.invoke;

import java.util.Map;

/**
 * @Project: YiChenTong_Server 
 * @Package: com.cn.mobileapp.invoke
 * @ClassName: InsideInvokeDataService
 * @Description: <p>其它内部系统获取平台业务数据接口</p>
 * @JDK version used: 
 * @Author: shitou
 * @Create Date: 2017年10月29日
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public interface InsideInvokeDataService {
	/**
	 * 获取医院的支付信息
	 * @param appCode 平台 code
	 * @param tradeCode  交易code
	 * @param hospitalId  医院ID
	 */
	public Map<String, String> getPayInfoByHospitalId(String appCode, String tradeCode, String hospitalId);

	/**
	 * 发送短信
	 * @author CHANG.CHI.HUNG
	 * @Email zhenzx@sun309.com
	 * @data 2017年11月19日下午6:33:39
	 */
	public Map<String, Object> sendMsgValidate(String mobile, String validCodeType, String sendContent);

}
