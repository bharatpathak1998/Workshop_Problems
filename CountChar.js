function countChar(n) {
    let count = 0;
    for (let i = 0; i < n.length; i++) {
        let ch = n.charAt(i).toLowerCase();
        if (ch === 'a') {
            count++;
        }
    }
    return count;
}
const prompt = require("prompt-sync")();
let name = prompt("Enter name to check 'a' count : ");
console.log(countChar(name));