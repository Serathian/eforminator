package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class XmlStructure (

  @SerialName("id"            ) var id            : String?  = null,
  @SerialName("xpathAbsolute" ) var xpathAbsolute : String?  = null,
  @SerialName("xpathRelative" ) var xpathRelative : String?  = null,
  @SerialName("repeatable"    ) var repeatable    : Boolean? = null

)