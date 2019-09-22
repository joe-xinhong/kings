package com.kings.glory.dao;

import com.kings.glory.entity.Position;

import java.util.List;

public interface PositionDao {

    List<Position> queryPosition();

    Position queryPositionById(Integer wayId);

    Integer insertPosition(Position position);

    Integer updatePosition(Position position);

    Integer deletePosition(Integer wayId);


}
