/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.geronimo.system.plugin;

import java.io.File;
import java.io.IOException;

import org.apache.geronimo.kernel.repository.Artifact;
import org.apache.geronimo.kernel.repository.FileWriteMonitor;
import org.apache.geronimo.kernel.repository.WriteableRepository;

/**
 * @version $Rev$ $Date$
 */
public class LocalOpenResult implements OpenResult {
    private final Artifact artifact;
    private final File file;

    public LocalOpenResult(Artifact artifact, File file) {
        this.artifact = artifact;
        this.file = file;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public File getFile() {
        return file;
    }

    public void install(WriteableRepository repo, FileWriteMonitor monitor) throws IOException {
        repo.copyToRepository(file, artifact, monitor);
    }

    public void close() {
    }
}
