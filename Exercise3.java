import java.util.Scanner;

public class Exercise3{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

			int num;
			int small;
			int large;

			System.out.print("Enter number : ");
		    num = input.nextInt();

		    if(num > 21){
				System.out.println(num+" is greater than 21");
				}
		    	else if(num < 21){
					System.out.println(num+" is less than 21");
					}
						else if(num == 21){
							System.out.println(num+" is equal to 21");
							}

            //comment the line of code below to run this code without bringing up index
			Index.main(null);
			}

        }
