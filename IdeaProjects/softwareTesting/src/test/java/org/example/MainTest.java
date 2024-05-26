package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {



    @BeforeAll
    public static void beforeAll() {
        System.out.println("code returning before all other methods");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("code running before each method");
    }
    @Test
    public void test1(){
        System.out.println("run test");
    }
@Test
    public void test_when_b_is_pozitive(){
        Assertions.assertEquals(2,(ush.pjestimiNr(12,6)));
    }
    @Test
    public void test_when_b_is_negative(){
        Assertions.assertEquals(-2,(ush.pjestimiNr(12,-6)));
        //assertion kontrollon
    }
    @Test
    public void test_when_b_is_zero(){
        Assertions.assertEquals(0,(ush.pjestimiNr(12,0)));
    }

    //@Test
    //void shouldAddTwoNumbers() {
    //    int result = 1 + 3;
    //
    //    Assertions.assertThat(result)
    //        .isEqualTo(4)
    //        .isNotEqualTo(5)
    //        .isLessThan(6)
    //        .isGreaterThan(3)
    //        .isBetween(0, 10);
    //kjo behet me org.assertj.core.api.



}
