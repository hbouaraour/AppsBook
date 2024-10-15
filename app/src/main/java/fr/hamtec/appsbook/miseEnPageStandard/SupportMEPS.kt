package fr.hamtec.appsbook.miseEnPageStandard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.appsbook.ui.theme.AppsBookTheme
import java.time.Instant


@Composable
private fun UserBadgeWithLastetConnection(
    username: String,
    lastConnection: Instant,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier

    ) {
        // DefautUserIcon()
        Text(
            text = username,
            style = MaterialTheme.typography.bodyLarge
            )
        Text(
            text = "end",
            style = MaterialTheme.typography.bodyMedium
        )

    }

}

@Preview(showBackground = true, name = "Connection", group = "Row")
@Composable
private fun UserBadgeWithLasteConnection() {
    AppsBookTheme {
        UserBadgeWithLastetConnection(
            username = "Hemilie",
            lastConnection = Instant.now()
        )
    }
}