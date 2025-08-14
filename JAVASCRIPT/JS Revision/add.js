function add(a) {
    return function add2(b) {
        return function add3(c) {
            return function add4(d) {
                return function add5(e) {
                    return a+b+c+d+e
                }
            }
        }
    }
}
console.log(add(5)(3)(2)(7)(6));

//partial application
let add2 = add(6);
let add3 = add2(5);
let sum = add(3)(2);
let result = add3();
console.log(add(5)(3)(2));