import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)
    print("Please enter number of tickets:")
    var tickets=scanner.nextInt()
    print("How many roundtrip tickets:")
    var Round=scanner.nextInt()
    val tic=TesterKotlin(tickets,Round)
    tic.print()
}
class  TesterKotlin(var tickets:Int,var Round:Int){
    fun print(){
        println("Total tickets:"+tickets)
        println("Round-trip:"+Round)
        println("Total:"+(tickets*1000+Round*2000*0.9))
    }
}