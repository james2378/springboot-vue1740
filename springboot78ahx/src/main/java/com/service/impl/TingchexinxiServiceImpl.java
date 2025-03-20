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


import com.dao.TingchexinxiDao;
import com.entity.TingchexinxiEntity;
import com.service.TingchexinxiService;
import com.entity.vo.TingchexinxiVO;
import com.entity.view.TingchexinxiView;

@Service("tingchexinxiService")
public class TingchexinxiServiceImpl extends ServiceImpl<TingchexinxiDao, TingchexinxiEntity> implements TingchexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchexinxiEntity> page = this.selectPage(
                new Query<TingchexinxiEntity>(params).getPage(),
                new EntityWrapper<TingchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchexinxiEntity> wrapper) {
		  Page<TingchexinxiView> page =new Query<TingchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchexinxiVO> selectListVO(Wrapper<TingchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchexinxiVO selectVO(Wrapper<TingchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchexinxiView> selectListView(Wrapper<TingchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchexinxiView selectView(Wrapper<TingchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
