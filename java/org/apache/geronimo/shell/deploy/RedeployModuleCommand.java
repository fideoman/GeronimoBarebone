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

import java.util.LinkedList;
import java.util.List;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.geronimo.cli.deployer.BaseCommandArgs;
import org.apache.geronimo.deployment.cli.AbstractCommand;
import org.apache.geronimo.deployment.cli.CommandRedeploy;
import org.apache.geronimo.deployment.cli.ServerConnection;

/**
 * @version $Rev$ $Date$
 */
@Command(scope = "deploy", name = "redeploy-module", description = "Redeploy a module")
public class RedeployModuleCommand extends ConnectCommand {

    @Argument(index = 0, description = "Module file")
    String moduleName;

    @Argument(index = 1, description = "Module plan")
    String modulePlan;

    @Argument(index = 2, description = "Module id")
    List<String> moduleIds;

    @Override
    protected Object doExecute() throws Exception {
        ServerConnection connection = connect();

        AbstractCommand command = new CommandRedeploy();

        List<String> commandArgs = new LinkedList<String>();

        if (moduleName != null) {
            commandArgs.add(moduleName);
        }

        if (modulePlan != null) {
            commandArgs.add(modulePlan);
        }

        if (moduleIds != null) {
            commandArgs.addAll(moduleIds);
        }

        BaseCommandArgs args = new BaseCommandArgs(commandArgs.toArray(new String[commandArgs.size()]));

        command.execute(this, connection, args);
        return null;
    }

}
