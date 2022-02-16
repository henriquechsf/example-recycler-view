package tech.henriquedev.unidade03.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDao {
    @Query("SELECT * FROM book")
    fun getBooks(): List<Book>

    @Insert
    fun insertBook(book: Book)

    @Insert
    fun insertBooks(vararg book: Book)

    @Update
    fun updateBook(book: Book)
}