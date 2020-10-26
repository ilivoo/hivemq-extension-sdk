package com.hivemq.extension.sdk.api.services.deliver.parameter;

import com.hivemq.extension.sdk.api.async.SimpleAsyncOutput;

public interface PublishDeliverOutput extends SimpleAsyncOutput<PublishDeliverOutput> {

    void errorDeliver();
}
