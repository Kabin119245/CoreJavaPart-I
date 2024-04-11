public class array_three {
    public static void main(String[] args) {
        
        int nums [] = new int[4]; //initially all values are zero
        nums[0] = 9;
        nums[1] = 7;
        nums[2] = 4;
        nums[3] = 15;

        //printing single value
        System.out.println(nums[3]);
        //printnig all values
        for (int i = 0; i < 4; i ++) {
            System.out.println(nums[i]);
        }

    }
}
