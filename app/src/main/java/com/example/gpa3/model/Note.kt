package com.example.gpa3.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName ="notes")

data class Note (
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val noteTitle:String, //title
    val noteDesc:String
):Parcelable



