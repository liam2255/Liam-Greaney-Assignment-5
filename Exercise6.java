import java.util.Scanner;

public class Exercise6{
        public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			char single = '\0';
			int rows;
			int columns;
			int counter = 0;;
			int x = 1;

			System.out.print("Enter a symbol : ");
		    single = input.next().charAt(0);

			System.out.print("Enter number of rows : ");
		    rows = input.nextInt();

			System.out.print("Enter number of columns: ");
		    columns = input.nextInt();

			System.out.println("");

			while(counter < rows){

			System.out.print(single + " ");

			while(x < columns){
			System.out.print(single + " ");
			x++;
			}
			x= 1;
			counter++;
			System.out.println("");

			}
			 Index.main(null);
			}

        }