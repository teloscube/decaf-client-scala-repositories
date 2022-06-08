package com.decafhub.decaf.client.repositories.models.entities

import com.decafhub.decaf.client.core.Record
import com.decafhub.decaf.client.repositories.models.{
  DATE,
  EMAIL,
  GUID,
  IID,
}

case class Principal(
    id: IID,
    guid: GUID,
    username: String,
    email: Option[EMAIL],
    is_active: Boolean,
    privileged: Boolean,
    groups: Set[IID],
    teams: Set[IID],
    first_name: Option[String],
    last_name: Option[String],
    mobile: Option[String],
    last_login: Option[DATE],
    date_joined: Option[DATE],
) extends Record[IID]
