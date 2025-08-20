package com.alibaba.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.plugin.datasource.constants.DatabaseTypeConstant;
import com.alibaba.nacos.plugin.datasource.dialect.PostgresqlDatabaseDialect;
import com.alibaba.nacos.plugin.datasource.impl.base.BaseConfigMigrateMapper;

/**
 * The type Config migrate mapper by mysql.
 *
 * @author yangzhiguo on 2025/8/20
 */
public class ConfigMigrateMapperByPostgresql extends BaseConfigMigrateMapper {

    public ConfigMigrateMapperByPostgresql() {
        super(new PostgresqlDatabaseDialect());
    }

    @Override
    public String getDataSource() {
        return DatabaseTypeConstant.POSTGRESQL;
    }
}
