package bug

import sangria.macros.derive._
import sangria.schema.ObjectType

object Derivation {
  val MutationType: ObjectType[MyCtx, Unit] = deriveContextObjectType[MyCtx, Mutation, Unit](_.mutation
    /*,  IncludeMethods("addUser")*/ // Uncomment this and compilation will succeed
  )
}
