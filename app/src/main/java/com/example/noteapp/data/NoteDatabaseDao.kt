package com.example.noteapp.data

import androidx.compose.runtime.MutableState
import androidx.room.*
import com.example.noteapp.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDatabaseDao {
    @Query("SELECT * from note_tbl")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note_tbl where id=:id")
    suspend fun getNoteByID(id:String):Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note:Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note:Note)

    @Query("DELETE from note_tbl")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteNote(note:Note)

}
