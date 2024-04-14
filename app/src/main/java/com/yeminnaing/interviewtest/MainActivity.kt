package com.yeminnaing.interviewtest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yeminnaing.interviewtest.ui.theme.InterviewTestTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterviewTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        bottomBar = { BottomNavigationBar() }
                    ) { paddingValues ->
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState())
                        ) {
                            Box {
                                BackgroundImage()
                                Column(
                                    modifier = Modifier.padding(
                                        top = 24.dp
                                    )
                                ) {
                                    Text(
                                        modifier = Modifier.padding(start = 25.dp),
                                        text = "Upcoming \nClass",
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.background,
                                    )
                                    Spacer(modifier = Modifier.height(16.dp))
                                    DateSection()
                                    Spacer(modifier = Modifier.height(16.dp))
                                    ClassesSection()


                                }
                            }


                        }
                    }
                }
            }
        }
    }
}

