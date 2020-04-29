
import java.util.Scanner;

public class Index{
        public static void main(String[] args){

			Scanner input = new Scanner(System.in);

			int option = 0;

			System.out.println();
			System.out.print("Choose an Exercise (1-7)\nChoose 8 to exit\n:");
			option = input.nextInt();
			System.out.println("\nYou chose Exercise "+option);

			if(option == 1){
				System.out.println();
				Exercise1.main(null);
			}
				else if(option == 2){
					System.out.println();
					Exercise2.main(null);
					}
				else if(option == 3){
					System.out.println();
					Exercise3.main(null);
					}
				else if(option == 4){
					System.out.println();
					Exercise4.main(null);
					}
				else if(option == 5){
					System.out.println();
					Exercise5.main(null);
					}
				else if(option == 6){
					System.out.println();
					Exercise6.main(null);
					}
				else if(option == 7){
					System.out.println();
					Exercise7.main(null);
					}
				else if(option == 8){
					System.out.println("You exited the program ");
					}
					else{
						System.out.println("Exercise "+option+" does not exist");
						Index.main(null);
					}


			}

        }


