package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{CCY, DATE, GUID, IID}

case class Portfolio (id: IID,
                      guid: GUID,
                      name: String,
                      team: IID,
                      rccy: Option[CCY],
                      isin: Option[String],
                      domicile: Option[String],
                      manager: Option[String],
                      objective: Option[String],
                      benchmark: Option[IID],
                      riskprofile: Option[IID],
                      inception: Option[DATE],
                      accounts: Set[IID])
  extends Record[IID]
