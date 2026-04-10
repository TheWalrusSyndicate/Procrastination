package net.thewarlussyndicate.procrastination.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import net.thewarlussyndicate.procrastination.R

class ChecklistScreen : Screen{
    @Composable
    override fun Content() {
        Scaffold(topBar = { TitleBar() },) { pv ->
            //header
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(pv)
                    .padding(8.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(pv)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Procrastination",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White
                    )
                    Button(
                        onClick = {

                        }
                    ) {

                    }
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun TitleBar() {
        TopAppBar(
            title = { Text(stringResource(R.string.title_home)) },
            actions = { Button(onClick = { }) { } }
        )
    }
}