package com.vsthost.rnd.barista.client.repositories

/**
  * Provides a package object which defines common idioms for *barista* data modelling.
  */
package object models {
  /**
    * Defines a type alias for DECAF GUIDs.
    */
  type GUID = String

  /**
    * Defines a type alias for currency codes.
    */
  type CCY = String

  /**
    * Defines a type alias for DB primary keys of integer type.
    */
  type IID = Int

  /**
    * Defines a type alias for values representing dates.
    */
  type DATE = String

  /**
    * Defines a type alias for values representing times.
    */
  type TIME = String

  /**
    * Defines a type alias for values representing date/time instances.
    */
  type DATETIME = String

  /**
    * Defines a type alias for values representing email addresses.
    */
  type EMAIL = String
}
