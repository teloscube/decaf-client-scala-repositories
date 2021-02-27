package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class Strategy (id: IID,
                     guid: GUID,
                     name: String,
                     description: Option[String])
  extends Record[IID]
