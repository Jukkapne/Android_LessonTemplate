package com.example.lessontemplate

import com.google.firebase.firestore.Exclude

data class User(@get:Exclude val username: String, val fname: String, val lname: String, val age: Int)