/**
 * @param {number} num
 */
function sum(num) {
  // your code here
  const func = function(num2){
    return num2 ? sum(num + num2) : num;
  }

  func.valueOf = () => num;
  return func;

}
