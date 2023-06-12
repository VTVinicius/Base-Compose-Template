package br.com.vtvinicius.base_feature.dialogs

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ErrorDialog(
    error: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text("Erro!", style = MaterialTheme.typography.h6) },
        text = { Text(error) },
        confirmButton = {
            Button(onClick = { onDismiss() }) {
                Text(text = "OK", color = Color.White, style = MaterialTheme.typography.button)
            }
        },
        modifier = modifier
    )
}