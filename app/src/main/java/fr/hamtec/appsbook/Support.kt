package fr.hamtec.appsbook

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.People
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.appsbook.ui.theme.AppsBookTheme

@Composable
fun UserBadge(
    username: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Icon(
            imageVector = Icons.Rounded.People,
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)
                .border(
                    width = 1.0.dp,
                    color = Color.Cyan,
                    shape = CircleShape
                )
                .padding(start = 4.dp)

        )
        Text(text = username)
    }
}

@Composable
fun Message(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            UserBadge(
                username = "Me",
                modifier = Modifier.align(Alignment.End)
            )
            //MessageContent()
        }
    }
}

@Preview(showBackground = true, group = "TP-Book")
@Composable
fun UserBadgePreview() {
    AppsBookTheme {
        UserBadge(
            "Louis Amstrong"
        )
    }
}
@Preview(showBackground = true, group = "TP-Book")
@Composable
fun MessagePreview() {
    AppsBookTheme {
        Message()
    }
}