package tech.henriquedev.unidade03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.henriquedev.unidade03.database.Book
import tech.henriquedev.unidade03.database.MyDb

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persistence)

        /*
        MyDb.getInstance(this).bookDao().insertBook(
            Book(1, "Senhor dos aneis", 35)
        )
        MyDb.getInstance(this).bookDao().insertBooks(
            Book(1, "Livro 1", 350),
            Book(2, "Livro 2", 320),
            Book(3, "Livro 3", 330)
        )
        */

        // alternativa com apply - funcoes de escope
        MyDb.getInstance(this).bookDao().apply {
            insertBook(Book(1, "Senhor dos aneis", 35))

            insertBooks(
                Book(2, "Clean Code", 400),
                Book(3, "Programando Android com Kotlin", 430)
            )
        }

        with(MyDb.getInstance(this).bookDao()) {
            insertBook(Book(4, "Casa do Codigo", 350))
        }

    }
}