package org.dromara.hertzbeat.collector.collect;

import org.dromara.hertzbeat.common.entity.job.protocol.HttpProtocol;
import org.dromara.hertzbeat.common.entity.message.CollectRep;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;


/**
 * 不同数据格式解析抽象类
 * @author myth
 *
 */

public interface AbstractParseResponse extends InitializingBean {
    /**
     * 通用解析抽象方法
     *
     * @param resp
     * @param aliasFields
     * @param http
     * @param builder
     * @param responseTime
     */
    public default void parseResponse(String resp, List<String> aliasFields, HttpProtocol http,
                                      CollectRep.MetricsData.Builder builder, Long responseTime) {

    }
}
