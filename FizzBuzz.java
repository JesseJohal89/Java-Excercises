/*
Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz.
Run your code in bash: java FizzBuzz

*/

class FizzBuzz {
 
    public static void main(String[] args) {
 
        // for loop from 1 - 100
        for (int i = 1; i <= 100; i++){
		      
          //prints if it's' a multiple of 5 & 3
          if ((i % 5 == 0) && (i % 3 == 0)) {
            System.out.println("FizzBuzz");
          }

          //prints if it's' a multiple of 5
          else if (i % 5 == 0) {
            System.out.println("Buzz");
          }

          //prints if it's' a multiple of 3
          else if (i % 3 == 0) {
            System.out.println("Fizz");
          }

          // if none of the above conditions met then print i
          else {
            System.out.println(i);
          }

      }
 
    }
 
}
