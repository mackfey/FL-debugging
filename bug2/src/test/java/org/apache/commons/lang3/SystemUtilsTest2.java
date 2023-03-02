/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.lang3;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Locale;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit tests {@link org.apache.commons.lang3.SystemUtils}.
 * 
 * Only limited testing can be performed.
 * 
 * @author Apache Software Foundation
 * @author Tetsuya Kaneuchi
 * @author Gary D. Gregory
 * @version $Id$
 */
public class SystemUtilsTest2 extends TestCase {

    public SystemUtilsTest2(String name) {
        super(name);
    }

    public void testJavaVersionAsInt() {
        assertEquals(0, SystemUtils.toJavaVersionInt(null));
        assertEquals(0, SystemUtils.toJavaVersionInt(""));
        assertEquals(0, SystemUtils.toJavaVersionInt("0"));
        assertEquals(110, SystemUtils.toJavaVersionInt("1.1"));
        assertEquals(120, SystemUtils.toJavaVersionInt("1.2"));
        assertEquals(130, SystemUtils.toJavaVersionInt("1.3.0"));
        assertEquals(131, SystemUtils.toJavaVersionInt("1.3.1"));
        assertEquals(140, SystemUtils.toJavaVersionInt("1.4.0"));
        assertEquals(141, SystemUtils.toJavaVersionInt("1.4.1"));
        assertEquals(142, SystemUtils.toJavaVersionInt("1.4.2"));
        assertEquals(150, SystemUtils.toJavaVersionInt("1.5.0"));
        assertEquals(160, SystemUtils.toJavaVersionInt("1.6.0"));
        assertEquals(131, SystemUtils.toJavaVersionInt("JavaVM-1.3.1"));
        assertEquals(131, SystemUtils.toJavaVersionInt("1.3.1 subset"));
        assertEquals(130, SystemUtils.toJavaVersionInt("XXX-1.3.x"));
    }
}
