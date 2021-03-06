/**
 * this method is overloaded
 * two methods with same name different signatures
 * the compiler chooses which to call based on how you call it
 * if I call printHW()  I will get the first method
 * if I call printHW(any int)  I will get the second method
 *  
 * print Hello World on the console 50 times
 * 
 *  * 
 * @author pcampbell
 * @version 1.0
 * 
 * 
 **/
 public static void printHW() {
     int count=0;
     while (count < 50) {
        System.out.print("Hello World");
        count++;
     }
 } // printHW()
 /**
 * this method is overloaded
 * two methods with different signatures
 * the compiler chooses which to call based on how you call it
 * if I call printHW()  I will get the first method
 * if I call printHW(any int)  I will get the second method
 *  
 * print Hello World on the console the number of times in param
 * 
 *  
 * @author pcampbell
 * @version 1.0
 * 
 * @param int limit limit number of times printing Hello World on the console
 * 
 **/
 public static void printHW(int limit) {
     int count=0;
     while (count < limit) {
        System.out.print("Hello World");
        count++;
     }
 } // printHW()
