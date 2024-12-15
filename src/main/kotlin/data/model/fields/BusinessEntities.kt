package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class BusinessEntities (

  @SerialName("id"                   ) var id                   : String?               = null,
  @SerialName("name"                 ) var name                 : String?               = null,
  @SerialName("description"          ) var description          : String?               = null,
  @SerialName("labelId"              ) var labelId              : String?               = null,
  @SerialName("repeatable"           ) var repeatable           : Boolean?              = null,
  @SerialName("repeatsWithNodeId"    ) var repeatsWithNodeId    : String?               = null,
  @SerialName("changeIdentification" ) var changeIdentification : ChangeIdentification? = ChangeIdentification(),
  @SerialName("instanceIdentifier"   ) var instanceIdentifier   : InstanceIdentifier?   = InstanceIdentifier()

)