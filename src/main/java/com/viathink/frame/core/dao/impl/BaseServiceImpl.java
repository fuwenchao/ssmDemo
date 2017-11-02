package com.viathink.frame.core.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.viathink.frame.core.dao.BaseDao;
import com.viathink.frame.core.dao.BaseService;
import com.viathink.frame.core.dao.domain.Identifiable;

/**
 * 基础Service服务接口实现类
 * @author LiuJunGuang
 * @date 2014年3月7日下午2:23:55
 */
public abstract class BaseServiceImpl<T extends Identifiable> implements BaseService<T> {

	/**
	 * 获取基础数据库操作类
	 * @return
	 */
	protected abstract BaseDao<T> getBaseDao();

	@Override
	public <V extends T> V queryOne(T query) {
		return getBaseDao().selectOne(query);
	}

	@Override
	public <V extends T> V queryById(String id) {
		return getBaseDao().selectById(id);
	}

	@Override
	public <V extends T> List<V> queryList(T query) {
		return getBaseDao().selectList(query);
	}

	@Override
	public <V extends T> List<V> queryAll() {
		return getBaseDao().selectAll();
	}

	@Override
	public <K, V extends T> Map<K, V> queryMap(T query, String mapKey) {
		return getBaseDao().selectMap(query, mapKey);
	}

	@Override
	public Long queryCount() {
		return getBaseDao().selectCount();
	}

	@Override
	public Long queryCount(T query) {
		return getBaseDao().selectCount(query);
	}

	@Override
	public void insert(T entity) {
		getBaseDao().insert(entity);
	}

	@Override
	public int delete(T query) {
		return getBaseDao().delete(query);
	}

	@Override
	public int deleteById(String id) {
		return getBaseDao().deleteById(id);
	}

	@Override
	public int deleteAll() {
		return getBaseDao().deleteAll();
	}

	@Override
	public int updateById(T entity) {
		return getBaseDao().updateById(entity);
	}

	@Override
	public int updateByIdSelective(T entity) {
		return getBaseDao().updateByIdSelective(entity);
	}

	@Override
	@Transactional
	public void deleteByIdInBatch(List<String> idList) {
		getBaseDao().deleteByIdInBatch(idList);
	}

	@Override
	@Transactional
	public void insertInBatch(List<T> entityList) {
		getBaseDao().insertInBatch(entityList);
	}

	@Override
	@Transactional
	public void updateInBatch(List<T> entityList) {
		getBaseDao().updateInBatch(entityList);
	}

	@Override
	public <V extends T> List<V> queryList(T query, Pageable pageable) {
		return getBaseDao().selectList(query, pageable);
	}

	@Override
	public <V extends T> Page<V> queryPageList(T query, Pageable pageable) {
		return getBaseDao().selectPageList(query, pageable);
	}

	@Override
	public <K, V extends T> Map<K, V> queryMap(T query, String mapKey, Pageable pageable) {
		return getBaseDao().selectMap(query, mapKey, pageable);
	}

}
