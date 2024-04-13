public class enhanced_forloop {
    
        public static void main(String[] args) {
            int nums[][] = new int [3][4];
            //initially all values are 0;
            //display all values
    
            for (int i = 0; i < 3; i++) { //nums.lenght
                for (int j = 0; j < 4; j++) { //nums[i].lenght
                    //assigning random values
                    nums[i][j] = (int)(Math.random() * 100);
                }
            }
    //enhanced for loop
          for (int n[] : nums) { //getting array from array
            for (int m : n) { //getting value from array
                System.out.print(m + " ");
            }
            System.out.println();
          }
             
        }
    
}
