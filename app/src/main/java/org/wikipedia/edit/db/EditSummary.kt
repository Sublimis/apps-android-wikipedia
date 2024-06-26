package org.wikipedia.edit.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
class EditSummary(
    @PrimaryKey val summary: String,
    val lastUsed: Date = Date()) {

    override fun toString(): String {
        return summary
    }
}
