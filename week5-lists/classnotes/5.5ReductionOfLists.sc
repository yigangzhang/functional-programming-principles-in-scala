val nums = List(1,2,3,4,5,6,7,8,9,10)

nums reduceLeft ((x, y) => x + y)
nums reduceLeft ((x, y) => x * y)
nums reduceLeft (_ + _)
nums reduceLeft (_ * _)

//////val nums0: = List(0)
////nums0 reduceLeft ((x, y) => x + y)
//nums0 reduceLeft ((x, y) => x * y)

(nums foldLeft 0) (_ + _)
(List(0) foldLeft 0) (_ + _)
(nums foldLeft 1) (_ * _)
(List(0) foldLeft 1) (_ * _)

def concat[T](xs: List[T], ys: List[T]): List[T] = (xs foldRight ys)(_ :: _)
concat(List(1,2,3), List(4,5,6))

//def concat2[T](xs: List[T], ys: List[T]): List[T] = (xs foldLeft ys)(_ :: _)
//concat2(List(1,2,3), List(4,5,6))

def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())(f(_) :: f(_))


//def lengthFun[T](xs: List[T]): Int =
//  (xs foldRight 0)(1 + 1)