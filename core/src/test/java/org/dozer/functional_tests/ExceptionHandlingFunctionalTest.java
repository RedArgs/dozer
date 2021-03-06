/**
 * Copyright 2005-2017 Dozer Project
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
package org.dozer.functional_tests;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.MappingException;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.vo.map.SimpleObjPrime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dmitry.buzdin
 */
public class ExceptionHandlingFunctionalTest extends AbstractFunctionalTest {

  @Override
  @Before
  public void setUp() throws Exception {
    mapper = getMapper("missingSetter.xml");
  }

  @Test(expected = MappingException.class)
  public void test_UnableToDetermineType() {
    mapper.map("", NoNothing.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldFailOnDuplicateMapping() {
    DozerBeanMapper mapper = new DozerBeanMapper();
    mapper.addMapping(new BeanMappingBuilder() {
      @Override
      protected void configure() {
        mapping(String.class, NoNothing.class);
      }
    });

    mapper.addMapping(new BeanMappingBuilder() {
      @Override
      protected void configure() {
        mapping(String.class, NoNothing.class);
      }
    });
    
    mapper.map("A", NoNothing.class);
  }

  public static class NoNothing {
  }

}
