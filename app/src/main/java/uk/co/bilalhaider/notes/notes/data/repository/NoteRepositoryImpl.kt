package uk.co.bilalhaider.notes.notes.data.repository

import kotlinx.coroutines.flow.Flow
import uk.co.bilalhaider.notes.notes.data.source.NoteDao
import uk.co.bilalhaider.notes.notes.domain.model.Note
import uk.co.bilalhaider.notes.notes.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> = dao.getNotes()

    override suspend fun getNote(id: Int): Note? = dao.getNote(id)

    override suspend fun insertNote(note: Note) = dao.insertNote(note)

    override suspend fun deleteNote(note: Note) = dao.deleteNote(note)
}