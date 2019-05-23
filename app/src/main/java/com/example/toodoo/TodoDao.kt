package com.example.toodoo

import android.arch.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Query("SELECT * FROM todoentity")
    fun getAll(): List<TodoEntity>

    @Query("SELECT * FROM todoentity WHERE title LIKE :title")
    fun findByTitle(title: String): TodoEntity

    @Insert
    fun insertAll(vararg todo: TodoEntity)

    @Delete
    fun delete(todo: TodoEntity)

    @Update
    fun updateTodo(vararg todos: TodoEntity)

    @Query("SELECT * FROM todoentity WHERE title LIKE :title")
    fun findByTitle(title: String): LiveData<List<TodoEntity>>
}