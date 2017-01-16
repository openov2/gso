/*
 * Copyright 2016-2017 Huawei Technologies Co., Ltd.
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

package org.openo.gso.dao.inf;

import java.util.List;

import org.openo.gso.commsvc.common.Exception.ApplicationException;
import org.openo.gso.model.servicemo.ServiceSegmentModel;
import org.openo.gso.model.servicemo.ServiceSegmentOperation;

/**
 * Interface to operate database.<br/>
 * <p>
 * </p>
 * 
 * @author
 * @version GSO 0.5 2016/8/4
 */
public interface IServiceSegmentDao {

    /**
     * Insert service segment instance.<br/>
     * 
     * @param serviceSegment service segment instance
     * @throws ApplicationException when database exception or parameter is wrong
     * @since GSO 0.5
     */
    void insertSegment(ServiceSegmentModel serviceSegment) throws ApplicationException;
    
    

    /**
     * Delete service segment instance by service ID.<br/>
     * 
     * @param serviceSegment service segment information
     * @throws ApplicationException when database exception or parameter is wrong
     * @since GSO 0.5
     */
    void delete(ServiceSegmentModel serviceSegment) throws ApplicationException;

    /**
     * Query service segment instances by service ID.<br/>
     * 
     * @param serviceId service instance ID
     * @return sub-service instances.
     * @throws ApplicationException when database exception or parameter is wrong
     * @since GSO 0.5
     */
    List<ServiceSegmentModel> queryServiceSegments(String serviceId) throws ApplicationException;
    
    /**
     * query service segment by id and type<br>
     * 
     * @param serviceSegmentId instance id
     * @param serviceSegmentType NFVO or SDNO
     * @return service segment
     * @throws ApplicationException when database exception or parameter is wrong
     * @since  GSO 0.5
     */
    ServiceSegmentModel queryServiceSegmentByIdAndType(String serviceSegmentId, String serviceSegmentType) throws ApplicationException;
    
    /**
     * delete segment by segment id and segment type<br>
     * 
     * @param serviceSegment service segment
     * @since  GSO 0.5
     */
    void deleteSegmentByIdAndType(ServiceSegmentModel serviceSegment) throws ApplicationException;
    
    /**
     * Insert service segment operation<br>
     * 
     * @param svcSegmentOper service segment operation
     * @throws ApplicationException when database exception or parameter is wrong
     * @since  GSO 0.5
     */
    void insertSegmentOper(ServiceSegmentOperation svcSegmentOper) throws ApplicationException;

    /**
     * Update the service segment operation<br>
     * 
     * @param segmentOper service segment operation
     * @throws ApplicationException when database exception or parameter is wrong
     * @since  GSO 0.5
     */
    void updateSegmentOper(ServiceSegmentOperation segmentOper) throws ApplicationException;

    /**
     * Query service segment operation by job id and segment type<br>
     * 
     * @param jobId job id
     * @param segmentType segment type
     * @return service segment operation instance
     * @throws ApplicationException when database exception or parameter is wrong
     * @since  GSO 0.5
     */
    ServiceSegmentOperation querySegmentOperByJobIdAndType(String jobId, String segmentType) throws ApplicationException;
    
}
