class TwoUniqueElements{
    public int[] singleNumber(int[] nums){
        int xor = 0;
      // elements 2 2 4 4 9 7
		for(int i = 0; i<nums.length; i++) xor = xor ^ nums[i];  // xor all the elements you will end up with 9^7 = 1110 = 14
		int count = 0;
		while(xor>0){
			if((xor&1)==1) break;       //1110 & 0001 = 0; c=1; xor=1110>>1; xor=0111;   
			count++;                    // 0111&0001 = 0001 = 1; break; 
			xor = xor >> 1;
		}
		
		int mask = 1 << count; // 01=1; 1<<01; 10=2;  
		int ans[] = new int[2];
		for(int i = 0; i<nums.length; i++){
			if((nums[i]&mask)==0) ans[0] ^= nums[i]; // 4^4^9 = 9; 
			else ans[1] ^= nums[i]; // 2^2^7 = 7;
		}
		Arrays.sort(ans); // 9 7--> 7 9;
		return ans;
    }
}
