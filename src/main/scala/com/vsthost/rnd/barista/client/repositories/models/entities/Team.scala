package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models.{GUID, IID}

case class Team (id: IID,
                 guid: GUID,
                 name: String,
                 members: Set[IID],
                 portfolios: Set[IID])
  extends Record[Int]
