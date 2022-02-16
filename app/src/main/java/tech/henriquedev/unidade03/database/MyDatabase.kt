package tech.henriquedev.unidade03.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Book::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao

    /**
     * Exemplo de outras DAOs
     * Um DAO para cada entidade
     * abstract fun clienteDao(): ClienteDao
     * abstract fun notebookDao(): NOtebookDao
     */
}

object MyDb {
    fun getInstance(context: Context): MyDatabase =
        Room.databaseBuilder(
            context,
            MyDatabase::class.java,
            "my-database"
        ).build()
}