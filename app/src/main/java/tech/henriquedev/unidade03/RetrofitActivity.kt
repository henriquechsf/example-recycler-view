package tech.henriquedev.unidade03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tech.henriquedev.unidade03.api.RetrofitConfig
import tech.henriquedev.unidade03.models.Repository

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        RetrofitConfig
            .get()
            .getRepositories("language:Kotlin")
            .enqueue(object: Callback<Repository> {
                override fun onResponse(call: Call<Repository>, response: Response<Repository>) {
                    // Main Thread
                    Log.d("LM", "Retrofit Response: ${response.body()}")
                }

                override fun onFailure(call: Call<Repository>, t: Throwable) {
                    // Main Thread
                    Log.d("LM", "Retrofit Error: ${t.message}")
                }
            })
    }
}