// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package org.iptc.sportsml.v3


/** An element holding sport-specific metadata about a curling game.
*/
case class CurlingEventMetadataComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends EventMetadataComplexTypeOption {
  lazy val sheet = attributes.get("@sheet") map { _.as[String]}
  lazy val draw = attributes.get("@draw") map { _.as[String]}
}

      


/** Holds metadata specific to a curling player.
*/
case class CurlingPlayerMetadataComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends PlayerMetadataComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val delivery = attributes.get("@delivery") map { _.as[String]}
  lazy val role = attributes.get("@role") map { _.as[String]}
}

      


/** Holds curling-specific stats for certain player.
*/
case class CurlingPlayerStatsComplexType(statsu45curlingu45accuracy: Seq[org.iptc.sportsml.v3.CurlingStatsAccuracyComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends PlayerStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsu45coverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamu45coverage = attributes.get("@team-coverage") map { _.as[Teamu45coverage]}
  lazy val durationu45scope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentu45scope = attributes.get("@alignment-scope") map { _.as[Alignmentu45scope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordu45makingu45scope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingu45label = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodu45value = attributes.get("@period-value") map { _.as[String]}
  lazy val periodu45type = attributes.get("@period-type") map { _.as[String]}
  lazy val startu45dateu45time = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endu45dateu45time = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodu45startu45dateu45time = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodu45endu45dateu45time = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalu45unitu45type = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalu45unitu45value = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventu45span = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentu45value = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentu45type = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitu45value = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitu45type = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationu45key = attributes.get("@location-key") map { _.as[String]}
  lazy val venueu45type = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceu45type = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatheru45type = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeu45value = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceu45maximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceu45minimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementu45units = attributes.get("@measurement-units") map { _.as[String]}
}

      


/** Statistics summarizing the actions of one team.
*/
case class CurlingTeamStatsComplexType(statsu45curlingu45stone: Seq[org.iptc.sportsml.v3.CurlingStatsStoneComplexType] = Nil,
  statsu45curlingu45end: Seq[org.iptc.sportsml.v3.CurlingStatsEndComplexType] = Nil,
  statsu45curlingu45accuracy: Seq[org.iptc.sportsml.v3.CurlingStatsAccuracyComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends TeamStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsu45coverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamu45coverage = attributes.get("@team-coverage") map { _.as[Teamu45coverage]}
  lazy val durationu45scope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentu45scope = attributes.get("@alignment-scope") map { _.as[Alignmentu45scope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordu45makingu45scope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingu45label = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodu45value = attributes.get("@period-value") map { _.as[String]}
  lazy val periodu45type = attributes.get("@period-type") map { _.as[String]}
  lazy val startu45dateu45time = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endu45dateu45time = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodu45startu45dateu45time = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodu45endu45dateu45time = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalu45unitu45type = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalu45unitu45value = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventu45span = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentu45value = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentu45type = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitu45value = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitu45type = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationu45key = attributes.get("@location-key") map { _.as[String]}
  lazy val venueu45type = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceu45type = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatheru45type = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeu45value = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceu45maximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceu45minimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementu45units = attributes.get("@measurement-units") map { _.as[String]}
  lazy val hammer = attributes.get("@hammer") map { _.as[Boolean]}
}

      


/** Description of an individual stone used in a curling game.
*/
case class CurlingStatsStoneComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsu45coverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamu45coverage = attributes.get("@team-coverage") map { _.as[Teamu45coverage]}
  lazy val durationu45scope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentu45scope = attributes.get("@alignment-scope") map { _.as[Alignmentu45scope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordu45makingu45scope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingu45label = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodu45value = attributes.get("@period-value") map { _.as[String]}
  lazy val periodu45type = attributes.get("@period-type") map { _.as[String]}
  lazy val startu45dateu45time = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endu45dateu45time = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodu45startu45dateu45time = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodu45endu45dateu45time = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalu45unitu45type = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalu45unitu45value = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventu45span = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentu45value = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentu45type = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitu45value = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitu45type = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationu45key = attributes.get("@location-key") map { _.as[String]}
  lazy val venueu45type = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceu45type = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatheru45type = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeu45value = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceu45maximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceu45minimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementu45units = attributes.get("@measurement-units") map { _.as[String]}
  lazy val stoneu45number = attributes.get("@stone-number") map { _.as[String]}
  lazy val stoneu45color = attributes.get("@stone-color") map { _.as[String]}
}

      

trait Throwu45order

object Throwu45order {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[org.iptc.sportsml.v3.Throwu45order]): Throwu45order = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: Throwu45order) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
}

case object First extends Throwu45order { override def toString = "first" }
case object Last extends Throwu45order { override def toString = "last" }


/** Statistics for one end (round) for one team in a curling game.
*/
case class CurlingStatsEndComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsu45coverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamu45coverage = attributes.get("@team-coverage") map { _.as[Teamu45coverage]}
  lazy val durationu45scope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentu45scope = attributes.get("@alignment-scope") map { _.as[Alignmentu45scope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordu45makingu45scope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingu45label = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodu45value = attributes.get("@period-value") map { _.as[String]}
  lazy val periodu45type = attributes.get("@period-type") map { _.as[String]}
  lazy val startu45dateu45time = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endu45dateu45time = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodu45startu45dateu45time = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodu45endu45dateu45time = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalu45unitu45type = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalu45unitu45value = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventu45span = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentu45value = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentu45type = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitu45value = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitu45type = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationu45key = attributes.get("@location-key") map { _.as[String]}
  lazy val venueu45type = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceu45type = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatheru45type = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeu45value = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceu45maximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceu45minimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementu45units = attributes.get("@measurement-units") map { _.as[String]}
  lazy val endu45number = attributes.get("@end-number") map { _.as[String]}
  lazy val score = attributes.get("@score") map { _.as[String]}
  lazy val throwu45order = attributes.get("@throw-order") map { _.as[Throwu45order]}
  lazy val timeu45used = attributes.get("@time-used") map { _.as[String]}
}

      

trait TurnType

object TurnType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[org.iptc.sportsml.v3.TurnType]): TurnType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: TurnType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
}

case object InturnValue extends TurnType { override def toString = "inturn" }
case object OutturnValue extends TurnType { override def toString = "outturn" }


/** Holds the summary for shots and percentage for one team or one player and optionally for just one type of shots.
*/
case class CurlingStatsAccuracyComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsu45coverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamu45coverage = attributes.get("@team-coverage") map { _.as[Teamu45coverage]}
  lazy val durationu45scope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentu45scope = attributes.get("@alignment-scope") map { _.as[Alignmentu45scope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordu45makingu45scope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingu45label = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodu45value = attributes.get("@period-value") map { _.as[String]}
  lazy val periodu45type = attributes.get("@period-type") map { _.as[String]}
  lazy val startu45dateu45time = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endu45dateu45time = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodu45startu45dateu45time = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodu45endu45dateu45time = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalu45unitu45type = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalu45unitu45value = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventu45span = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentu45value = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentu45type = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitu45value = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitu45type = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationu45key = attributes.get("@location-key") map { _.as[String]}
  lazy val venueu45type = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceu45type = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatheru45type = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeu45value = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceu45maximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceu45minimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementu45units = attributes.get("@measurement-units") map { _.as[String]}
  lazy val shotu45type = attributes.get("@shot-type") map { _.as[String]}
  lazy val turn = attributes.get("@turn") map { _.as[TurnType]}
  lazy val percentage = attributes.get("@percentage") map { _.as[String]}
  lazy val numberu45ofu45shots = attributes.get("@number-of-shots") map { _.as[String]}
}

      


case class EventStateCurling(stoneu45idref: Option[String] = None,
  endu45number: Option[String] = None)

