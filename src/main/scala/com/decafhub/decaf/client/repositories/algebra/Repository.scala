package com.decafhub.decaf.client.repositories.algebra

import com.decafhub.decaf.client.core.{
  BaristaClient,
  Record,
}
import io.circe.Decoder

import scala.language.higherKinds

/** Defines a generic record repository algebra.
  *
  * @param api The API algebra to be used to work on records.
  * @param base The API endpoint namespace for the record type.
  * @param decoder Implicit JSON decoder for the record type.
  * @tparam F Context type parameter.
  * @tparam ID Record identifier type parameter.
  * @tparam A Record type.
  */
abstract class Repository[F[_], ID, A <: Record[
  ID,
]](val api: BaristaClient[F], val base: String)(
    implicit decoder: Decoder[A],
) {

  /** Filters and returns all filtered records.
    *
    * @param filters Map of filters.
    * @return [[List]] of all filtered records.
    */
  def filter(
      filters: BaristaClient.Params,
  ): F[List[A]] = api.getRecords(base, filters)

  /** Provides a convenience function for default filter implementation.
    *
    * @param filters List of filters.
    * @return [[List]] of all filtered records.
    */
  def filter(
      filters: (String, String)*,
  ): F[List[A]] = filter(Map(filters: _*))

  /** Returns all records.
    *
    * @return [[List]] of all records.
    */
  def all: F[List[A]] = filter(
    Map.empty[String, String],
  )
}
