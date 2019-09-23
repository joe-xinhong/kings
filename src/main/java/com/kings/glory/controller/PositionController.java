package com.kings.glory.controller;

import com.github.pagehelper.PageInfo;
import com.kings.glory.entity.Position;
import com.kings.glory.service.IPositionService;
import com.kings.glory.util.Page;
import com.kings.glory.util.R;
import com.kings.glory.util.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
* @Description:    位置
* @Author:         Joe
* @CreateDate:     2019/9/23 16:08
*/
@Api(tags ="位置接口")
@RequestMapping("/Position/v1")
@RestController
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @RequestMapping(value = "/findPagedList",method = RequestMethod.POST)
    @ApiOperation(value = "find",notes = "分页查询数据")
    public R<PageInfo<Position>> findPage(@RequestBody Position position, @PathParam("") Page page){
        PageInfo<Position> positionPageInfo= positionService.findAllByPage(position,page);
        return new R(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), positionPageInfo);
    }

    @RequestMapping(value = "/findAllList",method = RequestMethod.POST)
    @ApiOperation(value = "find",notes = "查询全部数据")
    public R<List<Position>> findAll(){
        List<Position> positions = positionService.findAll();
        return new R(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), positions);
    }
}
