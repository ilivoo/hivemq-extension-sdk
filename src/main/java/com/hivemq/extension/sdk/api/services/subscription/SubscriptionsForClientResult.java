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

package com.hivemq.extension.sdk.api.services.subscription;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.services.general.IterationCallback;

import java.util.Set;

/**
 * Parameter object passed to each iteration from {@link SubscriptionStore#iterateAllSubscriptions(IterationCallback)}.
 * This object represents a client identifier and all its subscriptions.
 *
 * @author Christoph Schäbel
 * @since 4.2.0, CE 2020.1
 */
public interface SubscriptionsForClientResult {

    /**
     * Get the client identifier for this client.
     *
     * @return The client identifier of this client.
     * @since 4.2.0, CE 2020.1
     */
    @NotNull String getClientId();

    /**
     * Get a {@link Set} of {@link TopicSubscription} containing all subscriptions including the subscription options
     * and identifier for this client.
     *
     * @return A {@link Set} of all the subscriptions for this client.
     * @since 4.2.0, CE 2020.1
     */
    @NotNull Set<TopicSubscription> getSubscriptions();
}
