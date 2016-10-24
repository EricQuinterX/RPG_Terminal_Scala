package logica

import personajes.Persona
import scala.io.StdIn.readLine

abstract class Action2 { def start() }

case class Empezar (p: Persona) extends Action2 {
  type Descripcion = String
  def op2 = Map[Int, (Action3, Descripcion)] (
    1 -> (Luchar(p), "Luchar con un enemigo Aleatorio"),
    2 -> (VerInfo(p), "Ver Informacion del Personaje"),
    3 -> (Descansar(p), s"Descansar, costara ${Descansar(p).precio} pesos"),
    4 -> (Dejar(p), "Volver al Menu de Inicio")
  )

  def menu2(p: Persona) {
    println("\nBienvenido a la aventura ...")
    for (i <- 1 to op2.size)
      println(s"$i - ${op2(i)._2}")
    readLine("Elija una opcion: ") match {
      case i if i.toInt <= op2.size => op2(i.toInt)._1.start()
      case _ =>
        println("Opcion Invalida")
        menu2(p)
    }
  }

  def start() {
    menu2(p)
  }
}

case class SalirAccion2(p: Persona) extends Action2 {
  def start() = System.exit(1)
}
