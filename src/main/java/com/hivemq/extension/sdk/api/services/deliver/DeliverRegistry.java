package com.hivemq.extension.sdk.api.services.deliver;

import com.hivemq.extension.sdk.api.annotations.NotNull;

public interface DeliverRegistry {

    void setPublishDeliver(@NotNull PublishDeliver deliver);
}
