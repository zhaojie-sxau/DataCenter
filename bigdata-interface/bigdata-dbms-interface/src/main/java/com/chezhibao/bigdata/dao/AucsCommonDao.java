package com.chezhibao.bigdata.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WangCongJun
 * Created by WangCongJun on 2019/1/15.
 */
public interface AucsCommonDao {
    /**
     * 存储
     * @param sql 对应的语句
     * @param params 传入的参数
     */
    Boolean insert(String sql, Map<String, Object> params);

    /**
     * 删除
     * @param sql 对应的语句
     * @param params 传入的参数
     */

    void delete(String sql, Map<String, Object> params);

    /**
     * 更新
     * @param sql 对应的语句
     * @param params 传入的参数
     */

    void update(String sql, Map<String, Object> params);

    /**
     * 查找
     * @param sql 对应的语句
     * @param params 传入的参数
     */

    List<Map<String,Object>> select(String sql, Map<String, Object> params);

    /**
     * 查找（按照查询的字段顺序）
     * @param sql 对应的语句
     * @param params 传入的参数
     */

    List<LinkedHashMap<String,Object>> query(String sql, Map<String, Object> params);
}
