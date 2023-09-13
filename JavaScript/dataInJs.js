// let myCreateData = new Date(2023,0,23)

// let myCreateData = new Date(2023,0,23,5,3)

// let myCreateData = new Date("2023-01-14")

// console.log(myCreateData.toLocaleString());

// console.log((myCreateData.toLocaleString));

let myCreateData = new Date("01-14-2023")

let myTimeStamp = Date.now()
// console.log(myTimeStamp);
// console.log(myCreateData.getTime());

console.log(Math.floor(Date.now()/1000));

let newDate = new Date()
console.log(newDate);
console.log(newDate.getMonth() + 1);

newDate.toLocaleString('default',{
    weekday: "long"
})