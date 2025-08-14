var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(123);
console.log("Number Box Value:", numberBox.getValue());
var stringBox = new Box("Hello, TypeScript!");
console.log("String Box Value:", stringBox.getValue());
