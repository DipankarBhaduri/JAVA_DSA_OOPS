package Two_Pointer;
import java.util.*;

public class Two_Sum_Pairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            Collections.sort(list);
            String ans = "";
            for (int val : list) {
                ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }

    public static List<List<Integer>> twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr) ;
        int start = 0 ;
        int end = arr.length - 1 ;
        List<List<Integer>> ans = new ArrayList<>() ;
 
        while ( start <= end ){
            if ( arr[start] + arr [end] == target ){
                if( !map.containsKey(arr[start])){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[start]);
                    temp.add(arr[end]);
                    ans.add(temp);
                }

            } else if ( arr[start] + arr [end] > target ){
                 end-- ;
            } else {
                start++ ;
            }
        }

        return ans ;
    }
}