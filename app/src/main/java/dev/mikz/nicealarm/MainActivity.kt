package dev.mikz.nicealarm

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mikz.nicealarm.ui.theme.NiceAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NiceAlarmTheme {
                AlarmContainer()
            }
        }
    }
}

@Composable
fun AlarmContainer(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Text(
                text = "Alarm",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "12:00 am",
                textAlign = TextAlign.Center,
                fontSize = 60.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "Alarm will sound in x hours y minutes",
                color = MaterialTheme.colorScheme.secondary
            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
            ) {
                DateButton("S")
                DateButton("M")
                DateButton("T")
                DateButton("W")
                DateButton("T")
                DateButton("F")
                DateButton("S")
            }
            Text(
                text = "Chill Wakeup",
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(top = 30.dp)
            )
        }
    }
}

@Composable
fun DateButton(date: String, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = modifier.size(40.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(text = date)
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark",
    showBackground = true
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight",
    showBackground = true
)
@Composable
fun AlarmPreview() {
    NiceAlarmTheme {
        AlarmContainer()
    }
}
