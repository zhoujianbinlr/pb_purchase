/**
 

 *  <P> Copyright 2017 阳光康众</p>

 *  <p> Created on 2017年7月10日</p>
 *  <p> Created by zhoujb</p>
 
 
 */
package com.cn.common.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cn.common.dao.CommonDao;
import com.cn.common.vo.TreeNodeVo;
import com.cn.framework.exception.SystemException;

/**
 * @Project ChuFangLiuZhuan_PlatForm
 * @Package com.cn.common.dao
 * @ClassName CommonDaoImpl.java
 * @Description
 * @JDK version used 1.8
 * @Author zhoujb
 * @Create Date 2017年7月10日
 * @modify By
 * @modify Date
 * @Why&What is modify
 * @Version 1.0
 */
@Repository
public class CommonDaoImpl implements CommonDao {
	private static Logger logger = LoggerFactory.getLogger(CommonDaoImpl.class);

	private static final String COMMON_MAPPER_NAME_SPACE = "com.cn.common.vo";

	private final static String SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID_AND_PARENTID = "findResourceTreeByRoleIdAndParentId";
	private final static String SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID = "findResourceTreeByRoleId";

	private final static String SQLNAME_FIND_DEPT_TREE_BY_USERID_AND_PARENTID = "findDeptTreeByUserIdAndParentId";
	private final static String SQLNAME_FIND_DEPT_TREE_BY_USERID = "findDeptTreeByUserId";
	private final static String SQLNAME_FIND_MENU_RESOURCE_TREE_BY_RESOURCEID = "findMenuResourceTreeByResourceId";
	
	@Resource
	protected SqlSessionTemplate sqlSession;

	@Override
	public List<TreeNodeVo> findResourceTreeByRoleId(String roleId) {
		try {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("roleId", roleId);
			return sqlSession.selectList(getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID), paramMap);
		} catch (Exception e) {
			logger.error(String.format("查找资源树结构出错！语句：%s", getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID)), e);
			throw new SystemException(String.format("查找资源树结构出错！语句：%s", getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID)), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cn.platform.security.dao.ResourceDao#findAllByRoleIdAndParentId(java.lang.String , java.lang.String)
	 */
	@Override
	public List<TreeNodeVo> findResourceTreeByRoleIdAndParentId(String roleId, String parentId) {
		// TODO Auto-generated method stub
		try {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("roleId", roleId);
			if (parentId == null) {
				parentId = "";
			}
			paramMap.put("parentId", parentId);
			return sqlSession.selectList(getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID_AND_PARENTID), paramMap);
		} catch (Exception e) {
			logger.error(String.format("根据角色查询资源出错！语句：%s", getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID_AND_PARENTID)), e);
			throw new SystemException(String.format("根据角色查询资源出错！语句：%s", getSqlName(SQLNAME_FIND_RESOURCE_TREE_BY_ROLEID_AND_PARENTID)), e);
		}

	}

	@Override
	public List<TreeNodeVo> findDeptTreeByUserIdAndParentId(String userId, String parentId) {
		// TODO Auto-generated method stub
		try {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("userId", userId);
			if (StringUtils.isNotBlank(parentId)) {
				paramMap.put("parentId", parentId);
			}
			return sqlSession.selectList(getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID_AND_PARENTID), paramMap);
		} catch (Exception e) {
			logger.error(String.format("查询部门树出错！语句：%s", getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID_AND_PARENTID)), e);
			throw new SystemException(String.format("查询部门树出错！语句：%s", getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID_AND_PARENTID)), e);
		}
	}

	@Override
	public List<TreeNodeVo> findDeptTreeByUserId(String userId) {
		try {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("userId", userId);
			return sqlSession.selectList(getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID), paramMap);
		} catch (Exception e) {
			logger.error(String.format("查询部门树出错！语句：%s", getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID)), e);
			throw new SystemException(String.format("查询部门树出错！语句：%s", getSqlName(SQLNAME_FIND_DEPT_TREE_BY_USERID)), e);
		}
	}
	
    @Override
    public List<TreeNodeVo> findMenuResourceTreeByResourceId(String resourceId) {
    	try {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("resourceId", resourceId);
			return sqlSession.selectList(getSqlName(SQLNAME_FIND_MENU_RESOURCE_TREE_BY_RESOURCEID), paramMap);
		} catch (Exception e) {
			logger.error(String.format("查找资源树结构出错！语句：%s", getSqlName(SQLNAME_FIND_MENU_RESOURCE_TREE_BY_RESOURCEID)), e);
			throw new SystemException(String.format("查找资源树结构出错！语句：%s", getSqlName(SQLNAME_FIND_MENU_RESOURCE_TREE_BY_RESOURCEID)), e);
		}
    }

	/**
	 * @return the sqlSession
	 */

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	/**
	 * @param sqlSession
	 *            the sqlSession to set
	 */

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	/**
	 * 将sqlMapperNamespace与给定的sqlName组合在一起.
	 * 
	 * @param sqlName
	 * @return
	 */
	private String getSqlName(String sqlName) {
		return COMMON_MAPPER_NAME_SPACE.concat(".").concat(sqlName);
	}
}
