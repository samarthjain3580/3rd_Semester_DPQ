function step1(fn){
    console.log("please wait i am selecting image...");
    setTimeout(function(){
        console.log("image selected successfully");
        fn("Selected image")
    },4000)
}
function step2(image){
    console.log("please wait i am applying filter to s{image}...");
    setTimeout(function(){
        return "filtered image"
    },2000)

}

step1(function(image){
    step2(image)
})