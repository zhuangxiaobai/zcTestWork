package com.zcwork.zfc.mbg.mapper;

import com.zcwork.zfc.mbg.model.EVote;
import com.zcwork.zfc.mbg.model.EVoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EVoteMapper {
    long countByExample(EVoteExample example);

    int deleteByExample(EVoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EVote record);

    int insertSelective(EVote record);

    List<EVote> selectByExample(EVoteExample example);

    EVote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EVote record, @Param("example") EVoteExample example);

    int updateByExample(@Param("record") EVote record, @Param("example") EVoteExample example);

    int updateByPrimaryKeySelective(EVote record);

    int updateByPrimaryKey(EVote record);
}