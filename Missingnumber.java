class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int missing=n;
        Arrays.sort(array);
        
        for(int i=0;i<n-1;i++){
            if(array[i]==i+1){
                continue;
            }
            else 
                return i+1;
           
            
        }
        return missing;
    }
}
