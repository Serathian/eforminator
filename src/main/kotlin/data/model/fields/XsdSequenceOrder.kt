package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class XsdSequenceOrder (

  @SerialName("cbc:ID" ) var ID : Int? = null

)