/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.geronimo.corba.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.geronimo.corba.ORBConfiguration;
import org.apache.geronimo.corba.util.Util;
import org.omg.CORBA.LocalObject;
import org.omg.PortableInterceptor.ORBInitInfo;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
import org.omg.PortableInterceptor.ORBInitializer;


/**
 * @version $Revision: 451417 $ $Date: 2006-09-29 13:13:22 -0700 (Fri, 29 Sep 2006) $
 */
public class SecurityInitializer extends LocalObject implements ORBInitializer {

    private final Logger log = LoggerFactory.getLogger(SecurityInitializer.class);

    public SecurityInitializer() {
        if (log.isDebugEnabled()) log.debug("SecurityInitializer.<init>");
    }

    /**
     * Called during ORB initialization.  If it is expected that initial
     * services registered by an interceptor will be used by other
     * interceptors, then those initial services shall be registered at
     * this point via calls to
     * <code>ORBInitInfo.register_initial_reference</code>.
     *
     * @param info provides initialization attributes and operations by
     *             which Interceptors can be registered.
     */
    public void pre_init(ORBInitInfo info) {
    }

    /**
     * Called during ORB initialization. If a service must resolve initial
     * references as part of its initialization, it can assume that all
     * initial references will be available at this point.
     * <p/>
     * Calling the <code>post_init</code> operations is not the final
     * task of ORB initialization. The final task, following the
     * <code>post_init</code> calls, is attaching the lists of registered
     * interceptors to the ORB. Therefore, the ORB does not contain the
     * interceptors during calls to <code>post_init</code>. If an
     * ORB-mediated call is made from within <code>post_init</code>, no
     * request interceptors will be invoked on that call.
     * Likewise, if an operation is performed which causes an IOR to be
     * created, no IOR interceptors will be invoked.
     *
     * @param info provides initialization attributes and
     *             operations by which Interceptors can be registered.
     */
    public void post_init(ORBInitInfo info) {

        try {
            if (log.isDebugEnabled()) log.debug("Registering interceptors and policy factories");

            ORBConfiguration config = Util.getRegisteredORB(info.orb_id());

            try {
                info.add_client_request_interceptor(new ClientSecurityInterceptor());
                info.add_server_request_interceptor(new ServerSecurityInterceptor());
                info.add_ior_interceptor(new IORSecurityInterceptor(config.getTssConfig()));
            } catch (DuplicateName dn) {
                log.error("Error registering interceptor", dn);
            }

            info.register_policy_factory(ClientPolicyFactory.POLICY_TYPE, new ClientPolicyFactory());
            info.register_policy_factory(ServerPolicyFactory.POLICY_TYPE, new ServerPolicyFactory());
        } catch (RuntimeException re) {
            log.error("Error registering interceptor", re);
            throw re;
        }
    }

}
