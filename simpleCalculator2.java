

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class simpleCalculator2 {
    public static void main(String[] args)
    {
        // Scanner object
        Boolean cacl = true;
       
        //Stores two numbers
        double num1,num2;
        //user input
        Scanner sc = new Scanner(System.in); 
        
        //Rounds of variable
        int n = 1;
        //increment the counter
        double counter = 0;


         //array lisi
         ArrayList<Integer> user = new ArrayList<Integer>();
         int counterr = 0;

        while(counter < n) 
        {
          System.out.println("Round:" + n); 
          //increment the Rounds
          n++; 
                  

        while(cacl)
        {
            //choose the options (1-8)
            System.out.println("Welcome to the khande's calculater");

            System.out.println("Enter your calculator option pleace(1-8) ");

           //print the choose the options

            System.out.println("Enter 1 to stop the program:");

            System.out.println("Enter 2 for multiplication");

            System.out.println("Enter 3 for Difference");

            System.out.println("Enter 4 for sum");

            System.out.println("Enter the 5 for divison");

            System.out.println("Enter 6 for squar root");

            System.out.println("Enter 7 for power");

            System.out.println("Enter 8 for modulo");

            System.out.println("Enter 9 for show the history");

            System.out.println("Choose the Number:");

            //given the user integer input
             int userInput = sc.nextInt();
             if(user.size() > 10){
              //clear the history
               user.clear();
             }
             user.add(userInput);
            //the condition is equal to 1 the calculater will be stop
            if(userInput == 1)
            { 
                
                //read the stop statement
                cacl = true;

                //print the stop
                System.out.println("Enter 1 to stop the program:");
               // user.add(1);
                
            }
               //the condtion is equal to 2, the operation is multiplication of the two numbers
              else if(userInput == 2)
              {
                //read the condition
                cacl = true;

                System.out.println("Multiplication of the two Numbers:");
                // Take the inputs
               //read the first number
                System.out.println("Enter the First number:");
                num1 = sc.nextDouble();
               //read the second number
                System.out.println("Enter the second number:");
                num2 = sc.nextDouble();
             
             //print the result of multiplication of the two numbers
            
               System.out.println( "Result of the two numbers is:"+ num1  * num2);

               // user.add(2);
            }
            //read the condition is equal to 3, the operation is difference between the two numbers
              else if(userInput == 3)
              {
                //read the condition
                cacl = true;
                System.out.println("Difference of the two numbers:");
                // Take the inputs
                //read the first number
                System.out.println("Enter the first number:");
                num1 = sc.nextDouble();
                //read the second input
                System.out.println("Enter the second number");
                num2 = sc.nextDouble();
                //print the difference between the two numbers
                System.out.println("Result of the two numbers is :");
                System.out.println(num1  - num2);
              
               // user.add(3);
                
                }
                  //read the condition is equal to 4, the operation is sum of the two numbers
                    else if(userInput == 4)
                    {
                     //read the condition
                     cacl = true;
                       System.out.println("Sum of the two numbers:");
                     // Take the inputs
                     //read the first number
                       System.out.println("Enter the first number:");
                       num1 = sc.nextDouble();
                     //read the second number
                       System.out.println("Enter the second number");
                       num2 = sc.nextDouble();
                     //print sum of the two numbers
                       System.out.println("Result of the two numbers is");
                       System.out.println(num1  + num2);

                      // user.add(4);
                    }
                      //read condtion is equal to 5, the operation will be works division of th etwo numbers
                        else if(userInput == 5)
                        {
                            //read the condition
                            cacl = true;
                            System.out.println("Division of the two numbers");
                            // Take the inputs
                            //read the first condition
                            System.out.println("Enter the First number:");
                            num1 = sc.nextDouble();
                            //read the second condtion
                            System.out.println("Enter the second number:");
                            num2 = sc.nextDouble();
                            //print the division of the two numbers
                            System.out.println("Result of the two number is:");
                            System.out.println(num1  / num2);
                            
                           // user.add(5);
                        }
                          // read the condition 6, the operation will be works squar root of the number
                         else if(userInput == 6)
                        {
                          //read the condition
                          cacl = true;
                           System.out.println("Squar root of the number:");
                           
                            // Take the inputs
                            //read the user input
                            System.out.println("Enter the number:");
                            double X = sc.nextDouble();
                            // squar of the number be works using math.sqrt();
                            double R = Math.sqrt(X);
                            System.out.println("The square root of " + X + " is " + R);
                            
                           // user.add(6);
                        }     
                              
                         //read the condition 7 it will be works power of the user input
                       else if(userInput == 7){
                          System.out.println("Enter the number:");
                            num1 = sc.nextDouble();
                            //read the power of the firsr input
                            System.out.println("Enter the power");
                            num2 = sc.nextDouble();
                           double result = Math.pow(num1, num2);
                            System.out.println(result);
                        }
                         //read the condition 8, it will be works on modulo
                         else if(userInput == 8)
                         {
                            //read the condition true
                            cacl = true;
                            System.out.println("Modulo of the two numbers:");
                            // Take the inputs
                            //read the first input 
                            System.out.println("Enter the first number:");
                            num1 = sc.nextDouble();
                            //read the second input
                            System.out.println("Enter the second number");
                            num2 = sc.nextDouble();
                            //print the modulo result
                            System.out.println("Result of the two numbers is:");
                            System.out.println(num1  % num2);
                           // user.add(8);
                        }
                        else if(userInput == 9)
                        {
                          System.out.println("Show the history");
                          //read the user
                          System.out.println(user);
                          

                          break;
                        }
                        //user will be choose the incorrect number it will be print the choose the correct number
                        else
                        {
                        System.out.println("Choose the correct number upto 1 to 9");
                       }
                       
                          //increment the Rounds based on the condition
                          counter++;

                          // print the loop can be how many time exsicuted 
                          System.out.println(counter);
                      }
      }
    }
}
