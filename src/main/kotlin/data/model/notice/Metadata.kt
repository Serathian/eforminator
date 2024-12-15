package data.model.notice

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Metadata (

  @SerialName("id"          ) var id          : String?  = null,
  @SerialName("contentType" ) var contentType : String?  = null,
  @SerialName("displayType" ) var displayType : String?  = null,
  @SerialName("description" ) var description : String?  = null,
  @SerialName("_label"      ) var Label       : String?  = null,
  @SerialName("readOnly"    ) var readOnly    : Boolean? = null

)