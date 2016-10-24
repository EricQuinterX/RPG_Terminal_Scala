package logica


import personajes.Persona


abstract class Action3 {
  def start()
}

case class Luchar(p: Persona) extends Action3 {
  def start() {

  }
}

case class VerInfo (p: Persona) extends Action3{
  def start() = p.info
}

case class Descansar (p: Persona) extends Action3 {
  def start() {

  }

  def precio = p.exp / 50
}

case class Dejar(p: Persona) extends Action3 {
  def start() {
    Core.showMenu_1()
  }
}