package com.example.noteapp.data

import com.example.noteapp.model.Note

class NoteDataSource{
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "A good day", description = "Yesterday was a good day"),
            Note(title = "Mahzjab", description = "Magzhan and Azamat are gays"))
    }
}