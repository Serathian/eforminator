package data.utils

import data.model.fields.Field
import data.model.notices.Notices
import data.model.fields.FieldsJson
import data.model.notice.Content
import data.model.notice.Notice
import kotlinx.serialization.json.Json
import java.io.File

class SdkReader {

    val userHome = System.getProperty("user.home")
    val filePath = "$userHome/eforminator"

    fun readSdk(version: String): FieldsJson{
        val fileContent = File("$filePath/fields/fields.json").readText()
        val json = Json { ignoreUnknownKeys = true}
        return json.decodeFromString(fileContent)
    }

    fun readNoticeTypes(version: String): Notices {
        val fileContent = File("$filePath/notice-types/notice-types.json").readText()
        val json = Json { ignoreUnknownKeys = true}
        return json.decodeFromString(fileContent)
    }

    fun readNotice(notice : String): Notice {
        val fileContent = File("$filePath/notice-types/$notice.json").readText()
        val json = Json { ignoreUnknownKeys = true}
        return json.decodeFromString(fileContent)
    }

    fun getNoticeFields(noticeId : String) : List<Field> {
        val notice = readNotice(noticeId)
        val sdk = readSdk("1")
        val noticeFields = flattenFields(notice.content)
        val fields = noticeFields.map { field ->
            sdk.fields.first{ sdkField -> sdkField.id == field.id }
        }
        return fields
    }

    fun flattenFields(objects: List<Content>): List<Content> {
        return objects.flatMap { obj ->
            // If the type is "field", return the object as is
            if (obj.contentType == "field") {
                listOf(obj)
            } else {
                // If the type is "group", recursively flatten the content
                obj.content.let { flattenFields(it) } ?: emptyList()
            }
        }
    }
}