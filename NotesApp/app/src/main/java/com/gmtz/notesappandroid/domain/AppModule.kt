package com.gmtz.notesappandroid.domain

import android.app.Application
import androidx.room.Room
import com.gmtz.notesappandroid.domain.usescases.DeleteNote
import com.gmtz.notesappandroid.domain.usescases.GetNote
import com.gmtz.notesappandroid.domain.usescases.GetNotes
import com.gmtz.notesappandroid.domain.usescases.NoteUseCases
import com.gmtz.notesappandroid.data.NoteDatabase
import com.gmtz.notesappandroid.data.NoteRepository
import com.gmtz.notesappandroid.domain.usescases.AddNote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}