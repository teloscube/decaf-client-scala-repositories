package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{
  DATETIME,
  GUID,
  IID,
}

case class ManagementFeeScheme(
    id: IID,
    guid: GUID,
    started: DATETIME,
    account: IID,
    value: BigDecimal,
    style: String,
) extends Record[IID]
