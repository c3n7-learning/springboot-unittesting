package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    @DisplayName("Before ForEach")
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    // @DisplayName("Equals and Not Equals")
    void test_Equals_And_Not_Equals() {
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
    }

    @Test
    // @DisplayName("Null and Not Null")
    void test_Null_And_Not_Null() {
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not null");
    }

//    @AfterEach
//    void tearDownAfterEach() {
//        System.out.println("Running @AfterEach \n");
//    }
//
//    @BeforeAll
//    static void setupBeforeEachClass() {
//        System.out.println("@BeforeAll executes only once before all tests methods execute in the class");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll() {
//        System.out.println("@AfterAll executes only once after all test methods execute in the class");
//    }
}
