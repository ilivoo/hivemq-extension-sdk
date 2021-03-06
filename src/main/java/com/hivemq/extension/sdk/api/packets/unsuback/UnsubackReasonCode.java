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

package com.hivemq.extension.sdk.api.packets.unsuback;

/**
 * Reason codes that can be set/contained in an {@link UnsubackPacket}. A reason code describes the outcome for an
 * UNSUBSCRIBE request from a topic.
 *
 * @author Robin Atherton
 * @since 4.3.0, CE 2020.1
 */
public enum UnsubackReasonCode {

    /**
     * The subscription is deleted.
     * <p>
     * This is a success code.
     *
     * @since 4.3.0, CE 2020.1
     */
    SUCCESS,

    /**
     * No matching Topic Filter is being used by the Client.
     * <p>
     * This is a success code.
     *
     * @since 4.3.0, CE 2020.1
     */
    NO_SUBSCRIPTIONS_EXISTED,

    /**
     * The unsubscribe could not be completed and the Server does not wish to reveal the reason or none of the other
     * Reason Codes apply.
     * <p>
     * This is an unsuccessful code.
     *
     * @since 4.3.0, CE 2020.1
     */
    UNSPECIFIED_ERROR,

    /**
     * The UNSUBSCRIBE is valid but the Server does not accept it.
     * <p>
     * This is an unsuccessful code.
     *
     * @since 4.3.0, CE 2020.1
     */
    IMPLEMENTATION_SPECIFIC_ERROR,

    /**
     * The Client is not authorized to unsubscribe.
     * <p>
     * This is an unsuccessful code.
     *
     * @since 4.3.0, CE 2020.1
     */
    NOT_AUTHORIZED,

    /**
     * The Topic Filter is correctly formed but is not allowed for this Client.
     * <p>
     * This is an unsuccessful code.
     *
     * @since 4.3.0, CE 2020.1
     */
    TOPIC_FILTER_INVALID,

    /**
     * The specified Packet Identifier is already in use.
     * <p>
     * This is an unsuccessful code.
     *
     * @since 4.3.0, CE 2020.1
     */
    PACKET_IDENTIFIER_IN_USE
}
