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

package org.apache.geronimo.jaxws.feature;

import javax.xml.ws.RespectBinding;
import javax.xml.ws.RespectBindingFeature;
import javax.xml.ws.WebServiceFeature;

/**
 * @version $Rev$ $Date$
 */
public class RespectBindingFeatureInfo implements WebServiceFeatureInfo {

    private boolean enabled;

    public RespectBindingFeatureInfo() {
        enabled = false;
    }

    public RespectBindingFeatureInfo(RespectBinding respectBinding) {
        this(respectBinding.enabled());
    }

    public RespectBindingFeatureInfo(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public WebServiceFeature getWebServiceFeature() {
        return new RespectBindingFeature(enabled);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "RespectBindingFeatureInfo [enabled=" + enabled + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (enabled ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RespectBindingFeatureInfo other = (RespectBindingFeatureInfo) obj;
        if (enabled != other.enabled)
            return false;
        return true;
    }

}
