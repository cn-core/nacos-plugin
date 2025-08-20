/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.plugin.datasource.impl.base;

import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.mapper.TenantInfoMapper;

/**
 * The base implementation of TenantInfo.
 *
 * @author yangzhiguo on 2025/8/20
 **/
public abstract class BaseTenantInfoMapper extends BaseAbstractMapper implements TenantInfoMapper {


    protected BaseTenantInfoMapper(DatabaseDialect databaseDialect) {
        super(databaseDialect);
    }
}
