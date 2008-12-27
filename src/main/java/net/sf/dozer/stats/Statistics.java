/*
 * Copyright 2005-2007 the original author or authors.
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
package net.sf.dozer.stats;

import java.util.Set;

/**
 * Internal interface for managing statistics. Only intended for internal use.
 * 
 * @author tierney.matt
 */
public interface Statistics {
  public void clearAll();
  public Set getStatisticEntries(String statisticType);
  public Set getStatisticTypes();
  public boolean isStatisticsEnabled();
  public void setStatisticsEnabled(boolean statisticsEnabled);
  public void logStatistics();
}