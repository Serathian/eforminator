package data.model.fields

import data.model.fields.Constraints
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Forbidden (

  @SerialName("value"       ) var value       : Boolean?               = null,
  @SerialName("severity"    ) var severity    : String?                = null,
  @SerialName("constraints" ) var constraints : ArrayList<Constraints> = arrayListOf()

)