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