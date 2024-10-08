package com.example.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Note(
    var title : String,
    var description : String,
    var dateAdded : Long,

    @PrimaryKey(autoGenerate = true)
    val id : Int = 0


)
