public class Recursion {
    public static void main(String[] args) {
       int k = 10;
       System.out.println(sum(k));
      }
      public static int sum(int k){
        if(k>0){
          return k + sum(k - 1);
        }else {
          return 0;
        }
      }
}
/*Dacoda's Break Down: 
 Recursion is adding a list of numbers.
 The sum method calls for one parameter of 
 an integer. This integer is the starting point
 for the recursion. ie: 10 + 9 + 8.....
 k = 10 therefore the recursion begins at 10.
 If k is greater than 0 add 10 + the next number 
 after 10 when 1 is subtracted. That will continue
 until 0 is reached. 
 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
 If it required k to be greater than 5; k>5, then
 it would be this:
 10 + 9 + 8 + 7 + 6 = 40
 In the return, if k - 2, that would return a recursion
 that went every other number backwards like this: 
 10 + 8 + 6.
 */
// Storing the sum() in a variable, then passing
// the variable in the s.o.u.t
// int result = sum(10);
// System.out.println(result);
// }
// public static int sum(int k) {
// if (k > 0) {
//   return k + sum(k - 1);
// } else {
//   return 0;
// }