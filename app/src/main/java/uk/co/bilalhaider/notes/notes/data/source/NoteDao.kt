package uk.co.bilalhaider.notes.notes.data.source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uk.co.bilalhaider.notes.notes.domain.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNote(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}