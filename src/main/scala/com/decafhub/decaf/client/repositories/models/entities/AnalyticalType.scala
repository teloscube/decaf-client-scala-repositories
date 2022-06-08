package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{
  GUID,
  IID,
}

case class AnalyticalType(
    id: IID,
    guid: GUID,
    name: String,
    description: Option[String],
) extends Record[IID]
