### Row

Une disposition composable qui place ses enfants dans une séquence horizontale. Notez que par défaut, les éléments ne défilent pas.
```
@Composable
inline fun Row(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit
): Unit
```
