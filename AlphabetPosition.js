function print(name) {
    let sum = 0;
    for (let j = 0; j < name.length; j++) {
        let count = 1;
        let ch = name.charAt(j).toLowerCase();
        for (let i = 'a'.charCodeAt(0); i <= 'z'.charCodeAt(0); i++) {
            if (ch === String.fromCharCode(i)) {
                console.log(ch + "->" + count)
                sum += count;
            }
            count++;
        }
    }
    console.log("\nSum Of alphabets number : " + sum)
}

const prompt = require("prompt-sync")();
let name = prompt("Enter any name to get alphabet position : ")
print(name);