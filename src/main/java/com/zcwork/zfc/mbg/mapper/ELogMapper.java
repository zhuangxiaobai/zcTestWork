package com.zcwork.zfc.mbg.mapper;

import com.zcwork.zfc.mbg.model.ELog;
import com.zcwork.zfc.mbg.model.ELogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ELogMapper {
    long countByExample(ELogExample example);

    int deleteByExample(ELogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ELog record);

    int insertSelective(ELog record);

    List<ELog> selectByExample(ELogExample example);

    ELog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ELog record, @Param("example") ELogExample example);

    int updateByExample(@Param("record") ELog record, @Param("example") ELogExample example);

    int updateByPrimaryKeySelective(ELog record);

    int updateByPrimaryKey(ELog record);
}