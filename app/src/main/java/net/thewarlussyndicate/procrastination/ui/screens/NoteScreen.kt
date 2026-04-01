package net.thewarlussyndicate.procrastination.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen

class NoteScreen : Screen {
    @Composable
    override fun Content() {
        Scaffold() {
            Column(modifier = Modifier
                .padding(it)
            ) {
                Text(text = "this is text UwU",
                style = MaterialTheme.typography.bodyLarge, color = Color.Red)
            }
        }
    }
}