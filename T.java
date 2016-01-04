public int binarySearch(int[] res, int low, int high, int target){
        while(low + 1< high){
            int mid = low + (high - low) / 2;
            if(res[mid] == target){
                return mid; //start = mid; // end = mid;
            }else if(res[mid] < target){
                low = mid;
            }else{
                high = mid;
            }
        }
        if(res[low] == target) 
        	return low;
        else
            return high;
    }