package data.model.notice

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Notice (

  @SerialName("ublVersion"       ) var ublVersion       : String?             = null,
  @SerialName("sdkVersion"       ) var sdkVersion       : String?             = null,
  @SerialName("metadataDatabase" ) var metadataDatabase : MetadataDatabase?   = MetadataDatabase(),
  @SerialName("noticeId"         ) var noticeId         : String?             = null,
  @SerialName("metadata"         ) var metadata         : ArrayList<Metadata> = arrayListOf(),
  @SerialName("content"          ) var content          : ArrayList<Content>  = arrayListOf()

)