

function groupAnagrams(wordArray){
    let anagrams = {}
    
    for(let char of wordArray){
        const sortWord = char.split("").sort().join("");
        if(!anagrams[sortWord]){
            anagrams[sortWord] = [];
        }
        anagrams[sortWord].push(char);
    }
    
    return Object.values(anagrams);
}

console.log(groupAnagrams(['eat', 'tea', 'tan', 'ate', 'nat', 'bat']));
