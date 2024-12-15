package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class MetadataDatabase (

  @SerialName("version"   ) var version   : String? = null,
  @SerialName("createdOn" ) var createdOn : String? = null

)