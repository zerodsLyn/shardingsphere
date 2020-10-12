/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.metadata.model.rule;

import org.apache.shardingsphere.infra.metadata.model.schema.model.schema.SchemaMetaData;
import org.apache.shardingsphere.infra.metadata.model.schema.model.table.TableMetaData;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public final class RuleSchemaMetaDataTest {

    @Test
    public void assertGetSchemaMetaData() {
        Map<String, TableMetaData> tableMetaDataMap = new HashMap<>(1, 1);
        Map<String, Collection<String>> unconfiguredSchemaMetaDataMap = new HashMap<>(1, 1);
        RuleSchemaMetaData ruleSchemaMetaData = new RuleSchemaMetaData(new SchemaMetaData(tableMetaDataMap), unconfiguredSchemaMetaDataMap);
        SchemaMetaData schemaMetaData = ruleSchemaMetaData.getSchemaMetaData();
        assertNotNull("SchemaMetaData is null", schemaMetaData);
    }
}