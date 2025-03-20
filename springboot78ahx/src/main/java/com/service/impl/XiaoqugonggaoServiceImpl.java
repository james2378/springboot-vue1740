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


import com.dao.XiaoqugonggaoDao;
import com.entity.XiaoqugonggaoEntity;
import com.service.XiaoqugonggaoService;
import com.entity.vo.XiaoqugonggaoVO;
import com.entity.view.XiaoqugonggaoView;

@Service("xiaoqugonggaoService")
public class XiaoqugonggaoServiceImpl extends ServiceImpl<XiaoqugonggaoDao, XiaoqugonggaoEntity> implements XiaoqugonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoqugonggaoEntity> page = this.selectPage(
                new Query<XiaoqugonggaoEntity>(params).getPage(),
                new EntityWrapper<XiaoqugonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoqugonggaoEntity> wrapper) {
		  Page<XiaoqugonggaoView> page =new Query<XiaoqugonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoqugonggaoVO> selectListVO(Wrapper<XiaoqugonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoqugonggaoVO selectVO(Wrapper<XiaoqugonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoqugonggaoView> selectListView(Wrapper<XiaoqugonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoqugonggaoView selectView(Wrapper<XiaoqugonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
