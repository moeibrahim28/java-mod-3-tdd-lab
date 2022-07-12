import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    private String[] FizzBuzzArray = new String[]{"flew", "club", "flab"};
    private String[] expectedFizzBuzzArray = new String[]{"Fizz", "Buzz", "FizzBuzz"};


    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
            assertArrayEquals(expectedFizzBuzzArray,fizzBuzz.fizzBuzzStringArray(FizzBuzzArray));

    }
}


