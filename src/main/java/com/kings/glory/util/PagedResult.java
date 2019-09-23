package com.kings.glory.util;

import javax.management.Query;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagedResult<T> implements Serializable {

    private static final long serialVersionUID = 176319318287181287L;

    private Page page;

    private List<T> resultList = new ArrayList<T>();

    public PagedResult() {
        super();
    }

    public PagedResult(Page page) {
        super();
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }


    /*public PagedResult<JSONObject> getJsonObjectPagedResult(PagedResult pagedResult, int pageIndex, int pageSize, Query query, List<JSONObject> objectList, MongoTemplate mongoTemplate, String tableName) {
        objectList.forEach(paged -> paged.put(QueryUtils.ID, paged.getString(QueryUtils.ID)));
        Long count = mongoTemplate.count(query, Long.class,tableName);
        pagedResult.setResultList(objectList);
        Page page=new Page();
        page.setPageSize(pageSize);
        page.setCurPage(pageIndex);
        page.setTotalCount(count);
        page.setTotalPages(count.intValue() % pageSize == 0 ? count.intValue() / pageSize : count.intValue() / pageSize + 1);
        pagedResult.setPage(page);
        return pagedResult;
    }*/

}

