package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousuchuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousuchuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousuchuliView;


/**
 * 投诉处理
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface TousuchuliService extends IService<TousuchuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousuchuliVO> selectListVO(Wrapper<TousuchuliEntity> wrapper);
   	
   	TousuchuliVO selectVO(@Param("ew") Wrapper<TousuchuliEntity> wrapper);
   	
   	List<TousuchuliView> selectListView(Wrapper<TousuchuliEntity> wrapper);
   	
   	TousuchuliView selectView(@Param("ew") Wrapper<TousuchuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousuchuliEntity> wrapper);
   	

}

