package com.alibaba.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.plugin.datasource.constants.DatabaseTypeConstant;
import com.alibaba.nacos.plugin.datasource.dialect.PostgresqlDatabaseDialect;
import com.alibaba.nacos.plugin.datasource.impl.base.BaseConfigInfoGrayMapper;

/**
 * The postgresql implementation of ConfigInfoGrayMapperByPostgresql.
 *
 * @author yangzhiguo on 2025/8/20
 */
public class ConfigInfoGrayMapperByPostgresql extends BaseConfigInfoGrayMapper {

    public ConfigInfoGrayMapperByPostgresql() {
        super(new PostgresqlDatabaseDialect());
    }

    @Override
    public String getDataSource() {
        return DatabaseTypeConstant.POSTGRESQL;
    }
}
