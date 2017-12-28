package bug

import sangria.macros.derive.GraphQLField

trait Mutation {
  @GraphQLField
  def addUser(firstName: String, lastName: Option[String]) = {
    val user = User(firstName, lastName)

    // add(user)
    user
  }

  // ...
}

case class User(firstName: String, lastName: Option[String])
object User {
  import sangria.macros.derive.deriveObjectType
  implicit val UserType = deriveObjectType[MyCtx, User]()
}

case class MyCtx(mutation: Mutation)