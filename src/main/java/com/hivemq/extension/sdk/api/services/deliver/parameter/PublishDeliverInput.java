package com.hivemq.extension.sdk.api.services.deliver.parameter;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.client.parameter.ClientInformation;
import com.hivemq.extension.sdk.api.services.publish.Publish;

public interface PublishDeliverInput {

    @NotNull ClientInformation getClientInformation();

    @NotNull Publish getPublish();
}
