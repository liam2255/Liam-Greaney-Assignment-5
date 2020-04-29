
public class Exercise5{
        public static void main(String[] args){

			int sum = 0;
			int total = 0;

		    int[] x = {20, 30, 40, 50};
		    System.out.println("Index\tValue\n");

		    for(int i = 0; i < x.length; i++){
			System.out.println(i+"\t"+x[i]);
			total = total + x[i];
			}

			sum = total / x.length;

       		System.out.println("The Average is " + sum);
       		System.out.println("The Total is " + total);

            //comment the line of code below to run this code without bringing up index
			Index.main(null);
			}

        }
