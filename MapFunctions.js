let map = new Map();

// Here we are adding the elements :-
map.set("Name", "Sansk")
map.set("Age", 23)
map.set("City", "Amravati")
map.set("Gender", "F")

// Retrieve the data :-
console.log(map)

for (let [key, value] of map) {
    console.log(key + " => " + value)
}

// Here we are taken the value by key :-
console.log("Taking value by key : " + map.get("Name"))

// Here we are delete the value by key :-
map.delete("Age")
console.log(map)

// For the boolean (Key is contains or not) :-
console.log(map.has("City")) // Here City is contains so true

// check size of map :-
console.log(map);
console.log(map.size);

// Clear key-value from the map :-
map.clear();
console.log(map);

//--------------------------------------------------------------------


// Here we are create map1 and map2 and adding key - values :-
let map1 = new Map([[1,"Bharat"],[2,"Shashank"],[3,"Vikas"]]);
let map2 = new Map([[4,"Sanskruti"],[5,"Virat"],[6,"Prabhu"]]);

// Here we are merging both the map :-
let merged = new Map([...map1, ...map2, [1,"Yash"]])
let merged1 = new Map([...map1, ...map2, [1,"Yash"],[2,"Mohit"]])

console.log(merged)
console.log(merged1)

// Here we are check key 7 contains or not :-
let hasKey = merged.has(7)
console.log(hasKey) // Output :- false


// Here we are delete the value by using key :-
merged.delete(1)
console.log(merged) // retrieve data of Map

// Here we are check key contains or not when contains then print the value : -
if (merged.has(2)) {
    console.log(merged.get(2))
}