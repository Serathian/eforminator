package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class ChangeIdentification (

  @SerialName("identifyInChangeNotice" ) var identifyInChangeNotice : Boolean? = null,
  @SerialName("useInstanceIdentifier"  ) var useInstanceIdentifier  : Boolean? = null,
  @SerialName("changeIdentifier"       ) var changeIdentifier       : String?  = null

)