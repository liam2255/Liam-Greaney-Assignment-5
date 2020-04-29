
import java.util.Scanner;

public class Exercise4{
        public static void main(String[] args){

        	 Scanner input = new Scanner(System.in);

			 int counter = 0;
			 int x = 1;
			 int num;

			 while(counter <= 1){
				System.out.print("Enter a number from 1 to 10: ");
        		num = input.nextInt();

        		if(num > 10){
					System.out.println("Invalid number entered. Please try again. ");
					}
					else if(num < 0){
						System.out.println("Invalid number entered. Please try again. ");
						}
						else if(num < 10 && num > 0){
							while(x <= num){
								System.out.println(x+". Liam");
								x++;
								counter++;
							}

					}
				}

            //comment the line of code below to run this code without bringing up index
			Index.main(null);
			}

        }
