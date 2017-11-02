package com.viathink.frame.core.dao.domain;

import java.io.Serializable;

/**
 * 主键标识
 * @author LiuJunGuang
 * @date 2014年3月3日下午5:55:34
 */
public interface Identifiable extends Serializable {
	/**
	 * 获取主键
	 * @author LiuJunGuang
	 * @return
	 * @date 2014年3月3日下午5:56:13
	 */
	public String getId();

	/**
	 * 设置ID属性
	 * @param id
	 */
	public void setId(String id);
}
