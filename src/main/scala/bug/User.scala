package bug

case class User(firstName: String, lastName: Option[String])
object User {
  import sangria.macros.derive.deriveObjectType
  implicit val UserType = deriveObjectType[MyCtx, User]()
}