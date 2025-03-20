package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingcheweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingcheweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingcheweiView;


/**
 * 停车位
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface TingcheweiService extends IService<TingcheweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingcheweiVO> selectListVO(Wrapper<TingcheweiEntity> wrapper);
   	
   	TingcheweiVO selectVO(@Param("ew") Wrapper<TingcheweiEntity> wrapper);
   	
   	List<TingcheweiView> selectListView(Wrapper<TingcheweiEntity> wrapper);
   	
   	TingcheweiView selectView(@Param("ew") Wrapper<TingcheweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingcheweiEntity> wrapper);
   	

}

