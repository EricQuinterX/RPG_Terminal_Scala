package personajes

trait state {
  def health: Int = 0
  def attack: Int = 0
  def defence: Int = 0
  def exp: Int = 0
//  def bag: Inventory = _
}

trait Tecnicas {
  def atacar (a: Persona) =  0
}

class Persona (
  override val health: Int,
  override val attack: Int,
  override val defence: Int
) extends state
    with Tecnicas
{
  def info = "asdsad"
}

trait TipoLuchador {
  val tipos = Map[Int, Persona](
    1 -> Espadachin,
    2 -> Guerrero,
    3 -> Mago
  )
  override def toString = this.getClass.getSimpleName.split("\\$").last
}
case object Espadachin extends Persona(60, 8, 3) with TipoLuchador
case object Guerrero extends Persona(80, 5, 4) with TipoLuchador
case object Mago extends Persona(50, 10, 1) with TipoLuchador

