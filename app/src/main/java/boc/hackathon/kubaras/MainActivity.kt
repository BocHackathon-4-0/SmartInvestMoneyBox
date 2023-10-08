@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import boc.hackathon.kubaras.data.TransactionData
import boc.hackathon.kubaras.ui.theme.AppTheme
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.json.Json
import org.json.JSONObject

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                SmartSavingsApp()
            }
        }
    }
}
