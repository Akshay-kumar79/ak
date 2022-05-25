package com.example.ak.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StudentDao {

    @Insert
    fun insertStudent(student: Student): Long

    @Update
    fun updateStudent(student: Student)

    @Query("select * from student where id = :key")
    fun getStudent(key: Long): Student

    @Query("select * from student")
    fun getAllStudents(): LiveData<List<Student>>

    @Query("delete from student where id = :key")
    fun delete(key: Long)

    @Query("delete from student")
    fun clear()

}