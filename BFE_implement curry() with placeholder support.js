
// This is a JavaScript coding problem from BFE.dev 

/**
 * @param { (...args: any[]) => any } fn
 * @returns { (...args: any[]) => any }
 */
function curry(fn) {
  // your code here
  return function curried(...args){
    const sanitisedArgs = args.slice(0, fn.length);

    const isPlaceholder = sanitisedArgs.some(item => item == curry.placeholder);

    if(!isPlaceholder && sanitisedArgs.length === fn.length){
      return fn.apply(this, sanitisedArgs);
    } 

    return function next(...nextArgs){
        return curried.apply(this, mergeArgs(sanitisedArgs, nextArgs));
      }
    
  }
}

function mergeArgs(args, nextArgs){
  let result = [];
  args.forEach(arg => {
    if(arg == curry.placeholder){
      result.push(nextArgs.shift());
    } else {
      result.push(arg);
    }
  })
  return [...result, ...nextArgs];
}


curry.placeholder = Symbol()

