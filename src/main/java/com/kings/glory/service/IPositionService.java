package com.kings.glory.service;


import com.github.pagehelper.PageInfo;
import com.kings.glory.entity.Position;
import com.kings.glory.util.Page;
import com.kings.glory.util.PagedResult;

import java.util.List;

public interface IPositionService {
    /**
     * 分页查询
     * @param position
     * @param page
     * @return
     */
    PageInfo<Position> findAllByPage(Position position, Page page);

    /**
     * 查询全部
     * @return
     */
    List<Position> findAll();
}
