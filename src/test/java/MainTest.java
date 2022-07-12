import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {
    //private FizzBuzz fizzbuzz;
    //    @BeforeEach
    //    public void setUp(){
    //        this.fizzbuzz=new FizzBuzz();
    //    }

    private String[] FizzBuzzArray = new String[]{"flew", "club", "flab","clear", null};
    private String[] expectedFizzBuzzArray = new String[]{"Fizz", "Buzz", "FizzBuzz","clear", ""};


    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertArrayEquals(expectedFizzBuzzArray, fizzBuzz.fizzBuzzStringArray(FizzBuzzArray));
    }
}