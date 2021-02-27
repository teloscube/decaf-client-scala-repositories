package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class RiskProfile (id: IID,
                        guid: GUID,
                        name: String,
                        order: Int,
                        description: Option[String])
  extends Record[IID]
