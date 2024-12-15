package data.model.notices

import data.model.notices.AdditionalNamespaces
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class DocumentTypes (

  @SerialName("id"                   ) var id                   : String?                         = null,
  @SerialName("namespace"            ) var namespace            : String?                         = null,
  @SerialName("rootElement"          ) var rootElement          : String?                         = null,
  @SerialName("schemaLocation"       ) var schemaLocation       : String?                         = null,
  @SerialName("additionalNamespaces" ) var additionalNamespaces : ArrayList<AdditionalNamespaces> = arrayListOf()

)