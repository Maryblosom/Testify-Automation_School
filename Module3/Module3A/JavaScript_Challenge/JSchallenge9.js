let sentence = "This challenge is challenging"

function countVowels(sentence) {
  let x = sentence.match(/[aeiou]/gi);
  return x === null ? 0 : x.length;
}

console.log(countVowels(sentence))