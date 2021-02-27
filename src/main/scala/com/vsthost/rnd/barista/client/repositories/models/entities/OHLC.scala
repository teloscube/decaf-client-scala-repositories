package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class OHLC (id: IID,
                 guid: GUID,
                 symbol: String)
  extends Record[IID]
