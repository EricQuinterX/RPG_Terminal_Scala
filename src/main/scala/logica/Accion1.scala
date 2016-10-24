package logica

import personajes._
import scala.io.StdIn.readLine

abstract class Action1 extends TipoLuchador {
  def start()
}

case object Seleccion extends Action1 {
  type Descripcion = String
  val op1 = tipos // attr of TipoLuchador

  def start() {
    println("\nElegir un Luchador...")
    val tam = op1.size
    for (i <- 1 to tam)
      println(s"$i - ${op1(i)}")
    readLine("Elije Luchador: ") match {
      case x if x.toInt <= tam => Empezar(op1(x.toInt)).start()
      case _ =>
        println("Opcion Invalida")
        start()
    }
  }
}



case object SalirAccion1 extends Action1 {
  def start() = Core.showInit()
}