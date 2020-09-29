package com.hivemq.extension.sdk.api.services.deliver;

import com.hivemq.extension.sdk.api.services.deliver.parameter.PublishDeliverInput;
import com.hivemq.extension.sdk.api.services.deliver.parameter.PublishDeliverOutput;

public interface PublishDeliver {

    void deliver(PublishDeliverInput input, PublishDeliverOutput output);
}
