def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * factor :: scaleList(ys, factor)
}

scaleList(List(), 2)
scaleList(List(1), 2)
scaleList(List(1,2,3,4), 2)

//abstract class List[T] extends List[T] {
//  def map[U](f: T => U): List[U] = this match {
//    case Nil => this
//    case x :: xs => f(x) :: xs.map(f)
//  }
//}


def scaleList2(xs: List[Double], factor: Double): List[Double] = xs map (x => x * factor)
scaleList2(List(), 2)
scaleList2(List(1), 2)
scaleList2(List(1,2,3,4), 2)

def squareList(xs: List[Int]): List[Int] = xs match {
  case Nil => xs
  case y :: ys => y * y :: squareList(ys)
}
squareList(List())
squareList(List(1))
squareList(List(1,2,3,4))


def squareList2(xs: List[Int]): List[Int] = xs map (x => x * x)
squareList2(List())
squareList2(List(1))
squareList2(List(1,2,3,4))

def posElem(xs: List[Int]): List[Int] = xs match {
  case Nil => xs
  case y :: ys => if (y > 0) y :: posElem(ys) else posElem(ys)
}
posElem(List())
posElem(List(1))
posElem(List(-1))
posElem(List(1,-2,3,-4))

//abstract class List[T] extends List[T] {
//  def filter[T](p: T => Boolean): List[T] = this match {
//    case Nil => this
//    case x :: xs => if(p(x)) x :: xs.filter(p) else xs.filter(p)
//  }
//}

def posElem2(xs: List[Int]): List[Int] = xs filter (x => x > 0)
posElem2(List())
posElem2(List(1))
posElem2(List(-1))
posElem2(List(1,-2,3,-4))