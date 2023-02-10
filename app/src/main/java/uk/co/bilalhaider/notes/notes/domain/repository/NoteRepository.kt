package uk.co.bilalhaider.notes.notes.domain.repository

import kotlinx.coroutines.flow.Flow
import uk.co.bilalhaider.notes.notes.domain.model.Note

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>
    suspend fun getNote(id: Int): Note?
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)

}
