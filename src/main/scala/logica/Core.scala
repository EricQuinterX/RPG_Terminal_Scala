package logica

import scala.io.StdIn._
//import personajes._

object Core {

  def showInit() {
    println("##################################################")
    println("#######                                  #########")
    println("#######  Bienvenido a RPG Terminal Game  #########")
    println("#######                                  #########")
    println("##################################################")
  }

  def showMenu_1() {
    val op1 = Map[Int, (Action1, String)] (
      1 -> (Seleccion, "Iniciar Juego"),
      2 -> (SalirAccion1, "Salir del Juego")
    )
    println()
    println("Accion a Realizar ... ")
    for (i <- 1 to op1.size)
      println(s"$i - " + op1(i)._2)
    readLine("Elija una accion: ") match {
      case x if x.toInt <= op1.size => op1(x.toInt)._1.start()
      case _ =>
        println("Opcion invalida")
        showMenu_1()
    }
  }

  def start(): Unit = {
    showInit()
    showMenu_1()
  }

}




