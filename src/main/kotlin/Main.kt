import kotlin.math.pow

fun main(){
    lado("gloria","mery","sniada","pualin")
    cities()
    number()
    println(mama("glo","mary","joyce"))
    sec(2,3,4)
    seu()

}
fun lado(name1:String,name2:String,name3:String,name4:String ){
    var name = arrayOf(name1,name2,name3,name4)
    println(name.contentToString())


}
   fun cities(){
       var city = arrayOf("nairobi","kampala","kigali","mombasa")
       println(city.map { it.capitalize() }.sorted())
   }
fun number(){
    var numbers = arrayOf(30,40,50,60,70,80,90,100)
    println(numbers[1]+numbers[3])
    println(numbers.indexOf(90))
    println(numbers.sortedArrayDescending().contentToString())
}
fun mama(name1: String, name2: String,name3: String):String{
    var num = arrayOf(name1,name2,name3,name3,)
    return num.contentToString()

}
fun sec(num1:Int,num2:Int,num3:Int){
    var sequre = arrayOf(num1*num1,num2*num2,num3*num3)
    println(sequre.contentToString())

}
fun seu(){
    var number = arrayOf(6,7,5)
    for (num in number)
        println(num.toDouble().pow(2))

}