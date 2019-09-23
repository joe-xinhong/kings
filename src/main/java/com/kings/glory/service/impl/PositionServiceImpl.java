package com.kings.glory.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kings.glory.entity.Position;
import com.kings.glory.mapper.PositionMapper;
import com.kings.glory.service.IPositionService;
import com.kings.glory.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public PageInfo<Position> findAllByPage(Position position, Page page) {
        PageHelper.startPage(page.getCurPage(),page.getPageSize());
        Position queryPosition = new Position();
        if(position!=null){
            List<Position> positions = positionMapper.findAll(position);
            PageInfo<Position> pageInfo = new PageInfo<>(positions);
            return pageInfo;
        }
        List<Position> positions = positionMapper.findAll(queryPosition);
        PageInfo<Position> pageInfo = new PageInfo<>(positions);
        return pageInfo;
    }

    @Override
    public List<Position> findAll() {
        Position queryPosition = new Position();
        List<Position> positions = positionMapper.findAll(queryPosition);
        return positions;
    }
}
