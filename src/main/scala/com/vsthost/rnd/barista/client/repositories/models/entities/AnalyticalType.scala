package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class AnalyticalType (id: IID,
                           guid: GUID,
                           name: String,
                           description: Option[String])
  extends Record[IID]
