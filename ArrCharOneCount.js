function print(arr) {
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
        let ch = arr[i];
        for (let j = 0; j < ch.length; j++) {
            if (ch[j] === '1') {
                count++;
            }
        }
    }
    return count;
}

let arr = ["1100", "0011", "0101", "0000", "1111"];
console.log("One Count : " + print(arr));