class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}
const numberBox = new Box<number>(123);
console.log("Number Box Value:", numberBox.getValue());

const stringBox = new Box<string>("Hello, TypeScript!");
console.log("String Box Value:", stringBox.getValue());
