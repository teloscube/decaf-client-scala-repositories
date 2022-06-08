package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{
  GUID,
  IID,
}

case class RiskProfile(
    id: IID,
    guid: GUID,
    name: String,
    order: Int,
    description: Option[String],
) extends Record[IID]
