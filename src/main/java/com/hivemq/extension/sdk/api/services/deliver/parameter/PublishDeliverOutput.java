package com.hivemq.extension.sdk.api.services.deliver.parameter;

import com.hivemq.extension.sdk.api.async.SimpleAsyncOutput;
import com.hivemq.extension.sdk.api.interceptor.pingreq.parameter.PingReqInboundOutput;

public interface PublishDeliverOutput extends SimpleAsyncOutput<PingReqInboundOutput> {
    
}
