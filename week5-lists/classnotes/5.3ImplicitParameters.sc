def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (lt(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }
    val (fst, snd) = xs splitAt n
    merge(msort(fst)(lt), msort(snd)(lt))
  }
}


val nums = List(3,2,4,5,1,8,3)
msort(nums)((x: Int, y: Int) => x < y)
msort(nums)((x, y) => x < y)

val fruits = List("apple", "pineapple", "orange", "banana")
msort(fruits)((x: String, y: String) => x.compareTo(y) < 0)
msort(fruits)((x, y) => x.compareTo(y) < 0)