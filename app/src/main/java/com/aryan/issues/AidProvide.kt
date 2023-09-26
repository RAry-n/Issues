package com.aryan.issues

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.aryan.issues.ui.theme.IssuesTheme
import java.time.format.TextStyle

class AidProvide : ComponentActivity() {
private lateinit var database : DatabaseReference
private val storage = FirebaseStorage.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val issueType : String = intent.getStringExtra("currentIsssue").toString()
        setContent {
            IssuesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3(issueType)
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {

   Column(modifier= Modifier.fillMaxWidth()
       .fillMaxHeight(0.75f)
       ) {
       Text(
           text = name,
           style = androidx.compose.ui.text.TextStyle(
               fontSize = 16.sp,
               fontFamily = FontFamily.Monospace,
               fontWeight = FontWeight.W800,
               fontStyle = FontStyle.Italic,
              // letterSpacing = 0.5.em,
               textDecoration = TextDecoration.Underline
           )
       //style = androidx.compose.ui.text.TextStyle(

       )
       var text by remember { mutableStateOf(TextFieldValue("")) }
       OutlinedTextField(
modifier = Modifier.fillMaxHeight(0.8f),
           value = text,
           label = { Text(text = "Enter Your Solution") },
           onValueChange = {it ->
               text = it
           }
       )
Row(modifier = Modifier.fillMaxWidth()) {
    Button(onClick = {

    }, shape = CutCornerShape(20)) {
        Text(text = "Send")
    }
    Spacer(modifier = Modifier.fillMaxWidth(0.4f))
    Button(onClick = {}, shape = CutCornerShape(20)) {
        Text(text = "Donate")
    }
}

   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    IssuesTheme {
        Greeting3("Android")
    }
}