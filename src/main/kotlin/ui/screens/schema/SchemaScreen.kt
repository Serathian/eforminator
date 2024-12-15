package ui.screens.schema

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import data.model.fields.Field
import data.model.notices.Notices
import data.utils.SdkReader
import ui.components.FieldsList

@Preview
@Composable
fun SchemaScreen() {
    val fieldsJson = remember { mutableStateOf(emptyList<Field>()) }
    val notices = remember { mutableStateOf(Notices()) }
    val sdkReader = remember { SdkReader() }
    val rule = remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        notices.value = sdkReader.readNoticeTypes("1")
        fieldsJson.value = sdkReader.getNoticeFields("1")
    }

    Column {
        FieldsList(fieldsJson.value) { value -> rule.value = value }
    }
}