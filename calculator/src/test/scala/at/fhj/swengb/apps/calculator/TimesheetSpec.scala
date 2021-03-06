package at.fhj.swengb.apps.calculator

import org.scalatest.WordSpecLike

class TimesheetSpec extends WordSpecLike {

  val expected =
    """== Time expenditure: Calculator assignment
      |
      |[cols="1,1,4", options="header"]
      |.Time expenditure
      ||===
      || Date
      || Hours
      || Description
      |
      || 29.11.17
      || 1
      || Review of this and that
      |
      || 30.11.17
      || 5
      || implemented css
      |
      || 11.07.17
      || 2
      || fixed bugs
      |
      ||===
      |""".stripMargin
}
