package net.thewarlussyndicate.procrastination.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

class NoteScreen : Screen {
    @Composable
    override fun Content() {
        println("should be showing screen??")
        Scaffold() { pv ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(pv)
                    .padding(16.dp)
                    .fillMaxWidth()
                    .background(Color.Green)
            ) {
                Text(
                    text = "this is text UwU",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Red
                )
            }
        }
    }
}