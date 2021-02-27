package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{DATETIME, GUID, IID}

case class ManagementFeeScheme (id: IID,
                                guid: GUID,
                                started: DATETIME,
                                account: IID,
                                value: BigDecimal,
                                style: String)
  extends Record[IID]
