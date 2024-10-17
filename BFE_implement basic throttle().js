
// This is a JavaScript coding problem from BFE.dev 

/**
 * @param {(...args:any[]) => any} func
 * @param {number} wait
 * @returns {(...args:any[]) => any}
 */
function throttle(func, wait) {
  // your code here
  let waiting = false, lastArgs, timer;
  function throttler(...args) {
    if (!waiting) {
      waiting = true;
      func.apply(this, args);
      clearTimeout(timer);
      timer = setTimeout(() => {
        if (lastArgs) {
          func.apply(this, lastArgs);
          lastArgs = undefined;  // Reset lastArgs after using them
        }
        waiting = false;
      }, wait)
    } else {
      lastArgs = args;
    }
  }
  return throttler;
}


