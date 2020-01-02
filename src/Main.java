
public class Main {

//    visualization:
//    nums = "----->-->"; k =3
//    result = "-->----->";

//    reverse "----->-->" we can get "<--<-----"
//    reverse "<--" we can get "--><-----"
//    reverse "<-----" we can get "-->----->"

    public static void main(String[] args) {

        rotate( new int[]{1,2,3,4,5,6,7,8} , 3);
        new java.util.Scanner(System.in).nextLine();
        rotate( new int[]{1,2,3,4,5,6,7,8} , 6);

    }

    public static void rotate(int[] nums, int k) {

        if(nums == null || nums.length < 2){
            return;
        }

        k = k % nums.length;

        //first side : from 0 to one before breaking index [breaking index is nums.lenght-k]
        reverse(nums, 0, nums.length - k - 1);
        //res -> 5,4,3,2,1

        //second side : breaking index (nums.length - k) until last index
        reverse(nums, nums.length - k, nums.length - 1);
        //res -> 8,7,6

        //reverse the whole array
        reverse(nums, 0, nums.length - 1);
        //res -> 6,7,8,1,2,3,4,5

    }

    private static void reverse(int[] nums, int i, int j){
        int tmp = 0;
        while(i < j){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }

}
