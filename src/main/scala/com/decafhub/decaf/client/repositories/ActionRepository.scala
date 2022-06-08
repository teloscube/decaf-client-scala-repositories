package com.decafhub.decaf.client.repositories

import com.decafhub.decaf.client.core.BaristaClient
import com.decafhub.decaf.client.repositories.algebra.Repository
import com.decafhub.decaf.client.repositories.models.entities.Action
import io.circe.generic.auto._

import scala.language.higherKinds

/** Provides a remote API repository for [[Action]]s.
  *
  * @param api The API algebra to be used to work on records.
  * @tparam F Context type parameter.
  */
class ActionRepository[F[_]](
    api: BaristaClient[F],
) extends Repository[F, Int, Action](
      api,
      "trades",
    )
