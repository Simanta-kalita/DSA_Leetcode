const removeDuplicates = (str) => {
  let result = "";

  for(let s of str){
    if(!result.includes(s)){
      result += s;
    }
  }
  return result;
}
