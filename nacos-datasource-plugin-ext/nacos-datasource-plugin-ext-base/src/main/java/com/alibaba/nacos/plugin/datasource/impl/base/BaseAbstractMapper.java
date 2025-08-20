package com.alibaba.nacos.plugin.datasource.impl.base;

import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.enumer.TrustedSqlFunctionEnum;
import com.alibaba.nacos.plugin.datasource.mapper.AbstractMapper;

/**
 * 基础抽象映射器
 *
 * @author yangzhiguo on 2025/8/19
 */
public abstract class BaseAbstractMapper extends AbstractMapper {

    protected final DatabaseDialect databaseDialect;

    protected BaseAbstractMapper(DatabaseDialect databaseDialect) {
        this.databaseDialect = databaseDialect;
    }

    protected String getLimitPageSqlWithOffset(String sql, int startOffset, int pageSize) {
        return databaseDialect.getLimitPageSqlWithOffset(sql, startOffset, pageSize);
    }

    protected String getLimitPageSqlWithMark(String sql) {
        return databaseDialect.getLimitPageSqlWithMark(sql);
    }

    @Override
    public String getFunction(String functionName) {
        return TrustedSqlFunctionEnum.getFunctionByName(functionName);
    }
}
