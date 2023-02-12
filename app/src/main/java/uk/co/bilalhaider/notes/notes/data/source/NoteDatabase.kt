package uk.co.bilalhaider.notes.notes.data.source

import androidx.room.Database
import uk.co.bilalhaider.notes.notes.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase {

    abstract val noteDao: NoteDao

    companion object {
        const val DB_NAME = "notes_db"
    }

}