package com.alibaba.nacos.plugin.datasource.impl.base;

import com.alibaba.nacos.plugin.datasource.constants.TableConstant;
import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.mapper.ConfigInfoGrayMapper;
import com.alibaba.nacos.plugin.datasource.model.MapperContext;
import com.alibaba.nacos.plugin.datasource.model.MapperResult;

import java.util.Collections;

/**
 * The postgresql implementation of ConfigInfoGrayMapper.
 *
 * @author yangzhiguo on 2025/8/20
 */
public abstract class BaseConfigInfoGrayMapper extends BaseAbstractMapper implements ConfigInfoGrayMapper {

    protected BaseConfigInfoGrayMapper(DatabaseDialect databaseDialect) {
        super(databaseDialect);
    }

    @Override
    public String getTableName() {
        return TableConstant.CONFIG_INFO_GRAY;
    }

    @Override
    public MapperResult findAllConfigInfoGrayForDumpAllFetchRows(MapperContext context) {
        String sql = " SELECT id,data_id,group_id,tenant_id,gray_name,gray_rule,app_name,content,md5,gmt_modified " + " FROM  config_info_gray  ORDER BY id ";
        sql = databaseDialect.getLimitPageSqlWithOffset(sql, context.getStartRow(), context.getPageSize());
        return new MapperResult(sql, Collections.emptyList());
    }
}
