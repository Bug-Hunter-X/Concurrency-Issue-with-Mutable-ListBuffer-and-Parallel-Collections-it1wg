```scala
import scala.collection.immutable.List

object Main extends App {
  val list = List(1, 2, 3)

  // This is now thread-safe
  list.par.foreach(println)
}
```