package data.model.fields

import kotlinx.serialization.*

@Serializable
data class FieldsJson (

    @SerialName("ublVersion"       ) var ublVersion       : String?                     = null,
    @SerialName("sdkVersion"       ) var sdkVersion       : String?                     = null,
    @SerialName("metadataDatabase" ) var metadataDatabase : MetadataDatabase?           = MetadataDatabase(),
    @SerialName("businessEntities" ) var businessEntities : ArrayList<BusinessEntities> = arrayListOf(),
    @SerialName("xmlStructure"     ) var xmlStructure     : ArrayList<XmlStructure>     = arrayListOf(),
    @SerialName("fields"           ) var fields           : ArrayList<Field>           = arrayListOf()

)