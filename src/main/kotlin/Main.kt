import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.screens.schema.SchemaScreen

@Composable
@Preview
fun app() {
    Column {
        SchemaScreen()
    }
}


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Eforminator",
        state = WindowState(isMinimized = true)
    ) {
        app()
    }
}
