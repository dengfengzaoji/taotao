package com.taotao.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.taotao.admin.mapper.ItemCatMapper;
import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;

/**
 * 商品类目服务接口实现类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年2月4日 下午12:36:13
 * @version 1.0
 */
@Service
@Transactional
public class ItemCatServiceImpl implements ItemCatService {
	
	/** 注入数据访问接口代理对象 */
	@Autowired
	private ItemCatMapper itemCatMapper;
	
	/**
	 * 分页查询商品类目
	 * @param page 当前页码
	 * @param rows 每页显示的记录数 
	 * @return List
	 */
	public List<ItemCat> findItemCatByPage(Integer page, Integer rows){
		try{
			/** 开启分页 */
			PageHelper.startPage(page, rows);
			return itemCatMapper.selectAll();
		}catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
}
