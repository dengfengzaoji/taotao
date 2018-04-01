package com.taotao.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;

/**
 * 商品类目控制器
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年2月4日 下午12:39:19
 * @version 1.0
 */
@RestController
public class ItemCatController {
	
	/** 注入商品服务接口代理对象 */
	@Autowired
	private ItemCatService itemCatService; 
	
	/** 
	 * 分页查询商品类目 
	 * http://localhost:9091/itemcat/1?rows=5
	 * */
	@GetMapping("/itemcat/{page}")
	public List<ItemCat> selectItemCatByPage(@PathVariable("page")Integer page,
					@RequestParam(value="rows", defaultValue="20")Integer rows){
		return itemCatService.findItemCatByPage(page, rows);
	}
}