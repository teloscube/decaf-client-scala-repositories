package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{GUID, IID}

case class Team (id: IID,
                 guid: GUID,
                 name: String,
                 members: Set[IID],
                 portfolios: Set[IID])
  extends Record[Int]
