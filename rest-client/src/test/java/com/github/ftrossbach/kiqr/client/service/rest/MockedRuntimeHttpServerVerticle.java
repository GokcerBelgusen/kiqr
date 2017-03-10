/**
 * Copyright © 2017 Florian Troßbach (trossbach@gmail.com)
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
package com.github.ftrossbach.kiqr.client.service.rest;


import com.github.ftrossbach.kiqr.rest.server.RestKiqrServerVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerOptions;

/**
 * Created by ftr on 07/03/2017.
 */
public class MockedRuntimeHttpServerVerticle extends RestKiqrServerVerticle {
    public MockedRuntimeHttpServerVerticle(HttpServerOptions serverOptions, AbstractVerticle runtimeVerticle) {
        super(serverOptions, runtimeVerticle);
    }
}
