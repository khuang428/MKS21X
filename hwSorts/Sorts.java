public class Sorts{
    static void selection(int[]nums){
	for(int ctr=0;ctr<nums.length;ctr++){
	    int min=nums[ctr];
	    int index=ctr;
	    for(int i=ctr++;i<nums.length;i++){
		if(nums[i]<min){
		    min=nums[i];
		    index=i;
		}
	    }
	    nums[i]=nums[ctr];
	    nums[ctr]=min;
	}
    }
}