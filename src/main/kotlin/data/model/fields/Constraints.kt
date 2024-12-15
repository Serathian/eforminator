package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Constraints (

  @SerialName("noticeTypes" ) var noticeTypes : ArrayList<String> = arrayListOf(),
  @SerialName("value"       ) var value       : Boolean?          = null,
  @SerialName("severity"    ) var severity    : String?           = null

)