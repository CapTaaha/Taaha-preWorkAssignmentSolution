import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
           System.out.println("Enter your number: ");
           int n1=sc.nextInt();
           int i,r,n2=0;
           i=n1;
           while(n1>0){
               r=n1%10;
               n2=(n2*10)+r;
               n1=n1/10;
           }
           if(n2==i){
               System.out.println("The given number is a palidrome.");
           }
           else{
               System.out.println("The given number is not a palidrome.");
           }
      }

 

            //function to printPattern

       public void printPattern() {
         System.out.println("Enter your number: ");
         int n3=sc.nextInt();
         for (int i= n3-1; i>=0 ; i--)  {  
              //outer loop  
               for (int j=0; j<=i; j++)  
                   {  
                       //prints star and space  
                        System.out.print("*" + " ");  
                     }  
                  //throws the cursor in the next line after printing each line  
                System.out.println();  
             }  
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
            System.out.println("Enter your number: ");
            int n4=sc.nextInt();
            int m=0,prime=0;
            m=n4/2;      
            if(n4==0||n4==1){  
             System.out.println(n4+" is not prime number");      
             }else{  
                   for(int i=2;i<=m;i++){      
                  if(n4%i==0){      
                      System.out.println(n4+" is not prime number");      
                        prime=1;      
                        break;      
                     }      
                 }      
            if(prime==0)  { System.out.println(n4+" is prime number"); }  
          }
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1,n,i,count=10;
           System.out.println(first+" "+second);
           for(i=2;i<count;++i){
               n=first+second;    
               System.out.print(" "+n);    
               first=second;    
               second=n;    
           }System.out.println();
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}