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
package net.sf.dozer.util.mapping.vo;

import java.math.BigDecimal;
import java.util.Calendar;

import net.sf.dozer.util.mapping.vo.BaseTestObject;

/**
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 */
public class PrimitiveArrayObj extends BaseTestObject {
  private int[] field1;

  public int[] getField1() {
    return field1;
  }

  public void setField1(int[] field1) {
    this.field1 = field1;
  }

  
}