function longestSubstringWithoutRepeating(str) {
  longest = ''
  current = ''
  
  for(let char of str){
    if(current.includes(char)){
      current = current.slice(0,current.indexOf(char) + 1);
    }
    current += char;

    if(current > longest){
      longest = current;
    }

    return longest;
  }
}
