// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package org.iptc.sportsml.v3


/** Metadata about the event itself. | Specific to ice-hockey.
*/
case class IceHockeyEventMetadataComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends EventMetadataComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val powerPlayTimeRemaining = attributes.get("@power-play-time-remaining") map { _.as[String]}
  lazy val powerPlayTeamIdref = attributes.get("@power-play-team-idref") map { _.as[String]}
  lazy val powerPlayPlayerAdvantage = attributes.get("@power-play-player-advantage") map { _.as[String]}
  lazy val scoreTeam = attributes.get("@score-team") map { _.as[String]}
  lazy val scoreTeamOpposing = attributes.get("@score-team-opposing") map { _.as[String]}
}

      


/** Metadata for a player. | Specific to ice-hockey. 
*/
case class IceHockeyPlayerMetadataComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends PlayerMetadataComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val shootingHand = attributes.get("@shooting-hand") map { _.as[BodySideList]}
  lazy val catchingHand = attributes.get("@catching-hand") map { _.as[BodySideList]}
}

      


/** Stats about one team. | Specific to ice-hockey.
*/
case class IceHockeyTeamStatsComplexType(statsIceHockeyOffensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsOffensiveComplexType] = Nil,
  statsIceHockeyDefensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsDefensiveComplexType] = Nil,
  statsIceHockeyFaceoffs: Seq[org.iptc.sportsml.v3.IceHockeyStatsFaceoffsComplexType] = Nil,
  statsIceHockeyTimeOnIce: Seq[org.iptc.sportsml.v3.IceHockeyStatsTimeOnIceComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseIceHockeyStatsComplexTypable with TeamStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val plusMinus = attributes.get("@plus-minus") map { _.as[String]}
  lazy val plusTotal = attributes.get("@plus-total") map { _.as[String]}
  lazy val minusTotal = attributes.get("@minus-total") map { _.as[String]}
  lazy val penaltyMinutes = attributes.get("@penalty-minutes") map { _.as[String]}
}

      


/** Stats for a player specific to ice-hockey. | Includes the same offensive and defensive stats available for a team.
*/
case class IceHockeyPlayerStatsComplexType(statsIceHockeyOffensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsOffensiveComplexType] = Nil,
  statsIceHockeyDefensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsDefensiveComplexType] = Nil,
  statsIceHockeyFaceoffs: Seq[org.iptc.sportsml.v3.IceHockeyStatsFaceoffsComplexType] = Nil,
  statsIceHockeyTimeOnIce: Seq[org.iptc.sportsml.v3.IceHockeyStatsTimeOnIceComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseIceHockeyStatsComplexTypable with PlayerStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val plusMinus = attributes.get("@plus-minus") map { _.as[String]}
  lazy val plusTotal = attributes.get("@plus-total") map { _.as[String]}
  lazy val minusTotal = attributes.get("@minus-total") map { _.as[String]}
  lazy val penaltyMinutes = attributes.get("@penalty-minutes") map { _.as[String]}
  lazy val minutesPlayed = attributes.get("@minutes-played") map { _.as[String]}
}

      


/** Stats for a player specific to ice-hockey. | Includes the same offensive and defensive stats available for a team.
*/
trait BaseIceHockeyStatsComplexTypable {
  def statsIceHockeyOffensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsOffensiveComplexType]
  def statsIceHockeyDefensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsDefensiveComplexType]
  def statsIceHockeyFaceoffs: Seq[org.iptc.sportsml.v3.IceHockeyStatsFaceoffsComplexType]
  def statsIceHockeyTimeOnIce: Seq[org.iptc.sportsml.v3.IceHockeyStatsTimeOnIceComplexType]
  def id: Option[String]
  def classValue: Option[String]
  def style: Option[String]
  def statsCoverage: Option[String]
  def teamCoverage: Option[org.iptc.sportsml.v3.TeamCoverage]
  def durationScope: Option[String]
  def alignmentScope: Option[org.iptc.sportsml.v3.AlignmentScope]
  def position: Option[String]
  def recordMakingScope: Option[String]
  def scopingLabel: Option[String]
  def periodValue: Option[String]
  def periodType: Option[String]
  def startDateTime: Option[String]
  def endDateTime: Option[String]
  def periodStartDateTime: Option[String]
  def periodEndDateTime: Option[String]
  def temporalUnitType: Option[String]
  def temporalUnitValue: Option[String]
  def eventSpan: Option[BigInt]
  def opponentValue: Option[String]
  def opponentType: Option[String]
  def team: Option[String]
  def competition: Option[String]
  def unitValue: Option[String]
  def unitType: Option[String]
  def situation: Option[String]
  def locationKey: Option[String]
  def venueType: Option[String]
  def surfaceType: Option[String]
  def weatherType: Option[String]
  def scopeValue: Option[String]
  def distance: Option[String]
  def distanceMaximum: Option[String]
  def distanceMinimum: Option[String]
  def measurementUnits: Option[String]
  def plusMinus: Option[String]
  def plusTotal: Option[String]
  def minusTotal: Option[String]
  def penaltyMinutes: Option[String]
}


/** Stats for a player specific to ice-hockey. | Includes the same offensive and defensive stats available for a team.
*/
case class BaseIceHockeyStatsComplexType(statsIceHockeyOffensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsOffensiveComplexType] = Nil,
  statsIceHockeyDefensive: Seq[org.iptc.sportsml.v3.IceHockeyStatsDefensiveComplexType] = Nil,
  statsIceHockeyFaceoffs: Seq[org.iptc.sportsml.v3.IceHockeyStatsFaceoffsComplexType] = Nil,
  statsIceHockeyTimeOnIce: Seq[org.iptc.sportsml.v3.IceHockeyStatsTimeOnIceComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseIceHockeyStatsComplexTypable {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val plusMinus = attributes.get("@plus-minus") map { _.as[String]}
  lazy val plusTotal = attributes.get("@plus-total") map { _.as[String]}
  lazy val minusTotal = attributes.get("@minus-total") map { _.as[String]}
  lazy val penaltyMinutes = attributes.get("@penalty-minutes") map { _.as[String]}
}

      


/** Offensive stats for one team. | Specific to ice-hockey, including stats on shots, goals, and faceoffs.
*/
case class IceHockeyStatsOffensiveComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val playerCount = attributes.get("@player-count") map { _.as[String]}
  lazy val playerCountOpposing = attributes.get("@player-count-opposing") map { _.as[String]}
  lazy val zone = attributes.get("@zone") map { _.as[Zone]}
  lazy val location = attributes.get("@location") map { _.as[String]}
  lazy val goalsTotal = attributes.get("@goals-total") map { _.as[String]}
  lazy val goalsGameWinning = attributes.get("@goals-game-winning") map { _.as[String]}
  lazy val goalsGameTying = attributes.get("@goals-game-tying") map { _.as[String]}
  lazy val goalsPowerPlay = attributes.get("@goals-power-play") map { _.as[String]}
  lazy val goalsShortHanded = attributes.get("@goals-short-handed") map { _.as[String]}
  lazy val goalsEvenStrength = attributes.get("@goals-even-strength") map { _.as[String]}
  lazy val goalsEmptyNet = attributes.get("@goals-empty-net") map { _.as[String]}
  lazy val goalsOvertime = attributes.get("@goals-overtime") map { _.as[String]}
  lazy val goalsShootout = attributes.get("@goals-shootout") map { _.as[String]}
  lazy val goalsShootoutAttempts = attributes.get("@goals-shootout-attempts") map { _.as[String]}
  lazy val goalsPenaltyShot = attributes.get("@goals-penalty-shot") map { _.as[String]}
  lazy val goalsPerGame = attributes.get("@goals-per-game") map { _.as[String]}
  lazy val assists = attributes.get("@assists") map { _.as[String]}
  lazy val assistsPowerPlay = attributes.get("@assists-power-play") map { _.as[String]}
  lazy val assistsShortHanded = attributes.get("@assists-short-handed") map { _.as[String]}
  lazy val assistsGameWinning = attributes.get("@assists-game-winning") map { _.as[String]}
  lazy val assistsGameTying = attributes.get("@assists-game-tying") map { _.as[String]}
  lazy val assistsOvertime = attributes.get("@assists-overtime") map { _.as[String]}
  lazy val points = attributes.get("@points") map { _.as[String]}
  lazy val pointsPowerPlay = attributes.get("@points-power-play") map { _.as[String]}
  lazy val pointsShortHanded = attributes.get("@points-short-handed") map { _.as[String]}
  lazy val powerPlayAmount = attributes.get("@power-play-amount") map { _.as[String]}
  lazy val powerPlayPercentage = attributes.get("@power-play-percentage") map { _.as[String]}
  lazy val shotsPenaltyShotTaken = attributes.get("@shots-penalty-shot-taken") map { _.as[String]}
  lazy val shotsPenaltyShotMissed = attributes.get("@shots-penalty-shot-missed") map { _.as[String]}
  lazy val shotsPenaltyShotPercentage = attributes.get("@shots-penalty-shot-percentage") map { _.as[String]}
  lazy val giveaways = attributes.get("@giveaways") map { _.as[String]}
  lazy val minutesPowerPlay = attributes.get("@minutes-power-play") map { _.as[String]}
  lazy val scoringChances = attributes.get("@scoring-chances") map { _.as[String]}
  lazy val hatTricks = attributes.get("@hat-tricks") map { _.as[String]}
  lazy val shotsMissed = attributes.get("@shots-missed") map { _.as[String]}
  lazy val shotAttemptsBlocked = attributes.get("@shot-attempts-blocked") map { _.as[String]}
  lazy val shotsEvenStrength = attributes.get("@shots-even-strength") map { _.as[String]}
  lazy val shotsPowerPlay = attributes.get("@shots-power-play") map { _.as[String]}
  lazy val shotsShortHanded = attributes.get("@shots-short-handed") map { _.as[String]}
}

      


/** Defensive stats for the team. | Specific to ice-hockey, including saves and shots allowed.
*/
case class IceHockeyStatsDefensiveComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val playerCount = attributes.get("@player-count") map { _.as[String]}
  lazy val playerCountOpposing = attributes.get("@player-count-opposing") map { _.as[String]}
  lazy val zone = attributes.get("@zone") map { _.as[Zone]}
  lazy val location = attributes.get("@location") map { _.as[String]}
  lazy val shotsPowerPlayAllowed = attributes.get("@shots-power-play-allowed") map { _.as[String]}
  lazy val shotsPenaltyShotAllowed = attributes.get("@shots-penalty-shot-allowed") map { _.as[String]}
  lazy val goalsPowerPlayAllowed = attributes.get("@goals-power-play-allowed") map { _.as[String]}
  lazy val goalsPenaltyShotAllowed = attributes.get("@goals-penalty-shot-allowed") map { _.as[String]}
  lazy val goalsEmptyNetAllowed = attributes.get("@goals-empty-net-allowed") map { _.as[String]}
  lazy val goalsShortHandedAllowed = attributes.get("@goals-short-handed-allowed") map { _.as[String]}
  lazy val goalsAgainstTotal = attributes.get("@goals-against-total") map { _.as[String]}
  lazy val goalsAgainstAverage = attributes.get("@goals-against-average") map { _.as[String]}
  lazy val saves = attributes.get("@saves") map { _.as[String]}
  lazy val savePercentage = attributes.get("@save-percentage") map { _.as[String]}
  lazy val goalsShootoutAllowed = attributes.get("@goals-shootout-allowed") map { _.as[String]}
  lazy val shotsShootoutAllowed = attributes.get("@shots-shootout-allowed") map { _.as[String]}
  lazy val penaltyKillingAmount = attributes.get("@penalty-killing-amount") map { _.as[String]}
  lazy val penaltyKillingPercentage = attributes.get("@penalty-killing-percentage") map { _.as[String]}
  lazy val shotsBlocked = attributes.get("@shots-blocked") map { _.as[String]}
  lazy val takeaways = attributes.get("@takeaways") map { _.as[String]}
  lazy val shutouts = attributes.get("@shutouts") map { _.as[String]}
  lazy val minutesPenaltyKilling = attributes.get("@minutes-penalty-killing") map { _.as[String]}
  lazy val hits = attributes.get("@hits") map { _.as[String]}
  lazy val goaltenderWins = attributes.get("@goaltender-wins") map { _.as[String]}
  lazy val goaltenderLosses = attributes.get("@goaltender-losses") map { _.as[String]}
  lazy val goaltenderTies = attributes.get("@goaltender-ties") map { _.as[String]}
  lazy val goaltenderWinsOvertime = attributes.get("@goaltender-wins-overtime") map { _.as[String]}
  lazy val goaltenderLossesOvertime = attributes.get("@goaltender-losses-overtime") map { _.as[String]}
}

      


/** Defensive stats for the team. | Specific to ice-hockey, including saves and shots allowed.
*/
case class IceHockeyStatsFaceoffsComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val playerCount = attributes.get("@player-count") map { _.as[String]}
  lazy val playerCountOpposing = attributes.get("@player-count-opposing") map { _.as[String]}
  lazy val zone = attributes.get("@zone") map { _.as[Zone]}
  lazy val location = attributes.get("@location") map { _.as[String]}
  lazy val faceoffsTotal = attributes.get("@faceoffs-total") map { _.as[String]}
  lazy val faceoffWins = attributes.get("@faceoff-wins") map { _.as[String]}
  lazy val faceoffLosses = attributes.get("@faceoff-losses") map { _.as[String]}
  lazy val faceoffWinPercentage = attributes.get("@faceoff-win-percentage") map { _.as[String]}
  lazy val faceoffsEvenStrengthTotal = attributes.get("@faceoffs-even-strength-total") map { _.as[String]}
  lazy val faceoffsEvenStrengthWins = attributes.get("@faceoffs-even-strength-wins") map { _.as[String]}
  lazy val faceoffsEvenStrengthLosses = attributes.get("@faceoffs-even-strength-losses") map { _.as[String]}
  lazy val faceoffsEvenStrengthWinPercentage = attributes.get("@faceoffs-even-strength-win-percentage") map { _.as[String]}
  lazy val faceoffsPowerPlayTotal = attributes.get("@faceoffs-power-play-total") map { _.as[String]}
  lazy val faceoffsPowerPlayWins = attributes.get("@faceoffs-power-play-wins") map { _.as[String]}
  lazy val faceoffsPowerPlayLosses = attributes.get("@faceoffs-power-play-losses") map { _.as[String]}
  lazy val faceoffsPowerPlayWinPercentage = attributes.get("@faceoffs-power-play-win-percentage") map { _.as[String]}
  lazy val faceoffsShortHandedTotal = attributes.get("@faceoffs-short-handed-total") map { _.as[String]}
  lazy val faceoffsShortHandedWins = attributes.get("@faceoffs-short-handed-wins") map { _.as[String]}
  lazy val faceoffsShortHandedLosses = attributes.get("@faceoffs-short-handed-losses") map { _.as[String]}
  lazy val faceoffsShortHandedWinPercentage = attributes.get("@faceoffs-short-handed-win-percentage") map { _.as[String]}
}

      


/** Defensive stats for the team. | Specific to ice-hockey, including saves and shots allowed.
*/
case class IceHockeyStatsTimeOnIceComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val playerCount = attributes.get("@player-count") map { _.as[String]}
  lazy val playerCountOpposing = attributes.get("@player-count-opposing") map { _.as[String]}
  lazy val zone = attributes.get("@zone") map { _.as[Zone]}
  lazy val location = attributes.get("@location") map { _.as[String]}
  lazy val shifts = attributes.get("@shifts") map { _.as[String]}
  lazy val shiftsPowerPlay = attributes.get("@shifts-power-play") map { _.as[String]}
  lazy val shiftsShortHanded = attributes.get("@shifts-short-handed") map { _.as[String]}
  lazy val shiftsAverage = attributes.get("@shifts-average") map { _.as[String]}
  lazy val timeAveragePerShift = attributes.get("@time-average-per-shift") map { _.as[String]}
  lazy val timeAverageEvenStrength = attributes.get("@time-average-even-strength") map { _.as[String]}
  lazy val timeAverageShortHanded = attributes.get("@time-average-short-handed") map { _.as[String]}
  lazy val timeAveragePowerPlay = attributes.get("@time-average-power-play") map { _.as[String]}
  lazy val timePowerPlay = attributes.get("@time-power-play") map { _.as[String]}
  lazy val timeShortHanded = attributes.get("@time-short-handed") map { _.as[String]}
  lazy val timeEvenStrength = attributes.get("@time-even-strength") map { _.as[String]}
  lazy val timeEmptyNet = attributes.get("@time-empty-net") map { _.as[String]}
  lazy val timePowerPlayEmptyNet = attributes.get("@time-power-play-empty-net") map { _.as[String]}
  lazy val timeShortHandedEmptyNet = attributes.get("@time-short-handed-empty-net") map { _.as[String]}
  lazy val timeEvenStrengthEmptyNet = attributes.get("@time-even-strength-empty-net") map { _.as[String]}
}

      

trait Zone

object Zone {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[org.iptc.sportsml.v3.Zone]): Zone = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: Zone) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
}

case object Offensive extends Zone { override def toString = "offensive" }
case object Defensive extends Zone { override def toString = "defensive" }
case object NeutralValue extends Zone { override def toString = "neutral" }


case class CommonPropertiesIceHockey(playerCount: Option[String] = None,
  playerCountOpposing: Option[String] = None,
  zone: Option[org.iptc.sportsml.v3.Zone] = None,
  location: Option[String] = None)


case class EventStateIceHockey(powerPlayTimeRemaining: Option[String] = None,
  powerPlayTeamIdref: Option[String] = None,
  powerPlayPlayerAdvantage: Option[String] = None,
  scoreTeam: Option[String] = None,
  scoreTeamOpposing: Option[String] = None)


