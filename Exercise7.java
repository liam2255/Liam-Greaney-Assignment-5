import java.util.Random;

public class Exercise7{

  public static void main(String[] args){

    Exercise7 liam = new Exercise7();


	int[] numbers = {10,20,30,40,50,60,70,80,90,100};

	//Max number
	int max = getMax(numbers);
		System.out.println("Maximum Value is: "+max);

	//Min number
	int min = getMin(numbers);
    	System.out.println("Minimum Value is: "+min+"\n");

	//Reorganized Array
	System.out.print("Reorganized array:\n ");
		for(int i = 0; i < numbers.length; i++){
			System.out.print("\n"+numbers[i]);
	}
	System.out.println();
    //uncomment the line of code below when running Index
	//Index.main(null);
}




  public int[] reorganize(int [] numbers ){ // public int[] reorganize(int[] numbers = {10,20,30,40,50,60,70,80,90,100} ){

  			Random rnd = new Random();

  			for(int i = numbers.length - 1; i >= 0; i--){

  				int index = rnd.nextInt(i + 1);
  				//simple swap
  				int a = numbers[index];
  				numbers[index] = numbers[i];
  				numbers[i] = a;
  				}
  				return numbers;
			}

		 //Max Value Method
 		 public static int getMax(int[] inputArray){
  		  int maxValue = inputArray[0];
   			 for(int i=1;i < inputArray.length;i++){
     			 if(inputArray[i] > maxValue){
        		 maxValue = inputArray[i];
    	  }
   		 }
    	return maxValue;
  }

		 //Min Value Method
   		 public static int getMin(int[] inputArray){
      	  int minValue = inputArray[0];
     		 for(int i=1;i<inputArray.length;i++){
       			 if(inputArray[i] < minValue){
         		 minValue = inputArray[i];
        }

      }

      return minValue;

  }

}
