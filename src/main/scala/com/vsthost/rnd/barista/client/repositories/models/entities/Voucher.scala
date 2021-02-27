package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{CCY, DATE, GUID, IID}

case class Voucher(id: IID,
                   guid: GUID,
                   commitment: DATE,
                   ctype: String,
                   currency: CCY,
                   sharing: BigDecimal,
                   kickback: BigDecimal,
                   amount: BigDecimal,
                   gross: BigDecimal,
                   net: BigDecimal,
                   account: Option[IID],
                   portfolio: Option[IID],
                   team: Option[IID],
                   institution: Option[IID],
                   trade: Option[IID],
                   settlement: Option[IID],
                   notes: Option[String],
                   remarks: Option[String])
  extends Record[IID]
