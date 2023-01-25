// Here we are taking arrow function without using method :-
let sum = (a, b) => {
    return (a + b);
}
console.log("Adding a and b : " + sum(12, 8));
//--------------------------------------------------------


// Here we are taking arrow function by using method :-
function multiply() {
    let multi = (x, y) => {
        return x * y;
    }
    console.log("Multiply x and y : " + multi(12, 2));
}
multiply(); // Calling function
//--------------------------------------------------------


// Here we are check 12 is even or not :-
const isEven = num => num % 2 === 0;
console.log("Is Even : " + isEven(12)) // Output :- true
//---------------------------------------------------------


// Here we are getting last letter of a string :-
const lastLetter = str => str.slice(-1);
console.log(lastLetter("Bharat")) // Output :- t
//----------------------------------------------------------


// Reverse a string :-
const reverseString = str => str.split('').reverse().join('');
console.log(reverseString("Bharat")); // Output :- tarahB
// ----------------------------------------------------------


// Here we are taken backtick ${Math.PI} :-
function str(name) {
    console.log(`cube of 2 : ${name}`);
}

let name = Math.pow(2, 3);
str(name);
// -----------------------------------------------------------