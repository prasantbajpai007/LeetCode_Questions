class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[a.length];
          for(int i= b.length-1;i>=0;i--)
          {
               while(!st.isEmpty()&&st.peek()<b[i])
               {
                st.pop();
               }

               if(st.isEmpty())
               {
                hm.put(b[i],-1);
               }
               else
               {
                hm.put(b[i],st.peek());
               }

               st.push(b[i]);
          }

        for(int i=0;i<a.length;i++)
        {
            ans[i]=hm.get(a[i]);
        }
        return ans;
    }
}