package fr.hamtec.appsbook.lesListes

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.appsbook.ui.theme.AppsBookTheme


data class Person(val name: String, val age: Int)

@Composable
fun MyApp() {
    val people = listOf(
        Person("John Doe", 25),
        Person("Jane Smith", 30),
        Person("Alice Johnson", 20),
        Person("Bob Williams", 27)
    )
    PersonList(people)
}

@Composable
fun PersonList(people: List<Person>) {
    LazyColumn {
        items(
            people.size,
            itemContent = { index ->
                val person = people[index]
                Text(text = "Name: ${person.name}, Age: ${person.age}")
            }
        )
    }
}

@Composable
fun PersonListv2(people: List<Person>) {
    LazyColumn {
        items(people.size) { index ->
            val person = people[index]
            Text(text = "Name: ${person.name}, Age: ${person.age}")
        }
    }
}
@Composable
fun PersonListv3(people: List<Person>) {
    LazyColumn {
        items(people.size) {
            val person = people[it]
            Text(text = "Name: ${person.name}, Age: ${person.age}")
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun MyAppPreview() {
    AppsBookTheme {
        MyApp()
    }
}