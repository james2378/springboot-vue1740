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


import com.dao.TingcheweiDao;
import com.entity.TingcheweiEntity;
import com.service.TingcheweiService;
import com.entity.vo.TingcheweiVO;
import com.entity.view.TingcheweiView;

@Service("tingcheweiService")
public class TingcheweiServiceImpl extends ServiceImpl<TingcheweiDao, TingcheweiEntity> implements TingcheweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingcheweiEntity> page = this.selectPage(
                new Query<TingcheweiEntity>(params).getPage(),
                new EntityWrapper<TingcheweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingcheweiEntity> wrapper) {
		  Page<TingcheweiView> page =new Query<TingcheweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingcheweiVO> selectListVO(Wrapper<TingcheweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingcheweiVO selectVO(Wrapper<TingcheweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingcheweiView> selectListView(Wrapper<TingcheweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingcheweiView selectView(Wrapper<TingcheweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
