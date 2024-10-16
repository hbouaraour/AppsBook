package fr.hamtec.appsbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.appsbook.buttonTypeRadio.BasicRadioButtonExample
import fr.hamtec.appsbook.champsFormulaires.Name
import fr.hamtec.appsbook.lesListes.SecondLazy
import fr.hamtec.appsbook.lesListes.firstLazy
import fr.hamtec.appsbook.ui.theme.AppsBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppsBookTheme {
                SecondLazy()
            }
        }
    }
}
