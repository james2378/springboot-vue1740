package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangchanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangchanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangchanxinxiView;


/**
 * 房产信息
 *
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface FangchanxinxiService extends IService<FangchanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangchanxinxiVO> selectListVO(Wrapper<FangchanxinxiEntity> wrapper);
   	
   	FangchanxinxiVO selectVO(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
   	
   	List<FangchanxinxiView> selectListView(Wrapper<FangchanxinxiEntity> wrapper);
   	
   	FangchanxinxiView selectView(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangchanxinxiEntity> wrapper);
   	

}

