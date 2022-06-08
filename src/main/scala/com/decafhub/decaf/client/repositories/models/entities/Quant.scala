package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{
  CCY,
  DATE,
  IID,
}

// TODO: Add GUID with the 0.8.12 release.
case class Quant(
    id: IID,
    ctype: Int,
    `type`: String,
    commitment: DATE,
    settlement: DATE,
    executedat: Option[DATE],
    pseudorder: Option[DATE],
    symbol: String,
    resource: IID,
    quantity: BigDecimal,
    valccy: CCY,
    valamt: BigDecimal,
    account: IID,
    account__name: String,
    trade: IID,
    cflag: Option[Int],
    refccy: Option[CCY],
    refamt: Option[BigDecimal],
) extends Record[IID]
