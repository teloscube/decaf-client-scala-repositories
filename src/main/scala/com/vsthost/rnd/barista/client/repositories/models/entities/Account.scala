package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{CCY, DATE, GUID, IID}

case class Account (id: IID,
                    guid: GUID,
                    name: String,
                    portfolio: IID,
                    custodian: IID,
                    rccy: Option[CCY],
                    atype: Option[IID],
                    riskprofile: Option[IID],
                    inception: Option[DATE],
                    opened: Option[DATE],
                    closed: Option[DATE],
                    mfpercentages: Set[IID])
  extends Record[IID]
