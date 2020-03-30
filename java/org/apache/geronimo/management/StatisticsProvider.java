/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.geronimo.management;

import javax.management.j2ee.statistics.Stats;

/**
 * This is a representation of the StatisticsProvider type defined in the J2EE Management specification.
 *
 * @version $Rev$ $Date$
 */
public interface StatisticsProvider {
    /**
     * Gets the statistics collected for this class. 
     * The first call to this method initializes the startTime for
     * all statistics. 
     *
     * @return gets collected for this class
     */
    Stats getStats();
    
    /**
     * Reset the startTime for all statistics
     */
    void resetStats();
}
