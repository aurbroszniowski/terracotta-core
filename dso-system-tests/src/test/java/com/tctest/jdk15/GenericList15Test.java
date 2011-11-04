/*
 * All content copyright (c) 2003-2008 Terracotta, Inc., except as may otherwise be noted in a separate copyright
 * notice. All rights reserved.
 */
package com.tctest.jdk15;

import com.tc.util.runtime.Vm;
import com.tctest.TransparentTestBase;

public class GenericList15Test extends TransparentTestBase {
  private static final int NODE_COUNT = 3;

  public GenericList15Test() {
    if (Vm.isIBM()) {
      // these currently don't have to work on the IBM JDK
      disableTest();
    }
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    getTransparentAppConfig().setClientCount(NODE_COUNT).setIntensity(1);
    initializeTestRunner();
  }

  @Override
  protected Class getApplicationClass() {
    return GenericList15TestApp.class;
  }

}
