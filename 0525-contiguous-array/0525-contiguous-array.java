class Solution {
    public int findMaxLength(int[] a) {
        Map<Integer,Integer> hm = new HashMap<>();
        if(a.length <=1 )
         return 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int flg0 = 0;
        int flg1 = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                flg0=1;
                sum=sum-1;
            }
            else
            {
                 sum++;
                 flg1=1;
            }
          
             //sum += a[i]==0?-1:1;
            if(sum ==0 )
            {
                ans = Math.max(ans,i+1);
            }
            if(hm.containsKey(sum))
            {
                ans = Math.max(ans,i-hm.get(sum));
            }
            else
            {
                hm.put(sum,i);
            }
        }
        if(flg0 == 0 || flg1 == 0)
         return 0;
        return ans;
    }
}