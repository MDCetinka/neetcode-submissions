class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        int[] sortedNums = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            sortedNums[i] = nums[i];
        }

        Arrays.sort(sortedNums); //az olduysa ilerle, fazla olduysa geri git

        int p1 =0;
        int p2 =nums.length-1; //  p1 ve p2 konumları, nums[p1] değerler

    while( p1 != p2){
        if(sortedNums[p1] + sortedNums[p2] > target){
            p2--;
        }else if(sortedNums[p1]+ sortedNums[p2] <target){
            p1++;
        }else{
            ans[0]= sortedNums[p1];
            ans[1] = sortedNums[p2];
            break;
        }
    }
int firstInt = -9;
int secondInt = -9;

    for(int i=0; i<nums.length;i++){
        if(ans[0] == nums[i] && firstInt ==-9){
            firstInt = i;
        }
        if(ans[1] == nums[i] && i != firstInt && secondInt ==-9){
            secondInt= i;
        }
    }
ans[0] = firstInt;
ans[1] = secondInt;
Arrays.sort(ans);
    return ans;
    }
        
}