public class LeetCode {
    
    //Topics: Greedy , Graph ,Sorting,TreeMap


//Ques:  https://leetcode.com/problems/maximum-total-importance-of-roads/description/?envType=daily-question&envId=2024-06-28

//Solution 1
    // class Solution {
    //     public long maximumImportance(int n, int[][] roads) {
    //         long ans = 0, x = 1;
    //         long degree[] = new long[n];
    //         for(int road[] : roads){
    //             degree[road[0]]++; 
    //             degree[road[1]]++;
    //         }
    //         Arrays.sort(degree);
    //         for(long i : degree) ans +=  i * (x++) ;
    //         return ans;
    //     }
        //Solution 2
    //  public long maximumImportance(int n, int[][] roads) {
    //         TreeMap<Integer,Integer>map=new TreeMap<>();
    //         for(int i[]:roads){
    //             map.put(i[0],map.getOrDefault(i[0],0)+1);
    //             map.put(i[1],map.getOrDefault(i[1],0)+1);
    //         }
    //         long ans=0;
    //         long x=n;
    //         List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
    //         Collections.sort(list,(a,b)->b.getValue()-a.getValue());
    //         for(Map.Entry<Integer,Integer>entry:list){
    //         ans+=entry.getValue()*(x--);
    //         }
    //         return ans;
    //     }
    }
