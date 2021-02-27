package com.vsthost.rnd.barista.client.repositories

import com.vsthost.rnd.barista.client.core.BaristaClient
import com.vsthost.rnd.barista.client.repositories.algebra.Repository
import com.vsthost.rnd.barista.client.repositories.models.entities.Voucher
import io.circe.generic.auto._

import scala.language.higherKinds


/**
  * Provides a remote API repository for [[Voucher]]s.
  *
  * @param api The API algebra to be used to work on records.
  * @tparam F Context type parameter.
  */
class VoucherRepository[F[_]](api: BaristaClient[F]) extends Repository[F, Int, Voucher](api, "vouchers") {
  /**
    * Filters and returns all filtered records.
    *
    * This method uses the [[Repository#filter]] method, but overrides filters to disable extra calculations.
    *
    * @param filters List of filters.
    * @return [[List]] of all filtered records.
    */
  override def filter(filters: BaristaClient.Params): F[List[Voucher]] = super.filter(filters ++ Map("extras" -> "0"))
}
