/*
 *
 * Copyright 2016 Manish Patel (MD)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.mytwitter.retrofit;

import java.io.IOException;

public class NoConnectivityException extends IOException {
    private static final long serialVersionUID = 6306271651592225301L;

    public NoConnectivityException () {
        super();
    }

    public NoConnectivityException (String arg0, Throwable throwable) {
        super(arg0, throwable);
    }

    public NoConnectivityException (String arg0) {
        super(arg0);
    }

    public NoConnectivityException (Throwable throwable) {
        super(throwable);
    }
}
