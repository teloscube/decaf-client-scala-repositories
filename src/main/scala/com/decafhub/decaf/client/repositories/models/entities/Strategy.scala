package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{GUID, IID}

case class Strategy (id: IID,
                     guid: GUID,
                     name: String,
                     description: Option[String])
  extends Record[IID]
