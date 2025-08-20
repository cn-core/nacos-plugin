package com.alibaba.nacos.plugin.datasource.impl.base;

import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.mapper.ConfigMigrateMapper;

/**
 * The type Config migrate mapper by postgresql.
 *
 * @author yangzhiguo on 2025/8/20
 */
public abstract class BaseConfigMigrateMapper extends BaseAbstractMapper implements ConfigMigrateMapper {

    protected BaseConfigMigrateMapper(DatabaseDialect databaseDialect) {
        super(databaseDialect);
    }
}
