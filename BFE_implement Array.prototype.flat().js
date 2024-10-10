

// This is a JavaScript coding problem from BFE.dev 
/**
 * @param { Array } arr
 * @param { number } depth
 * @returns { Array }
 */
function flat(arr, depth = 1) {
  // your imeplementation here
  let result = [];
  for(let item of arr){
    if(Array.isArray(item) && depth > 0){
      result.push(...flat(item, depth - 1));
    } else {
      if(item) result.push(item);
    }
  }
  return result;
}
