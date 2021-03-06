/*
 * Copyright 2017 Huawei Technologies Co., Ltd.
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

package org.openo.gso.model.servicemo;

/**
 * Service Operation Response<br>
 * <p>
 * </p>
 * 
 * @author
 * @version GSO 0.5 2017/1/22
 */
public class ServiceOperationRsp {

    /**
     * response of the service operation result
     */
    private ServiceOperation operation;

    /**
     * @return Returns the operation.
     */
    public ServiceOperation getOperation() {
        return operation;
    }

    /**
     * @param operation The operation to set.
     */
    public void setOperation(ServiceOperation operation) {
        this.operation = operation;
    }

}
