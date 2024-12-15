package data.model.fields

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Field(

    @SerialName("id") var id: String,
    @SerialName("parentNodeId") var parentNodeId: String,
    @SerialName("name") var name: String,
    @SerialName("btId") var btId: String,
    @SerialName("xpathAbsolute") var xpathAbsolute: String,
    @SerialName("xpathRelative") var xpathRelative: String,
    @SerialName("xsdSequenceOrder") var xsdSequenceOrder: ArrayList<XsdSequenceOrder> = arrayListOf(),
    @SerialName("type") var type: String,
    @SerialName("attributes") var attributes: ArrayList<String> = arrayListOf(),
    @SerialName("businessEntityId") var businessEntityId: String,
    @SerialName("legalType") var legalType: String? = null,
    @SerialName("repeatable") var repeatable: Repeatable = Repeatable(),
    @SerialName("forbidden") var forbidden: Forbidden = Forbidden()

)