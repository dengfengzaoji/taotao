package com.taotao.admin.service;

import java.util.List;

import com.taotao.admin.pojo.ItemCat;

/**
 * 商品类目服务接口
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年2月4日 下午12:35:30
 * @version 1.0
 */
public interface ItemCatService {
	/**
	 * 分页查询商品类目
	 * @param page 当前页码
	 * @param rows 每页显示的记录数 
	 * @return List
	 */
	List<ItemCat> findItemCatByPage(Integer page, Integer rows);

}
