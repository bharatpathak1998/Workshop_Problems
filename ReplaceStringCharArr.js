function replace(arr, arr1) {
    for (let i = 0; i < arr.length; i++) {
        let str = arr[i];
        let n = '';
        for (let j = 0; j < str.length; j++) {
            if (str[j] === '0') {
               n += '1';
            } else {
                n += '0';
            }
        }
        arr1.push(n);
    }
    console.log(arr1);
}

let arr = ["1110", "0000", "1111", "0011"];
let arr1 = [];
replace(arr, arr1);