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


import com.dao.TousuchuliDao;
import com.entity.TousuchuliEntity;
import com.service.TousuchuliService;
import com.entity.vo.TousuchuliVO;
import com.entity.view.TousuchuliView;

@Service("tousuchuliService")
public class TousuchuliServiceImpl extends ServiceImpl<TousuchuliDao, TousuchuliEntity> implements TousuchuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousuchuliEntity> page = this.selectPage(
                new Query<TousuchuliEntity>(params).getPage(),
                new EntityWrapper<TousuchuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousuchuliEntity> wrapper) {
		  Page<TousuchuliView> page =new Query<TousuchuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousuchuliVO> selectListVO(Wrapper<TousuchuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousuchuliVO selectVO(Wrapper<TousuchuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousuchuliView> selectListView(Wrapper<TousuchuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousuchuliView selectView(Wrapper<TousuchuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
