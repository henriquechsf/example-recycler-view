package tech.henriquedev.unidade03.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="page_count")
    val pageCount: Int
)