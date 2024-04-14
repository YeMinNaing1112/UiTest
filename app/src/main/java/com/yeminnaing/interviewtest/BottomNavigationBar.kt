package com.yeminnaing.interviewtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yeminnaing.interviewtest.data.BottomNavigationItem
import com.yeminnaing.interviewtest.ui.theme.MyColor

val items = listOf(
    BottomNavigationItem.One,
    BottomNavigationItem.Two,
    BottomNavigationItem.Three,
    BottomNavigationItem.Four
)


@Composable
fun BottomNavigationBar() {
    var selectedIndex by remember { mutableStateOf(0) }
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        Row(Modifier.background(Color.Black)) {
            items.forEachIndexed { index, items ->
                NavigationBarItem(
                    selected =  selectedIndex==index,
                    onClick = {
                        selectedIndex = index
                    },
                    icon = {
                        Icon(
                            painterResource(id = items.icon),
                            contentDescription = items.title,

                            )
                    },
                    label = {
                        Text(text = items.title)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MyColor.LightGreen,
                        selectedTextColor = MyColor.LightGreen,
                        indicatorColor = Color.Transparent,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    ),
                )
            }
        }
    }
}

