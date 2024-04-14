package com.yeminnaing.interviewtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yeminnaing.interviewtest.ui.theme.MyColor

@Composable
fun BackgroundImage() {

    Box( modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)){

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            painter = painterResource(R.drawable.pretty_sportswoman_black_top_training_gym),
            contentDescription = "SportWomanTrainingGym"
            , contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(
                   MyColor.LightGreen.copy(
                        alpha = 0.7f
                    )
                )

        )
    }



}