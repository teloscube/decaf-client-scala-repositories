package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{DATETIME, GUID, IID}

case class Sharing (id: IID,
                    guid: GUID,
                    started: DATETIME,
                    institution: IID,
                    percentage: BigDecimal,
                    kickback: BigDecimal)
  extends Record[IID]
