package fr.hamtec.appsbook.champsFormulaires

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
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
            modifier = modifier
                .fillMaxWidth(),
            label = {
                Text(text = "Nom")
            },
            value = name,
            onValueChange = {
                updateName(it)
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
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