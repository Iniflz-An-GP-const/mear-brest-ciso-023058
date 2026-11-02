package oakline.mearbrestciso.corpapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import oakline.mearbrestciso.corpapp.ui.composable.approot.AppRoot
import oakline.mearbrestciso.corpapp.ui.theme.OEEOPAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OEEOPAppTheme {
                AppRoot()
            }
        }
    }
}