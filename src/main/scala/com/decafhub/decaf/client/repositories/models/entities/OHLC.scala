package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{GUID, IID}

case class OHLC (id: IID,
                 guid: GUID,
                 symbol: String)
  extends Record[IID]
