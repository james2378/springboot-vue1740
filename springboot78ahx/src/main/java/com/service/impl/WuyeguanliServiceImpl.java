package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WuyeguanliDao;
import com.entity.WuyeguanliEntity;
import com.service.WuyeguanliService;
import com.entity.vo.WuyeguanliVO;
import com.entity.view.WuyeguanliView;

@Service("wuyeguanliService")
public class WuyeguanliServiceImpl extends ServiceImpl<WuyeguanliDao, WuyeguanliEntity> implements WuyeguanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeguanliEntity> page = this.selectPage(
                new Query<WuyeguanliEntity>(params).getPage(),
                new EntityWrapper<WuyeguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeguanliEntity> wrapper) {
		  Page<WuyeguanliView> page =new Query<WuyeguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeguanliVO> selectListVO(Wrapper<WuyeguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeguanliVO selectVO(Wrapper<WuyeguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeguanliView> selectListView(Wrapper<WuyeguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeguanliView selectView(Wrapper<WuyeguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
