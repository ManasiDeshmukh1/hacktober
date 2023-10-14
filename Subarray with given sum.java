class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        if(s==0){
            list.add(-1);
            return list;
        }
        int i=0;
        int j=0;
        int sum=arr[0];
        while(j<n){
            if(sum==s){
                list.add(i+1);
                list.add(j+1);
                return list;
            }else if(sum<s){
                j++;
                if(j<n){
                sum+=arr[j];
                }
                
            }else if(sum>s){
                sum-=arr[i];
                i++;
            }
        }
        list.add(-1);
        return list;
    }
}
