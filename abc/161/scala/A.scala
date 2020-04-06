import java.util.Scanner
 
object Main extends App {
  val sc = new Scanner(System.in)
  var arr: Array[Int] = Array(-1, -1, -1)
 
  for(x <- 1 to 3) {
    val inputInt: Int = sc.nextInt
    arr(x - 1) = inputInt
  }
 
  println(arr(2) + " " + arr(0) + " " + arr(1))
}
