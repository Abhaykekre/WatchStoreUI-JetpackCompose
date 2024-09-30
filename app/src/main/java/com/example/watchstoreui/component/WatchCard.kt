package com.example.watchstoreui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watchstoreui.R
import com.example.watchstoreui.model.Watch
import com.example.watchstoreui.ui.theme.BluePrimary

@Composable
fun WatchCard(modifier: Modifier = Modifier, watch: Watch) {
    Surface(
        modifier = modifier.wrapContentSize(),
        tonalElevation = 10.dp,
        shadowElevation = 0.75.dp,
        shape = RoundedCornerShape(14.dp),
        color = Color.White
    ) {
        Column(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                painter = painterResource(id = watch.image),
                contentDescription = "Image Watch",
            )
            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = watch.name,
                fontFamily = FontFamily(Font(R.font.raleway_semibold))
            )

            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = watch.type,
                fontFamily = FontFamily(Font(R.font.raleway_medium)),
                color = Color.Gray
            )

            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = watch.type,
                fontFamily = FontFamily(Font(R.font.raleway_medium)),
                color = BluePrimary
            )


        }
    }
}

@Preview
@Composable
private fun WatchCardPreview() {
    WatchCard(
        watch = Watch(
            name = "Rhonda Horton",
            type = "feugait",
            image = 5574,
            price = "gradvida"
        )
    )
}
