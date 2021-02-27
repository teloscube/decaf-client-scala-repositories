package com.vsthost.rnd.barista.client.repositories

import com.vsthost.rnd.barista.client.core.BaristaClient
import com.vsthost.rnd.barista.client.repositories.algebra.Repository
import com.vsthost.rnd.barista.client.repositories.models.entities.Quant
import io.circe.generic.auto._

import scala.language.higherKinds


/**
  * Provides a remote API repository for [[Quant]]s.
  *
  * @param api The API algebra to be used to work on records.
  * @tparam F Context type parameter.
  */
class QuantRepository[F[_]](api: BaristaClient[F])
  extends Repository[F, Int, Quant](api, "quants")
