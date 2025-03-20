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


import com.dao.TousufenleiDao;
import com.entity.TousufenleiEntity;
import com.service.TousufenleiService;
import com.entity.vo.TousufenleiVO;
import com.entity.view.TousufenleiView;

@Service("tousufenleiService")
public class TousufenleiServiceImpl extends ServiceImpl<TousufenleiDao, TousufenleiEntity> implements TousufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousufenleiEntity> page = this.selectPage(
                new Query<TousufenleiEntity>(params).getPage(),
                new EntityWrapper<TousufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousufenleiEntity> wrapper) {
		  Page<TousufenleiView> page =new Query<TousufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousufenleiVO> selectListVO(Wrapper<TousufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousufenleiVO selectVO(Wrapper<TousufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousufenleiView> selectListView(Wrapper<TousufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousufenleiView selectView(Wrapper<TousufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
