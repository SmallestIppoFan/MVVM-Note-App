package com.example.noteapp.repository

import com.example.noteapp.data.NoteDatabase
import com.example.noteapp.data.NoteDatabaseDao
import com.example.noteapp.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaseDao: NoteDatabaseDao) {
    suspend fun addNote(note: Note)=noteDatabaseDao.insert(note)
}