/*
 * Copyright 2014-2017 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.scienjus.smartqq.handler.msg;

import com.google.gson.JsonObject;
import com.scienjus.smartqq.model.GroupMessage;

/**
 * 类/接口描述
 * 
 * @author Jamling
 * @date 2017年9月1日
 *       
 */
public class GroupMessageHandler extends AbstractMessageHandler {
    @Override
    public GroupMessage handle(JsonObject result) {
        GroupMessage m = new GroupMessage();
        handleCommon(m, result);
        
        return m;
    }
}
