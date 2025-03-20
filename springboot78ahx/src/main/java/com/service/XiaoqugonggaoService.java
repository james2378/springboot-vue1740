package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoqugonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoqugonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoqugonggaoView;


/**
 * 小区公告
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface XiaoqugonggaoService extends IService<XiaoqugonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoqugonggaoVO> selectListVO(Wrapper<XiaoqugonggaoEntity> wrapper);
   	
   	XiaoqugonggaoVO selectVO(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
   	
   	List<XiaoqugonggaoView> selectListView(Wrapper<XiaoqugonggaoEntity> wrapper);
   	
   	XiaoqugonggaoView selectView(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoqugonggaoEntity> wrapper);
   	

}

