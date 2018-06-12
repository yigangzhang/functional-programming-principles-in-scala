def last[T](xs: List[T]): T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys => last(ys)
}

//last(List())
last(List(1))
last(List(1,2,3,4))

def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y :: init(ys)
}

//init(List())
init(List(1))
init(List(1,2,3,4))

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case z :: zs => z :: concat(zs, ys)
}

concat(List(), List(4,5,6))
concat(List(1), List(4,5,6))
concat(List(1,2,3), List(4,5,6))

def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case y :: ys => reverse(ys) ++ List(y)
}

reverse(List())
reverse(List(1))
reverse(List(1,2,3,4))

def removeAt[T](xs: List[T], n: Int): List[T] = (xs take n) ++ (xs drop n + 1)

removeAt(List(1,2,3,4), 0)
removeAt(List(1,2,3,4), 1)
removeAt(List(1,2,3,4), 2)
removeAt(List(1,2,3,4), 3)
removeAt(List(1,2,3,4), 6)

//def flatten(xs: List[Any]): List[Any] = xs match {
//  case List() => xs
//  case List(y) :: ys => flatten(y :: ys)
//  case y :: ys => y :: flatten(ys)
//}

def flatten(xs: List[Any]): List[Any] = xs match {
  case List() => xs
  case y :: ys => y match {
    case z: List[Any] => flatten(z) ++ flatten(ys)
    case _ => y :: flatten(ys)
  }
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))
flatten(List())
flatten(List(1,2,3))
flatten(List(1))
flatten(List(List(1)))
flatten(List(List(List(1))))
