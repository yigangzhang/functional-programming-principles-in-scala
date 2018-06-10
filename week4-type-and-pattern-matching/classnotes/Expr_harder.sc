trait Expr {
  def eval() : String = this match {
    case Number(x) => x.toString
    case Sum(l, r) => s"(${l.eval} + ${r.eval})"
    case Var(x) => x
    case Prod(l,r) => s"${l.eval} * ${r.eval}"
  }

  def show() : String = this match {
    case Number(x) => x.toString
    case Sum(l, r) => s"(${l.show} + ${r.show})"
    case Var(x) => x
    case Prod(l,r) => s"${l.eval} * ${r.eval}"
  }
}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Var(x: String) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr

Sum(Number(1), Number(3)).show

Sum(Prod(Number(2), Var("x")), Var("y")).show
Prod(Sum(Number(2), Var("x")), Var("y")).show


