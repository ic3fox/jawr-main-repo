/**
 * Copyright 2016 Ibrahim Chaehoi
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package net.jawr.web.resource.bundle.lifecycle;

/**
 * This interface is implemented by classes which are listening to bundling process life cycle
 *  
 * @author Ibrahim Chaehoi
 */
public interface BundlingProcessLifeCycleListener {

	/**
	 * This method is called before the bundling process 
	 */
	void beforeBundlingProcess();
	
	
	/**
	 * This method is called after the bundling process 
	 */
	void afterBundlingProcess();

}