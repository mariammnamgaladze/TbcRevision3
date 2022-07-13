package com.example.tbcrevision3

data class Section(
    val title: String,
    val image: Int,
    )

val sectionList = listOf(
    Section(
        "Address",
        R.drawable.ic_address
    ),
    Section(
        "Edit Profile",
        R.drawable.ic_edit
    ),
    Section(
        "Language",
        R.drawable.ic_language
    ),
    Section(
        "Dark Mode",
        R.drawable.ic_dark_mode
    ),
    Section(
        "Invite Friends",
        R.drawable.ic_friends
    ),
    Section(
        "Payment",
        R.drawable.ic_payment
    ),
    Section(
        "Notifications",
        R.drawable.ic_notification
    ),
    Section(
        "Privacy Policy",
        R.drawable.ic_privacy
    ),
    Section(
        "Logout",
        R.drawable.ic_logout
    ),



    )