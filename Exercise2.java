import java.util.Scanner;

public class Exercise2{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

			int num1;
			int num2;
			int plus;
			int minus;
			int multi;

		    System.out.print("Enter number : ");
		    num1 = input.nextInt();
		    System.out.print("Enter another number : ");
		    num2 = input.nextInt();

		    plus = + num1 + num2;
		    minus = num1 - num2;
		    multi = num1 * num2;

			System.out.println(num1+" + "+num2+" = "+plus);
			System.out.println(num1+" - "+num2+" = "+minus);
			System.out.println(num1+" * "+num2+" = "+multi);

            //uncomment the line of code below when running Index
			//Index.main(null);
			}

        }
