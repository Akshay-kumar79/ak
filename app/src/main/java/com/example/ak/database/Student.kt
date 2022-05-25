package com.example.ak.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class Student(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,
    val batch: String,
    val age: Int
)
