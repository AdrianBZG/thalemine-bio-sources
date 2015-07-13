/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intermine.bio.dataloader.job;


/**
 * 
 * This interface should be implemented when an environment calling the batch
 * framework has specific requirements regarding the operating system process
 * return status.
 * 
 */
public interface ExitCodeMapper {

	static int JVM_EXITCODE_COMPLETED = 0;

	static int JVM_EXITCODE_GENERIC_ERROR = 1;

	static int JVM_EXITCODE_JOB_ERROR = 2;

	public static final String NO_SUCH_JOB = "NO_SUCH_JOB";

	public static final String JOB_NOT_PROVIDED = "JOB_NOT_PROVIDED";

	/**
	 * Convert the exit code from String into an integer that the calling
	 * environment as an operating system can interpret as an exit status.
	 * @param exitCode The exit code which is used internally.
	 * @return The corresponding exit status as known by the calling
	 * environment.
	 */
	public int intValue(String exitCode);

}
