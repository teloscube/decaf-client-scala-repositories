package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{GUID, IID}

case class Institution (id: IID,
                        guid: GUID,
                        name: String,
                        accounts: Set[IID],
                        sharings: Set[IID])
  extends Record[IID]
