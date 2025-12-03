const nestedArray = [1, [2, [3, [4]]]];
const nestedArray1 = [2, [4, [6, [8]]]];

const mergedArray = [...nestedArray, ...nestedArray1].flat(Infinity);

const result = Array.from(new Set(mergedArray));

console.log(result);
