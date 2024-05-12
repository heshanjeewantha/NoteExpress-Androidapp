package com.example.gpa3.repository

import com.example.gpa3.database.NoteDatabase
import com.example.gpa3.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note)=db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note)=db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note)=db.getNoteDao().updateNote(note)

    fun getAllNotes()=db.getNoteDao().getALLNotes()
    fun searchNotes(query:String?)=db.getNoteDao().searchNote(query)
}