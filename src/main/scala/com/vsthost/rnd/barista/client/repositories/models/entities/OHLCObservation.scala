package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{DATE, GUID, IID}

case class OHLCObservation(id: IID,
                           guid: GUID,
                           series: IID,
                           symbol: String,
                           date: DATE,
                           open: Option[BigDecimal],
                           high: Option[BigDecimal],
                           low: Option[BigDecimal],
                           close: BigDecimal,
                           volume: Option[BigDecimal],
                           interest: Option[BigDecimal],
                          )
  extends Record[IID]
