package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class Institution (id: IID,
                        guid: GUID,
                        name: String,
                        accounts: Set[IID],
                        sharings: Set[IID])
  extends Record[IID]
