var a=10;
function fun(a){
    console.log(a);
    var a=20;
    function foo(a){
        a++;
        console.log(a);
        var a=30;
    }
    foo(a)
}
fun(a)