let randomArr = [4, 7, 2, 6, 2, 0, 5, 8, 1];

let min = randomArr[0];
let max = randomArr[0];

for (let i = 0; i < randomArr.length; i++) {
    if (randomArr[i] < min) {
        min = randomArr[i];
    }

    if (randomArr[i] > max) {
        max = randomArr[i];
    }
}

let minSecond = randomArr[0];
let maxSecond = randomArr[0];

for (let j = 0; j < randomArr.length; j++) {
    if (randomArr[j] < minSecond && min !== randomArr[j]) {
        minSecond = randomArr[j];
    }

    if (randomArr[j] > maxSecond && max !== randomArr[j]) {
        maxSecond = randomArr[j];
    }
}

console.log("Array Elements : " + randomArr + "\nSecond Largest Number : " + maxSecond +
    "\nSecond Smallest Element : " + minSecond);