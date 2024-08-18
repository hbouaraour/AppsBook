package fr.hamtec.appsbook.champsFormulaires

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.appsbook.ui.theme.AppsBookTheme
import java.util.jar.Attributes.Name

@Composable
fun Name(
    name: String,
    modifier: Modifier = Modifier,
    updateName: (String) -> Unit
): Unit {
    Column {
        OutlinedTextField(
            value = "",
            onValueChange = {}
        )
    }
}
@Preview(showBackground = true)
@Composable
fun NamePreview(modifier: Modifier = Modifier) {
    AppsBookTheme {
        Name(name = "Louis", updateName = {} )
    }
}