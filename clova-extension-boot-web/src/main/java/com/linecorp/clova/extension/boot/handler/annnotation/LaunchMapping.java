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

package com.linecorp.clova.extension.boot.handler.annnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.linecorp.clova.extension.boot.message.request.RequestType;

/**
 * An annotation for performing LaunchRequest mapping.
 * <p>
 * Define it as follows.
 * <pre><code>
 * &#64;LaunchMapping
 * public CEKResponse handleLaunch() {
 *   // some code
 * }
 * </code></pre>
 *
 * @see CEKRequestMapping
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@CEKRequestMapping(type = RequestType.LAUNCH, nameRequired = false)
public @interface LaunchMapping {
}
