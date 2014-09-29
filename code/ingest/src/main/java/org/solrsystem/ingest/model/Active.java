/*
 * Copyright 2014 Needham Software LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.solrsystem.ingest.model;/*
 * Created with IntelliJ IDEA.
 * User: gus
 * Date: 9/28/14
 */

public interface Active {
  /**
   * Begin processing this plan. Most implementations will simply call activate on the first executable
   * step in the plan.
   */
  void activate();

  void deactivate();
}
