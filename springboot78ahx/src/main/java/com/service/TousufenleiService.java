package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousufenleiView;


/**
 * 投诉分类
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface TousufenleiService extends IService<TousufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousufenleiVO> selectListVO(Wrapper<TousufenleiEntity> wrapper);
   	
   	TousufenleiVO selectVO(@Param("ew") Wrapper<TousufenleiEntity> wrapper);
   	
   	List<TousufenleiView> selectListView(Wrapper<TousufenleiEntity> wrapper);
   	
   	TousufenleiView selectView(@Param("ew") Wrapper<TousufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousufenleiEntity> wrapper);
   	

}

