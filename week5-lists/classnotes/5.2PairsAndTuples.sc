def msort(xs: List[Int]): List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (fst, snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}

def merge0(xs: List[Int], ys: List[Int]): List[Int] = xs match {
  case Nil => ys
  case x :: xs1 =>
    ys match {
      case Nil => xs
      case y :: ys1 =>
        if (x < y) x :: merge0(xs1, ys)
        else y :: merge0(xs, ys1)
    }
}


val pair = Pair("answer", 42)
val (label, value) = pair

val l = pair._1
val v = pair._2

def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
  case (Nil, _) => ys
  case (_, Nil) => xs
  case (x :: xs1, y :: ys1) =>
    if (x < y) x :: merge(xs1, ys)
    else y :: merge(xs, ys1)
}

msort(List(3,2,4,5,1,8,3))
merge(List(3,6,9), List(1,4,5,8,10))
