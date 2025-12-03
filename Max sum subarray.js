function maxSubArray(arr, k){
    let left = 0;
    let windowSum = 0;
    let maxSum = 0;
    
    for(let right = 0; right < arr.length; right++){
        windowSum += arr[right];
        
        if(right - left + 1 === k){
            maxSum = Math.max(windowSum, maxSum);
            windowSum -= arr[left];
            left++;
        }
    }
    return maxSum;
}

console.log(maxSubArray([2, 1, 5, 1, 3, 2], 3)); 
