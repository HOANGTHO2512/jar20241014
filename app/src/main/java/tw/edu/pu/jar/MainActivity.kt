package tw.edu.pu.jar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.jar.ui.theme.JarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "huangshou",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //var x:Int = 0
    var x by remember { mutableStateOf(0) }
    Column {
        Row {
            Button(onClick = { x = 0 }) {
                Text(text = "黄夀")
                Image(
                    painterResource(id = R.drawable.me),
                    contentDescription = "snow",
                    modifier = Modifier.size(20.dp)
                )
            }
                Button(onClick = { x = x *2 }) {
                    Text(text = "huangshou24")
                    Image(
                        painterResource(id = R.drawable.jar),
                        contentDescription = "snow",
                        modifier = Modifier.size(20.dp)
                    )
                }
        }
        Text(text = x.toString(), fontSize = 50.sp,
            modifier = Modifier.clickable { x++ })
        Row {
            Text(
                text = stringResource(R.string.author),
                color = Color.Green,
                fontSize = 25.sp,
                modifier = modifier,
                fontFamily = FontFamily(Font(R.font.jar))
            )
            Image(
                painter = painterResource(id = R.drawable.huangshou),
                contentDescription = "jar", alpha = 0.9f,
                modifier = modifier
            )
            Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(id = R.drawable.lihuangshou),
                    contentDescription = "jar", alpha = 0.9f
                )
        }
        }
    }
}


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        JarTheme {
            Greeting("Android")
        }
    }
