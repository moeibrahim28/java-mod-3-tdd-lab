public class FizzBuzz {
    public String fizzBuzzString(String str) {

        if (str == null) {
            throw new IllegalArgumentException();
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalArgumentException();
            } else if ((arr[i].startsWith("f")) && (arr[i].endsWith("b"))) {
                arr[i] = "FizzBuzz";
            } else if (arr[i].startsWith("f")) {
                arr[i] = "Fizz";
            } else if (arr[i].endsWith("b")) {
                arr[i] = "Buzz";
            }


        }
        return arr;
    }
}