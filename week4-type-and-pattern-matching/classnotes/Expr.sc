trait Expr {
  def eval() : Int = this match {
    case Number(x) => x
    case Sum(l, r) => l.eval + r.eval
  }

  def show() : String = this match {
    case Number(x) => x.toString
    case Sum(l, r) => s"${l.show} + ${r.show}"
  }
}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

Sum(Number(1), Number(3)).show