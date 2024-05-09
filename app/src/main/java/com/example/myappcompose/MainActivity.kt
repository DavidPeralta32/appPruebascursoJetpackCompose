package com.example.myappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import com.example.myappcompose.ui.theme.MyAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    myComplexLayout()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Composable
fun myComplexLayout(){
    Column(Modifier.fillMaxSize()){
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center){

            Text(text = "Ejemplo 1")
        }
        Myspace(16)
        Row(
            Modifier
                .fillMaxSize()
                .weight(1f)){
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Yellow), contentAlignment = Alignment.Center){
                Text(text = "Ejemplo 2")
            }
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Magenta), contentAlignment = Alignment.Center
            ){
                Text(text = "Ejemplo 3")
            }
        }

        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Red), contentAlignment = Alignment.BottomCenter){
        Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun Myspace(p_heigth: Int) {
    Spacer(modifier = Modifier.height(p_heigth.dp))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppComposeTheme {
        myComplexLayout()
    }
}