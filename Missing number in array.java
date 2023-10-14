class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int j=1;
        for(int i=0;i<n-1;i++,j++){
            if(array[i]!=j){
                return j;
            }
        } return j;
    }
}
