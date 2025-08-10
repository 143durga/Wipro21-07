package com.wipro.testsuit;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.wipro.JunitTest","com.wipro.FileOps", "com.wipro.Solid", "com.wipro.Test" })
public class AllTests {
   
}
