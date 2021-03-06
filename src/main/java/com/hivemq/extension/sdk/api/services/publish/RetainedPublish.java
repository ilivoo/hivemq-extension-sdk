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

package com.hivemq.extension.sdk.api.services.publish;

import com.hivemq.extension.sdk.api.annotations.DoNotImplement;
import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.services.builder.Builders;
import com.hivemq.extension.sdk.api.services.builder.RetainedPublishBuilder;

/**
 * @author Christoph Schäbel
 * @since 4.0.0, CE 2019.1
 */
@DoNotImplement
public interface RetainedPublish extends Publish {

    /**
     * @return A new {@link RetainedPublishBuilder} to create a retained publish.
     * @since 4.0.0, CE 2019.1
     * @deprecated Use {@link Builders#retainedPublish()} instead
     */
    @Deprecated(since = "4.4.0")
    static @NotNull RetainedPublishBuilder builder() {
        return Builders.retainedPublish();
    }

    /**
     * {@inheritDoc}
     *
     * @since 4.0.0, CE 2019.1
     */
    @Override
    default boolean getRetain() {
        return true;
    }
}
