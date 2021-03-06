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

package org.apache.geronimo.shell.deploy;

import org.apache.felix.gogo.commands.Command;
import org.apache.geronimo.cli.deployer.BaseCommandArgs;
import org.apache.geronimo.deployment.cli.AbstractCommand;
import org.apache.geronimo.deployment.cli.CommandLogin;
import org.apache.geronimo.deployment.cli.OfflineServerConnection;
import org.apache.geronimo.deployment.cli.ServerConnection;

/**
 * @version $Rev$ $Date$
 */
@Command(scope = "deploy", name = "login", description = "Saves the username and password for this connection")
public class LoginCommand extends ConnectCommand {

    @Override
    protected Object doExecute() throws Exception {

        ServerConnection connection = connect();

        if (connection instanceof OfflineServerConnection) {
            println("No credentials to save in embedded mode.");
            return null;
        }

        AbstractCommand command = new CommandLogin();

        BaseCommandArgs args = new BaseCommandArgs(new String[0]);

        command.execute(this, connection, args);
        return null;
    }
}
