package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeguanliView;


/**
 * 物业管理
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface WuyeguanliService extends IService<WuyeguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeguanliVO> selectListVO(Wrapper<WuyeguanliEntity> wrapper);
   	
   	WuyeguanliVO selectVO(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
   	
   	List<WuyeguanliView> selectListView(Wrapper<WuyeguanliEntity> wrapper);
   	
   	WuyeguanliView selectView(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeguanliEntity> wrapper);
   	

}

