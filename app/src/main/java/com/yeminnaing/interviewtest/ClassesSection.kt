package com.yeminnaing.interviewtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeminnaing.interviewtest.ui.theme.MyColor

@Composable
fun ClassesSection() {
    Surface(
        modifier = Modifier
            .clip(
                RoundedCornerShape(
                    topStart = 24.dp, topEnd = 24.dp
                )
            )
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(bottom = 110.dp)
    ) {
        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
            ClassAndButton()
            Spacer(modifier = Modifier.height(14.dp))
            CardSection()
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.girl_kickboxer),
                contentDescription = "GirlKickBoxer",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                contentScale = ContentScale.Crop
            )

        }

    }
}

@Preview
@Composable
fun ClassesSectionPreview() {
    ClassesSection()
}

@Composable
fun ClassAndButton() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 14.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(
            text = "Classes",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,

            )

        Button(
            onClick = { }, colors = ButtonDefaults.buttonColors(
                containerColor = MyColor.LightGreen
            )
        ) {
            Text(
                text = "Today", fontWeight = FontWeight.Thin
            )

            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = "DownArrow"
            )

        }
    }
}

@Composable
fun CardSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.people_doing_indoor_cycling),
                contentDescription = "IndoorCycling",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Spinning Interval",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 10.dp, top = 14.dp),
                    fontWeight = FontWeight.Bold
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Person",
                        modifier = Modifier.padding(top = 14.dp)
                    )

                    Text(
                        text = "Marvin J.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MyColor.TextColorGrey,
                        modifier = Modifier.padding(
                            end = 10.dp, top = 14.dp, start = 10.dp
                        ),
                        fontWeight = FontWeight.Bold

                    )
                }

            }

            Spacer(modifier = Modifier.height(10.dp))


            Image(
                painterResource(id = R.drawable.horizontal_line),
                contentScale = ContentScale.Crop,
                contentDescription = "line",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .padding(start = 10.dp, end = 10.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Column {
                    Text(
                        text = "Duration",
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 16.sp,
                        color = MyColor.TextColorGrey,
                        modifier = Modifier.padding(
                            end = 10.dp, start = 10.dp
                        )
                    )
                    Text(
                        text = "50mins",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MyColor.TextColorGrey,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(
                            end = 10.dp, start = 10.dp, bottom = 10.dp
                        ),
                        fontWeight = FontWeight.Bold
                    )
                }
                Image(
                    modifier = Modifier
                        .width(20.dp)
                        .height(40.dp),
                    painter = painterResource(id = R.drawable.vertical_line),
                    contentDescription = "Vertical Line", contentScale = ContentScale.Crop,
                )
                Column {
                    Text(
                        text = "Time",
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 16.sp,
                        color = MyColor.TextColorGrey,
                        modifier = Modifier.padding(
                            end = 10.dp, start = 10.dp
                        )
                    )
                    Text(
                        text = "15:00-16:00",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MyColor.TextColorGrey,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(
                            end = 10.dp, start = 10.dp, bottom = 10.dp
                        ),
                        fontWeight = FontWeight.Bold
                    )
                }
                Image(
                    modifier = Modifier
                        .width(20.dp)
                        .height(40.dp),
                    painter = painterResource(id = R.drawable.vertical_line),
                    contentDescription = "Vertical Line", contentScale = ContentScale.Crop,
                )
                Text(
                    text = "2 Sport Left",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MyColor.LightGreen,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }


    }
}