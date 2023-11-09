const listOfNumbers = [2, 5, 5.5, 3, 6.8, 0, -5, -7, -9]; //or use let instead of var
const filtrate = el => Number.isInteger(el) && el < 0;

console.log(listOfNumbers.filter(filtrate))