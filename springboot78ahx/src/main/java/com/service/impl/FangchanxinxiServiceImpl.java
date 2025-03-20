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


import com.dao.FangchanxinxiDao;
import com.entity.FangchanxinxiEntity;
import com.service.FangchanxinxiService;
import com.entity.vo.FangchanxinxiVO;
import com.entity.view.FangchanxinxiView;

@Service("fangchanxinxiService")
public class FangchanxinxiServiceImpl extends ServiceImpl<FangchanxinxiDao, FangchanxinxiEntity> implements FangchanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangchanxinxiEntity> page = this.selectPage(
                new Query<FangchanxinxiEntity>(params).getPage(),
                new EntityWrapper<FangchanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangchanxinxiEntity> wrapper) {
		  Page<FangchanxinxiView> page =new Query<FangchanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangchanxinxiVO> selectListVO(Wrapper<FangchanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangchanxinxiVO selectVO(Wrapper<FangchanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangchanxinxiView> selectListView(Wrapper<FangchanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangchanxinxiView selectView(Wrapper<FangchanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
