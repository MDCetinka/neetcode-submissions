class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //map tanımlıcaz harfi görünce kaç keredir gördüğünü de tutacak bu map bittikten sonra (belki bi variableda en büyük değeri vs tutabiliriz de)
        Map<Integer, Integer> map =new HashMap<>();
        
        for (int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i] ) ){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        //valuelar için array, sorted. Sonra loopla k kadarını döndür
        

        var list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

int[] arr = new int[k];
        for(int i =0; i<k ;i++){
            arr[i] = list.get(i).getKey();
        }

        return arr;
    }
}
