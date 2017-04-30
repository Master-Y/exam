package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbSturesult;
import com.lsc.exam.dao.model.TbSturesultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSturesultMapper {
    long countByExample(TbSturesultExample example);

    int deleteByExample(TbSturesultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSturesult record);

    int insertSelective(TbSturesult record);

    List<TbSturesult> selectByExample(TbSturesultExample example);

    TbSturesult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSturesult record, @Param("example") TbSturesultExample example);

    int updateByExample(@Param("record") TbSturesult record, @Param("example") TbSturesultExample example);

    int updateByPrimaryKeySelective(TbSturesult record);

    int updateByPrimaryKey(TbSturesult record);
}