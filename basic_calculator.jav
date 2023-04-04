/*
This is an basic Calculator ion Java
Created by Jesse in 2022.
*/

  public class Calculator{
    public Calculator(){
    }

    // add method
    public int add(int a, int b){
      return a + b;
    }

    // subtract method
    public int subtract(int a, int b){
     return a - b;
    }

    // mutiply method
    public int multiply(int a, int b){
     return a * b;
    }
    // divide method
    public double divide(int a, int b){
     return a / b;
    }
     // modulo method
    public int modulo(int a, int b){
     return a % b;
    }

    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
      System.out.println(myCalculator.multiply(10, 5));
      System.out.println(myCalculator.divide(100, 11));
      System.out.println(myCalculator.modulo(69, 13));
  }
}
