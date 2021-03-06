/*
 * Copyright 2018-present HiveMQ GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.extension.sdk.api.interceptor.pubrel;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.async.TimeoutFallback;
import com.hivemq.extension.sdk.api.interceptor.Interceptor;
import com.hivemq.extension.sdk.api.interceptor.pubrel.parameter.PubrelInboundInput;
import com.hivemq.extension.sdk.api.interceptor.pubrel.parameter.PubrelInboundOutput;
import com.hivemq.extension.sdk.api.packets.pubrel.ModifiablePubrelPacket;

import java.time.Duration;

/**
 * Interface for the inbound PUBREL interception.
 * <p>
 * Interceptors are always called by the same Thread for all messages from the same client.
 * <p>
 * If the same instance is shared between multiple clients it can be called in different Threads and must therefore be
 * thread-safe.
 * <p>
 * When the method {@link #onInboundPubrel(PubrelInboundInput, PubrelInboundOutput)} throws an exception or a call to
 * {@link PubrelInboundOutput#async(Duration)} times out with {@link TimeoutFallback#FAILURE}, HiveMQ will ignore this
 * interceptor and will:
 * <ol>
 *   <li>Log the exception
 *   <li>Revert the changes to the {@link ModifiablePubrelPacket} made by the interceptor
 *   <li>Call the next {@link PubrelInboundInterceptor} or send the PUBREL to the server if no interceptor is left
 * </ol>
 *
 * @author Yannick Weber
 * @since 4.3.0, CE 2020.1
 */
@FunctionalInterface
public interface PubrelInboundInterceptor extends Interceptor {

    /**
     * When a {@link PubrelInboundInterceptor} is set through any extension, this method gets called for every inbound
     * PUBREL packet from any MQTT client.
     * <p>
     * When the extension is enabled after HiveMQ is already running, this method will also be called for future PUBRELs
     * of clients that are already connected.
     *
     * @param pubrelInboundInput  The {@link PubrelInboundInput} parameter.
     * @param pubrelInboundOutput The {@link PubrelInboundOutput} parameter.
     * @since 4.3.0, CE 2020.1
     */
    void onInboundPubrel(
            @NotNull PubrelInboundInput pubrelInboundInput, @NotNull PubrelInboundOutput pubrelInboundOutput);
}
