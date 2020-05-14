package com.zcwork.zfc.mbg.mapper;

import com.zcwork.zfc.mbg.model.EUser;
import com.zcwork.zfc.mbg.model.EUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EUserMapper {
    long countByExample(EUserExample example);

    int deleteByExample(EUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EUser record);

    int insertSelective(EUser record);

    List<EUser> selectByExample(EUserExample example);

    EUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EUser record, @Param("example") EUserExample example);

    int updateByExample(@Param("record") EUser record, @Param("example") EUserExample example);

    int updateByPrimaryKeySelective(EUser record);

    int updateByPrimaryKey(EUser record);
}