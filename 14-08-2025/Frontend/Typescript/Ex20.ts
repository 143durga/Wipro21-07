function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

const numStringPair = pair<number, string>(101, "Durga");
const boolDatePair = pair<boolean, Date>(true, new Date());

console.log("Number & String Pair:", numStringPair);
console.log("Boolean & Date Pair:", boolDatePair);
