/**
 

 *  <P> Copyright 2017 阳光康众</p>

 *  <p> Created on 2016年4月7日</p>
 *  <p> Created by x-lan</p>
 
 
 */
package com.cn.platform.security.service;

import java.util.List;
import java.util.Map;

import com.cn.framework.mvc.mysql.service.BaseSQLService;
import com.cn.platform.security.entity.Resource;

public interface ResourceService extends BaseSQLService<Resource, String> {

	/**
	 * @return
	 */
	public List<Resource> findMenuList();

	/**
	 * @param resourceId
	 * @return
	 */
	public List<Resource> findMenuListByParentId(String resourceId);

	/**
	 * @param userName
	 * @return
	 */
	public List<Resource> findResourceListByUser(String userName);

	/**
	 * @param resource
	 * @return
	 */
	public boolean isUniqueName(Resource resource);

	/**
	 * @param resource
	 * @return
	 */
	public boolean isUniqueCode(Resource resource);

	/**
	 * @return
	 */
	public List<Resource> findAllResource();

	/**
	 * @param resourceId
	 * @return
	 */
	public List<Resource> findResourceByParentId(String resourceId);

	/**
	 * @return
	 */
	public List<Resource> findAllMenuList();

	/**
	 * @param code
	 * @return
	 */
	public List<Resource> findResourceByParentCode(String code, String type);

	/**
	 * @param rslist
	 * @return
	 */
	public List<Resource> findButtonListByMenuList(List<String> rslist);

	/**
	 * 查询所有需要进行数据权限过滤的资源 add by yuce
	 * 
	 * @return
	 */
	public List<Resource> findDataAuthorityResources();

	@Override
	public void update(Resource resource);

	@Override
	public String insert(Resource resource);

	/**
	 * @Description 更新资源信息
	 * @param resource
	 * @return
	 * @date 2017年7月4日
	 */
	public Map<String, Object> updateResource(Resource resource);

	/**
	 * @Description 新增保存资源信息
	 * @param resource
	 * @return
	 * @date 2017年7月4日
	 */
	public Map<String, Object> saveResource(Resource resource);

	/**
	 * @Description 根据id删除资源 包含资源下的所有子资源
	 * @param resourceIds
	 * @date 2017年7月6日
	 */
	public void deleteWithSubByIds(List<String> resourceIds);

	/**
	 * @Description 根据角色Id列表查询
	 * @param roleIds
	 * @return
	 * @date 2017年7月4日
	 */
	public List<Resource> queryResourceByRoleIds(List<String> roleIds);

}
