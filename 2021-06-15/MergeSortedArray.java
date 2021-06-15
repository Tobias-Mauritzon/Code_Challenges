import java.util.LinkedList;

public class MergeSortedArray {
    public static void main(String[] args) {

        merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        merge2(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
    }

    //merges 2 sorted arrays in arr1
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        m--;
        n--;
        for(int i = nums1.length-1; i >= 0; i--){
            
            if(m < 0){
                nums1[i] = nums2[n];
                n--;
            }else if(n < 0){
                nums1[i] = nums1[m];
                m--;
            }else{
                if(nums1[m] > nums2[n]){
                    nums1[i] = nums1[m];
                    m--;
                }else{
                    nums1[i] = nums2[n];
                    n--;
                }
            }   
                 
        }

    }

    // does not work for [1]
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        LinkedList<Integer> list = new LinkedList<>();

        int j = 0;
        int i = 0;
        while( i < nums1.length){
            if(i < m){
                if(nums1[i] < nums2[j]){
                    list.addLast(nums1[i]);
                    i++;
                }else{
                    list.addLast(nums2[j]);
                    j++;
                }
            }else{
                if(j >= n)break;
                list.addLast(nums2[j]);
                j++;
                i++;
            }
        }
        System.out.println(list.toString());
        for (int x = 0; x < nums1.length; x++) {
            nums1[x] = list.removeFirst();
        }
    }
}
