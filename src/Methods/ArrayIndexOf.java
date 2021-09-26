package Methods;

public class ArrayIndexOf {

    public static int count8(int n) {
        if(n==0) return 0;
        else if(n%10==8 && count8(n/10)==8) return 2+count8(n/100);
        else if(n%10==8) return 1+count8(n/10);
        else return count8(n/10);
    }

    public static int indexOf(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x) return i+1;
        }
        return -1;
    }
    public static int indexOf(int[] arr, int x, int pos){
        for (int i = pos; i < arr.length; i++) {
            if(arr[i]==x) return i+1;
        }
        return -1;
    }
    public static String endX(String str) {
        if(str.length()<1) return "";
        if(str.charAt(0)=='x') return endX(str.substring(1))+"x";
        else return str.charAt(0)+str.substring(1);
    }
    public static boolean groupSum(int start, int[] nums, int target) {
        if(start>=nums.length) return false;
        for(int i=start;i<nums.length;i++){
            if(nums[start]+nums[i]==target) return true;

        }
        return groupSum(start+1,nums,target);
    }


    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(groupSum(0, arr, 1));
        System.out.println(endX("xhixhix"));
        System.out.println(count8(8818));
        int[] nums={1,2,3,4,5,6,7,78,8,9,8,7,6,5,4};
        System.out.println(indexOf(nums,7));
        System.out.println(indexOf(nums,7,indexOf(nums,7)));
    }
}
