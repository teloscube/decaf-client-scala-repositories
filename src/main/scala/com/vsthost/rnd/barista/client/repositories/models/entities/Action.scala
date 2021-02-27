package com.vsthost.rnd.barista.client.repositories.models.entities

import com.vsthost.rnd.barista.client.core.Record
import com.vsthost.rnd.barista.client.repositories.models._
import io.circe.{Json, JsonObject}

case class Action(id: IID,
                  guid: GUID,
                  ctype: IID,
                  `type`: String,
                  stype: Option[String],
                  atype: Option[IID],
                  cflag: Option[Int],
                  commitment: DATE,
                  settlement: DATE,
                  executedat: Option[TIME],
                  pseudorder: Option[Int],
                  accmain: IID,
                  resmain: IID,
                  qtymain: BigDecimal,
                  accaltn: Option[IID],
                  resaltn: Option[IID],
                  qtyaltn: Option[BigDecimal],
                  acccomp: Option[IID],
                  rescomp: Option[IID],
                  qtycomp: Option[BigDecimal],
                  accundr: Option[IID],
                  resundr: Option[IID],
                  qtyundr: Option[BigDecimal],
                  acccntr: Option[IID],
                  rescntr: Option[IID],
                  qtycntr: Option[BigDecimal],
                  accprin: Option[IID],
                  resprin: Option[IID],
                  qtyprin: Option[BigDecimal],
                  accintr: Option[IID],
                  resintr: Option[IID],
                  qtyintr: Option[BigDecimal],
                  pxmain: Option[BigDecimal],
                  pxcost: Option[BigDecimal],
                  pxaux1: Option[BigDecimal],
                  pxaux2: Option[BigDecimal],
                  pxaux3: Option[BigDecimal],
                  pxnavs: Option[BigDecimal],
                  shrcls: Option[IID],
                  agent: Option[IID],
                  feeagt: Option[IID],
                  feeccy: Option[CCY],
                  feeqty: Option[BigDecimal],
                  reference: Option[String],
                  notes: Option[String],
                  remarks: Option[String],
                  is_auto: Option[Boolean],
                  is_approved: Option[Boolean],
                  is_locked: Option[Boolean],
                  grouping1: Option[String],
                  grouping2: Option[String],
                  grouping3: Option[String],
                  grouping4: Option[String],
                  tags: Set[String],
                  strategy: Option[IID],
                  auxdata: Json,
                  quants: List[IID])
  extends Record[IID] {
  /**
    * Returns all the artifacts which are involved.
    *
    * @return All artifacts which are involved.
    */
  def artifacts: Set[IID] = {
    List(Some(resmain), resaltn, rescntr, rescomp, resintr, resprin, resundr).flatMap(_.toList).toSet
  }
}
