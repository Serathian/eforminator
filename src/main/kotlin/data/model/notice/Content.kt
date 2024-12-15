package data.model.notice

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Content (

  @SerialName("id"          ) var id          : String?            = null,
  @SerialName("contentType" ) var contentType : String?            = null,
  @SerialName("displayType" ) var displayType : String?            = null,
  @SerialName("description" ) var description : String?            = null,
  @SerialName("_label"      ) var Label       : String?            = null,
  @SerialName("content"     ) var content     : ArrayList<Content> = arrayListOf()

)