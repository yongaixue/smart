package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;
	
  /**
   * 根据商品id查询商品
   */
	@Override
	public TbItem findItemByid(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
