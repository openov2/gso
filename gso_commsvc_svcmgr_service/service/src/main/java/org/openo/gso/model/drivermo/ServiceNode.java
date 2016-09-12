/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
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

package org.openo.gso.model.drivermo;

import java.util.List;
import java.util.Map;

/**
 * <br>
 * <p>
 * </p>
 * model service node
 * @author
 * @version     GSO 0.5  2016/9/3
 */
public class ServiceNode {

    private String nodeType;

    List<Map<String, String>> stNodeParam;

    
    /**
     * @return Returns the nodeType.
     */
    public String getNodeType() {
        return nodeType;
    }

    
    /**
     * @param nodeType The nodeType to set.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    
    /**
     * @return Returns the stNodeParam.
     */
    public List<Map<String, String>> getStNodeParam() {
        return stNodeParam;
    }

    
    /**
     * @param stNodeParam The stNodeParam to set.
     */
    public void setStNodeParam(List<Map<String, String>> stNodeParam) {
        this.stNodeParam = stNodeParam;
    }



}
