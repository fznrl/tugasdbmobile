package nurul.fauzan.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Query("Select * from note")
    fun getNotes(): LiveData<List<Note>>

    @Insert(onConflict = onConflictStrategy.IGNORE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)
}