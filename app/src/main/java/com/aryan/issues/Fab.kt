package com.aryan.issues

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View.OnClickListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aryan.issues.ui.theme.IssuesTheme

class Fab : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IssuesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android",this)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Greeting2(name: String,context:Context) {
    val issues: List<String> = listOf("Urban Flooding",
        "Rural Flooding",
        "Oil Spill" ,
        "Tsunami" ,
        "Polluted River",
        "Drought",
        "Drainage problems")

    LazyColumn(){items(issues) {currentIsssue->

        Card(modifier = Modifier.fillMaxWidth(),
//            onClick = {
//             val intent = Intent(context, AidProvide::class.java)
//                intent.putExtra("currentIsssue",currentIsssue)
//                context.startActivity(intent)
//            }
        ) {
            Text(text =currentIsssue, modifier = Modifier.fillMaxWidth().padding(20.dp))


        }
    }

}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    IssuesTheme {
        //Greeting2("Android", context =)
    }
}