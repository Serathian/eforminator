package data.model.notices

import data.model.notices.DocumentTypes
import data.model.notices.MetadataDatabase
import data.model.notices.NoticeSubType
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Notices (

  @SerialName("ublVersion"       ) var ublVersion       : String?                   = null,
  @SerialName("sdkVersion"       ) var sdkVersion       : String?                   = null,
  @SerialName("metadataDatabase" ) var metadataDatabase : MetadataDatabase?         = MetadataDatabase(),
  @SerialName("noticeSubTypes"   ) var noticeSubTypes   : ArrayList<NoticeSubType> = arrayListOf(),
  @SerialName("documentTypes"    ) var documentTypes    : ArrayList<DocumentTypes>  = arrayListOf()

)