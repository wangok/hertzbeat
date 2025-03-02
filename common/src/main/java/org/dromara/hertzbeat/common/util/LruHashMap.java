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

package org.dromara.hertzbeat.common.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 最近最少使用淘汰算法map
 * @author tom
 *
 */
public class LruHashMap<K, V> extends LinkedHashMap<K, V> {

    private int threshold;

    public LruHashMap(int threshold) {
        super(16, 0.75f, true);
        this.threshold = threshold;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > threshold;
    }

}
