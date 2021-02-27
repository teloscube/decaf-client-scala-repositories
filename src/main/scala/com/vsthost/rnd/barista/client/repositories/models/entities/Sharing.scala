package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{DATETIME, GUID, IID}

case class Sharing (id: IID,
                    guid: GUID,
                    started: DATETIME,
                    institution: IID,
                    percentage: BigDecimal,
                    kickback: BigDecimal)
  extends Record[IID]
