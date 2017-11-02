package com.viathink.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viathink.frame.core.dao.BaseDao;
import com.viathink.frame.core.dao.impl.BaseServiceImpl;
import com.viathink.sys.dao.SysDictionaryDao;
import com.viathink.sys.domain.SysDictionary;
import com.viathink.sys.service.SysDictionaryService;

/**
 * 字典信息服务类接口实现
 * @author LiuJunGuang
 * @date 2014年3月7日下午2:27:08
 */
@Service
public class SysDictionaryServiceImpl extends BaseServiceImpl<SysDictionary> implements SysDictionaryService {
	@Autowired
	private SysDictionaryDao sysDictionaryDao;

	@Override
	protected BaseDao<SysDictionary> getBaseDao() {
		return sysDictionaryDao;
	}

}
