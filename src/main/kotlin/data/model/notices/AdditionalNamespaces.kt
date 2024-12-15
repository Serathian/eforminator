package data.model.notices

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class AdditionalNamespaces (

  @SerialName("prefix"         ) var prefix         : String? = null,
  @SerialName("uri"            ) var uri            : String? = null,
  @SerialName("schemaLocation" ) var schemaLocation : String? = null

)