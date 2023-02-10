package uk.co.bilalhaider.notes.notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import uk.co.bilalhaider.notes.ui.theme.BabyBlue
import uk.co.bilalhaider.notes.ui.theme.LightGreen
import uk.co.bilalhaider.notes.ui.theme.Orange
import uk.co.bilalhaider.notes.ui.theme.Pink
import uk.co.bilalhaider.notes.ui.theme.Violet

@Entity
class Note(
    val title: String,
    val content: String,
    val timestamp: String,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {

    companion object {
        val colors = listOf(Orange, Pink, BabyBlue, Violet, LightGreen)
    }
}

class InvalidNoteException(message: String): Exception(message)

