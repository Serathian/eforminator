package data.model.notices

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class NoticeSubType (

  @SerialName("documentType"    ) var documentType    : String,
  @SerialName("legalBasis"      ) var legalBasis      : String,
  @SerialName("formType"        ) var formType        : String,
  @SerialName("type"            ) var type            : String,
  @SerialName("description"     ) var description     : String,
  @SerialName("subTypeId"       ) var subTypeId       : String,
  @SerialName("_label"          ) var Label           : String,
  @SerialName("viewTemplateIds" ) var viewTemplateIds : ArrayList<String> = arrayListOf()

)