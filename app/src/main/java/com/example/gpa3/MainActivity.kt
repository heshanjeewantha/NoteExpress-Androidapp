package com.example.gpa3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.gpa3.database.NoteDatabase
import com.example.gpa3.model.Note
import com.example.gpa3.repository.NoteRepository
import com.example.gpa3.viewmodel.NoteViewModel
import com.example.gpa3.viewmodel.NoteViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var  noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
    }
    private fun setupViewModel(){
        val noteRepository=NoteRepository(NoteDatabase(this))
        val viewModelProviderFactory=NoteViewModelFactory(application,noteRepository)
        noteViewModel=ViewModelProvider(this,viewModelProviderFactory)[NoteViewModel::class.java]
    }
}