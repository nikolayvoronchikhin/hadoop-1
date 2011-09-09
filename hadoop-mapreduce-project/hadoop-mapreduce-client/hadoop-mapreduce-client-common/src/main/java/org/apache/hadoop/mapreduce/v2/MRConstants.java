/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.hadoop.mapreduce.v2;


import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface MRConstants {
  // This should be the directory where splits file gets localized on the node
  // running ApplicationMaster.
  public static final String JOB_SUBMIT_DIR = "jobSubmitDir";
  
  // This should be the name of the localized job-configuration file on the node
  // running ApplicationMaster and Task
  public static final String JOB_CONF_FILE = "job.xml";
  // This should be the name of the localized job-jar file on the node running
  // individual containers/tasks.
  public static final String JOB_JAR = "job.jar";

  public static final String HADOOP_MAPREDUCE_CLIENT_APP_JAR_NAME =
      "hadoop-mapreduce-client-app-0.23.0-SNAPSHOT.jar";

  public static final String YARN_MAPREDUCE_APP_JAR_PATH =
    "$YARN_HOME/modules/" + HADOOP_MAPREDUCE_CLIENT_APP_JAR_NAME;

  // The token file for the application. Should contain tokens for access to
  // remote file system and may optionally contain application specific tokens.
  // For now, generated by the AppManagers and used by NodeManagers and the
  // Containers.
  public static final String APPLICATION_TOKENS_FILE = "appTokens";
}
