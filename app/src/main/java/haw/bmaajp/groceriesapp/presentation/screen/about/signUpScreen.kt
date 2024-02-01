package haw.bmaajp.groceriesapp.presentation.screen.about

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import haw.bmaajp.groceriesapp.ui.theme.*

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    val activity = LocalContext.current as Activity

    Column(
        modifier = modifier
            .padding(top = DIMENS_24dp)
            .fillMaxSize()
    ) {
        // Write here
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}