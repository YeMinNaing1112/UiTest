package com.yeminnaing.interviewtest.data

import com.yeminnaing.interviewtest.R

sealed class BottomNavigationItem(
    var title: String,
    var icon: Int
) {
    data object One : BottomNavigationItem("Home", R.drawable.home)
    data object Two : BottomNavigationItem("Upcomming", R.drawable.calendar)
    data object Three : BottomNavigationItem("Bookings", R.drawable.booking)
    data object Four : BottomNavigationItem("Memberships", R.drawable.identity)
}
