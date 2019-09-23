package com.kings.glory.mapper;

import com.kings.glory.entity.Position;
import com.kings.glory.entity.PositionExample;
import java.util.List;

import com.kings.glory.util.Page;
import com.kings.glory.util.PagedResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionMapper {
    long countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer wayId);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer wayId);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    /**
     * 分页查询
     * @param position
     * @param page
     * @return
     */
    PagedResult<Position> findPageList(@Param("arg0") Position position,@Param("arg1") Page page);

    /**
     * 修改信息
     * @param position
     * @return
     */
    Integer update(Position position);

    /**
     * 删除
     * @param wayId
     * @return
     */
    Integer delete(Integer wayId);

    /**
     * 全部数据
     * @param position
     * @return
     */
    List<Position> findAll(@Param("arg0")Position position);
}