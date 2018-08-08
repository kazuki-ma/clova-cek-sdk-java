/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.clova.extension.boot.message.payload;

import static lombok.AccessLevel.PRIVATE;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.linecorp.clova.extension.boot.message.model.AudioItem;
import com.linecorp.clova.extension.boot.message.model.AudioSource;
import com.linecorp.clova.extension.boot.message.model.PlayBehavior;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A {@link Payload} for {@code AudioPlayer.Play} directive.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class AudioPlayerPlayPayload implements Payload {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Valid
    private AudioItem audioItem;
    private PlayBehavior playBehavior;
    @NotNull
    @Valid
    private AudioSource source;

}
