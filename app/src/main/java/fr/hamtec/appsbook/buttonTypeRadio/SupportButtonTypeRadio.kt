package fr.hamtec.appsbook.buttonTypeRadio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicRadioButtonExample() {
    val selectedOption = remember { mutableStateOf("Option1") }

    Column {
        RadioButton(
            selected = selectedOption.value == "Option1",
            onClick = { selectedOption.value = "Option1" }
        )
        Text("Option 1")

        RadioButton(
            selected = selectedOption.value == "Option2",
            onClick = { selectedOption.value = "Option2" }
        )
        Text("Option 2")
    }
}
@Preview(showBackground = true)
@Composable
fun BasicRadioButton(modifier: Modifier = Modifier) {
    val radioOptions = listOf("Blanc", "Rouge", "Vert")
    var selectedOption by remember { mutableStateOf(radioOptions[0]) }

    Column(modifier.selectableGroup()) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { selectedOption = text },
                        role = Role.RadioButton
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = null
                )
                Text(
                    text = text,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCheckbox(modifier: Modifier = Modifier) {
    var checkedState by remember { mutableStateOf(true) }
    Checkbox(
        checked = checkedState,
        onCheckedChange = {checkedState = it}
    )
}

@Preview(showBackground = true, group = "CaseCoche")
@Composable
fun GroupedCheckboxes(modifier: Modifier = Modifier) {
    val mItemList = listOf(
        "Jean-Marc",
        "Hamid",
        "Amanis",
        "Louis"
    )
    Column(modifier = modifier) {
        mItemList.forEach { items ->
            var isChecked by remember { mutableStateOf(false) }
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .toggleable(
                        value = isChecked,
                        onValueChange = {
                            isChecked = it
                        },
                        role = Role.Checkbox
                    )
                    .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = null
                )
                Text(text = items, modifier.padding(15.dp))
            }
        }
    }
}
