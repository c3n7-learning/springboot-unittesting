package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run unit JIRA #123 is resolved")
    void basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // execute method and perform asserts
    }


    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void testForLinuxAndWindowsOnly() {
        // execute method and perform asserts
    }


    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void testOnlyForJava18() {
        // execute method and perform asserts
    }


    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testOnlyForJava11() {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_18)
    void testOnlyForJavaRange() {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11)
    void testOnlyForJavaRangeMin() {
        // execute method and perform asserts
    }
}
