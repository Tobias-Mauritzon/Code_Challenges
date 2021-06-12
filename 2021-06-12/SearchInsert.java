import java.util.Arrays;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {10,20,15,22,35}, 1));
        System.out.println(searchInsert(new int[] {10,20,15,22,35}, 11));
        System.out.println(searchInsert(new int[] {10,20,15,22,35}, 10));
        System.out.println(searchInsert(new int[] {10,20,15,22,35}, 16));
    }

	//Returns where number is inserted or where it should be inserted
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return (index<0 ? Math.abs(index+1) : index);
    }
}
