package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class InstanceIdentifier (

  @SerialName("referencedBusinessEntityId" ) var referencedBusinessEntityId : String? = null,
  @SerialName("identifierFieldId"          ) var identifierFieldId          : String? = null,
  @SerialName("captionFieldId"             ) var captionFieldId             : String? = null

)