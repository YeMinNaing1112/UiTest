package com.yeminnaing.interviewtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeminnaing.interviewtest.data.Date

val dateList = listOf(
    Date(
        date = "12 Jun", day = "Mon", backgroundColor = Color.White
    ), Date(
        date = "13 Jun", day = "Tue", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    ), Date(
        date = "14 Jun", day = "Wes", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    ), Date(
        date = "12 Jun", day = "Thu", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    ), Date(
        date = "15 Jun", day = "Fri", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    ), Date(
        date = "16 Jun", day = "Sat", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    ), Date(
        date = "17 Jun", day = "Sun", backgroundColor = Color.White.copy(
            alpha = 0.5f
        )
    )
)

@Composable
fun DateSection() {
    LazyRow(modifier = Modifier.padding(start = 16.dp)) {
        items(dateList.size) { index ->

            DateCard(index)
        }
    }

}

@Composable
fun DateCard(index: Int) {
    val dateCard = dateList[index]
    var lastItemPaddingEnd = 0.dp
    if (index == dateList.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
    Box(
        modifier = Modifier.padding(
            start = 10.dp, end = lastItemPaddingEnd
        )
    ) {
        Column(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(16.dp)
                )
                .background(dateCard.backgroundColor)
                .width(105.dp)
                .height(140.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = dateCard.date,
                fontSize =24.sp
            )
            Text(text = dateCard.day,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold
            )
        }
    }

}