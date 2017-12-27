package bug

import sangria.macros.derive._

object Derivation {

  val MutationType = deriveContextObjectType[MyCtx, Mutation, Unit](_.mutation
    /*,  IncludeMethods("addUser")*/ // Uncomment this and compilation will succeed
  )
}
