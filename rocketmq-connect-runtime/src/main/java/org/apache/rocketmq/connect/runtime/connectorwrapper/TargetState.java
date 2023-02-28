/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.connect.runtime.connectorwrapper;

/**
 * The target state of a connector is its desired state as indicated by the user
 * through interaction with the REST API. When a connector is first created, its
 * target state is "STARTED." This does not mean it has actually started, just that
 * the Connect framework will attempt to start it after its tasks have been assigned.
 * After the connector has been paused, the target state will change to PAUSED,
 * and all the tasks will stop doing work.
 */
public enum TargetState {
    STARTED,
    PAUSED,
}
