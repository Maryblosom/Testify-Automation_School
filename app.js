//      // Callback
// function greetings(greet) {
//     greet();
// }

// function callback() {
//     console.log("Good morning");
// }

// greetings(callback);

             //OR 

// function greetings(greet) {
//     greet();
// }

// greetings(function() {
//     console.log("Good morning");
// })


//    Function Expression
// const myGreet = function (name) {
//     console.log("Good morning," + name);
// }

// myGreet("Nick");





//greet("Nick") //declared fnx
 //function greet(name){
//     console.log("Good morning," + name );
// }




// function greet(name){
//     console.log("Good morning," + name );
// }

// greet("Nick")

// function greet(){
//     const myName = "Ben";
//     console.log("Good morning, " + myName); 
//     function innerGreet() {
//         console.log("Good evening, " + myName);
//     }
    
//     innerGreet();
// }

 


// const myName = "Ben"

// function greet(){
//     console.log("Good morning, " + myName); 
//     function innerGreet() {
//         console.log("Good evening, " + myName);
//     }
    
//     innerGreet();
// }

// greet();








// function addNumbers (firstNumber, secondNumber){
//     const sum = firstNumber + secondNumber;
//     const product = firstNumber * secondNumber;
//     return [sum, product]
// }
//  //console.log(addNumbers(4, 5));

//      function converter(dollar){
//         //convert to dollar and return the equivalent dollar value
//         //conversion rate: 410 to 1 dollar
//         const naira = dollar * 418;
//         return naira
//      }

//      const nairaValue = converter(100);

//      console.log(nairaValue)



// function addNumbers (firstNumber, secondNumber){
//     const sum = firstNumber + secondNumber;
//     const multiply = firstNumber * secondNumber;
//     return sum;
// }
// const moreop= addNumbers(7.9, 4.9)+ 20;

// console.log(moreop)




// function addNumbers (firstNumber, secondNumber){
//     const sum = firstNumber + secondNumber;
//     console.log(sum)
// }
// addNumbers(7.9,4.9);



// function greeting(name) {
//     console.log("Good morning, " + name);
// }

// greeting("Mary");


// function Myfunction(){         //function delcaration
//     console.log("My first function!");
// }

// Myfunction(); // function call

// for(let number = 1; number <=10; number = number +1){
//     if(number % 2 === 0) {
//         console.log(number +" is an even number")
//     } else {
//         console.log(number +" is an odd number")
//     }
// }

//       //While Loops
   
// let star = 1 //starting point 
//  while(star<=100){ //condition
//     if(star === 1){
//         console.log(star + " star")
//     } else
//         console.log(star + " stars")
     
//      star = star + 1 // statment
//  }




// const day = "Thursday"

// if(day==="Friday"){
//     console.log("TGIF")
// } else if("Saturday"){
//     console.log("Yeh! The weekend is here")
// } else if("Sunday"){
//     console.log("Happy Sunday")
// } else {
//     console.log("Go to work!")
// } instead of running all these, use the switch statment(conditional statement) 


// switch(day){
//     case "Friday":
//         console.log("TGIF")
//         break
//     case "Saturday":
//         console.log("Yeh! It is weekend")
//         break
//     case "Sunday":
//         console.log("Happy Sunday")
//         break
//     default:
//         console.log("Go to work!")        
        

// }









// const age = 78

// if(age>=18 && age <= 65) {
//     console.log('You are eligiable to vote')
// } else if(age>65){
//     console.log('You are too old to vote')
// } else {
//     console.log('You are too young to vote')
// }



// if(age>=18) {
//     console.log('You are eligiable to vote')
// } else if(age>65){
//     console.log('You are too old to vote')
// } else {
//     console.log('You are too young to vote')
// }


/*if(age>=18) {
    console.log('You are eligable to vote')*/

// if(age>=18) {
//     console.log('You are eligable to vote')
// } else {
//     console.log('You are too young to vote')
// }