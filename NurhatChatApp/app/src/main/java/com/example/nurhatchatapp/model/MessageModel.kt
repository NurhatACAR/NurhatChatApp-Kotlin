package com.example.nurhatchatapp.model

import java.sql.Timestamp

data class MessageModel(
    var message : String? = "",
    var senderId : String? = "",
    var timeStamp : Long? = 0,
)
