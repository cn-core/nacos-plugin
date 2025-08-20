package com.alibaba.nacos.plugin.datasource.impl.base;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.alibaba.nacos.plugin.datasource.constants.DatabaseTypeConstant;
import com.alibaba.nacos.plugin.datasource.constants.FieldConstant;
import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.mapper.HistoryConfigInfoMapper;
import com.alibaba.nacos.plugin.datasource.model.MapperContext;
import com.alibaba.nacos.plugin.datasource.model.MapperResult;

/**
 * The history config info mapper.
 *
 * @author yangzhiguo on 2025/8/20
 */
public abstract class BaseHistoryConfigInfoMapper extends BaseAbstractMapper implements HistoryConfigInfoMapper {

    public BaseHistoryConfigInfoMapper(DatabaseDialect databaseDialect) {
        super(databaseDialect);
    }

    @Override
    public MapperResult removeConfigHistory(MapperContext context) {
        String sql = "DELETE FROM his_config_info WHERE gmt_modified < ?";
        return new MapperResult(sql, CollectionUtils.list(context.getWhereParameter(FieldConstant.START_TIME)));
    }

    @Override
    public MapperResult pageFindConfigHistoryFetchRows(MapperContext context) {
        String sql = getLimitPageSqlWithOffset("SELECT nid,data_id,group_id,tenant_id,app_name,src_ip,src_user,op_type,ext_info,publish_type,gray_name,gmt_create,gmt_modified "
                + "FROM his_config_info " + "WHERE data_id = ? AND group_id = ? AND tenant_id = ? ORDER BY nid DESC ", context.getStartRow(), context.getPageSize());
        return new MapperResult(sql,
                CollectionUtils.list(context.getWhereParameter(FieldConstant.DATA_ID), context.getWhereParameter(FieldConstant.GROUP_ID), context.getWhereParameter(FieldConstant.TENANT_ID)));
    }

    @Override
    public String getDataSource() {
        return DatabaseTypeConstant.POSTGRESQL;
    }
}
