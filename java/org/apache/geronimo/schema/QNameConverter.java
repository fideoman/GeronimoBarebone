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
package org.apache.geronimo.schema;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;

/**
 * @version $Rev$ $Date$
 */
public class QNameConverter implements ElementConverter {

    private final String sourceLocalName;
    private final String namespace;
    private final QName qname;

    public QNameConverter(String sourceLocalName, String namespace, String localName) {
        this.sourceLocalName = sourceLocalName;
        this.namespace = namespace;
        qname = new QName(namespace, localName);
    }

    public void convertElement(XmlCursor cursor, XmlCursor end) {
        end.toCursor(cursor);
        end.toEndToken();
        while (cursor.hasNextToken() && cursor.isLeftOf(end)) {
            if (cursor.isStart()) {
                QName name = cursor.getName();
                if (name.getLocalPart().equals(sourceLocalName)) {
                    cursor.setName(qname);
                } else {
                    cursor.setName(new QName(namespace, name.getLocalPart()));
                }
            }
            cursor.toNextToken();
        }
    }
}
