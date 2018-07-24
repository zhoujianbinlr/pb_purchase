package com.cn.common.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.cn.framework.config.SystemConfig;

/**
 * @Project ChuFangLiuZhuan_PlatForm
 * @Package com.cn.common.init
 * @ClassName InitAppDataBean.java
 * @Description 系统数据初始化
 * @JDK version used 1.8
 * @Author zhoujb
 * @Create Date 2017年6月28日
 * @modify By
 * @modify Date
 * @Why&What is modify
 * @Version 1.0
 */
public class InitAppDataBean implements InitializingBean, DisposableBean {
	private static Logger logger = LoggerFactory.getLogger(InitAppDataBean.class);
	private String systemVersion;

	/***
	 * 启动的数据库地址
	 */
	private String jdbcDevIp;
	private String jdbcTestIp;
	private String jdbcRcIp;

	/***
	 * 启动的缓存地址
	 */
	private String cacheDevIp;
	private String cacheTestIp;
	private String cacheRcIp;

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 是否为合法启动
	 * 
	 * @return
	 */
	private Boolean isValidateStartUp() {
		Boolean isValidate = true;
		SystemConfig.loadSystemConfig();
		//		if (StringUtils.isNotBlank(systemVersion) && StringUtils.isNotBlank(jdbcDevIp) && StringUtils.isNotBlank(jdbcTestIp)
		//				&& StringUtils.isNotBlank(jdbcRcIp) && StringUtils.isNotBlank(cacheDevIp) && StringUtils.isNotBlank(cacheTestIp)
		//				&& StringUtils.isNotBlank(cacheRcIp)) {
		//			String jdbcConfigIp = SystemConfig.getStringValue("jdbc.url");
		//			String cacheConfigIp = SystemConfig.getStringValue("redis.connection.host");
		//
		//			if (StringUtils.isNotBlank(jdbcConfigIp) && StringUtils.isNotBlank(cacheConfigIp)) {
		//				if (GlobalConstant.SYSTEM_PUBLISH_VERSION_DEV.equalsIgnoreCase(systemVersion)) {
		//					if (jdbcConfigIp.indexOf(jdbcDevIp) == -1 || cacheConfigIp.indexOf(cacheDevIp) == -1) {
		//						isValidate = false;
		//						logger.error("系统发布为开发版本而jdbc或cache配置不为开发配置!");
		//					}
		//				} else if (GlobalConstant.SYSTEM_PUBLISH_VERSION_TEST.equalsIgnoreCase(systemVersion)) {
		//					if (jdbcConfigIp.indexOf(jdbcTestIp) == -1 || cacheConfigIp.indexOf(cacheTestIp) == -1) {
		//						isValidate = false;
		//						logger.error("系统发布为测试版本而jdbc或cache配置不为测试配置!");
		//					}
		//				} else {
		//					if (jdbcConfigIp.indexOf(jdbcRcIp) == -1 || cacheConfigIp.indexOf(cacheRcIp) == -1) {
		//						isValidate = false;
		//						logger.error("系统发布为正式版本而jdbc或cache配置不为正式配置!");
		//					}
		//				}
		//
		//			} else {
		//				isValidate = false;
		//				logger.error("数据库或缓存未配置!检查jdbc.properties和cache.properties文件配置");
		//			}
		//
		//		} else {
		//			isValidate = false;
		//			logger.error(
		//					"InitAppDataBean属性配置不正确,systemVersion:{} , jdbcDevIp:{},jdbcTestIp:{},jdbcRcIp:{},cacheDevIp:{},cacheTestIp:{},cacheRcIp:{}",
		//					new Object[] { systemVersion, jdbcDevIp, jdbcTestIp, jdbcRcIp, cacheDevIp, cacheTestIp, cacheRcIp });
		//		}
		return isValidate;

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		logger.info("==================================== Init Datas start ==================================");

		boolean isValidate = isValidateStartUp();

		if (isValidate) {
			initSysData();

			initBizData();

		} else {
			throw new Exception("发布的版本与配置参数不一致!系统启动失败,请检查配置文件!");
		}

		logger.info("==================================== Init Datas end ==================================");

	}

	private void initSysData() {
		// 初始化权限换缓存

	}

	private void initBizData() {

		
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getJdbcDevIp() {
		return jdbcDevIp;
	}

	public void setJdbcDevIp(String jdbcDevIp) {
		this.jdbcDevIp = jdbcDevIp;
	}

	public String getJdbcTestIp() {
		return jdbcTestIp;
	}

	public void setJdbcTestIp(String jdbcTestIp) {
		this.jdbcTestIp = jdbcTestIp;
	}

	public String getJdbcRcIp() {
		return jdbcRcIp;
	}

	public void setJdbcRcIp(String jdbcRcIp) {
		this.jdbcRcIp = jdbcRcIp;
	}

	public String getCacheDevIp() {
		return cacheDevIp;
	}

	public void setCacheDevIp(String cacheDevIp) {
		this.cacheDevIp = cacheDevIp;
	}

	public String getCacheTestIp() {
		return cacheTestIp;
	}

	public void setCacheTestIp(String cacheTestIp) {
		this.cacheTestIp = cacheTestIp;
	}

	public String getCacheRcIp() {
		return cacheRcIp;
	}

	public void setCacheRcIp(String cacheRcIp) {
		this.cacheRcIp = cacheRcIp;
	}

}
