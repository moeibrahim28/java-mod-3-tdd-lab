public class FizzBuzz {
    public String fizzBuzzString(String str) {

        if (str == null) {
            str = "";
        } else if ((str.startsWith("f")) && (str.endsWith("b"))) {
            str = "FizzBuzz";
        } else if (str.startsWith("f")) {
            str = "Fizz";
        } else if (str.endsWith("b")) {
            str = "Buzz";
        }


        return str;
    }

    public String[] fizzBuzzStringArray(String[] arr) {
        String[] adjustedArray = arr;
        for (int i = 0; i < adjustedArray.length; i++) {
            arr[i] = fizzBuzzString(adjustedArray[i]);

        }
        return adjustedArray;
    }
}