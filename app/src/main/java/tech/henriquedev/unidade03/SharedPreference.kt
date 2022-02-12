package tech.henriquedev.unidade03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

private const val PREF_EMAIL = "email"
private const val PREF_SMS = "sms"
private const val PREF_MAX = "max"
private const val PREF = "MinhasPreferencias"

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        val chkEmail = findViewById<CheckBox>(R.id.chk_email)
        val chkSms = findViewById<CheckBox>(R.id.chk_sms)
        val edtMax = findViewById<EditText>(R.id.edt_max)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar_preferencias)

        val pref = getSharedPreferences(PREF, MODE_PRIVATE)

        chkEmail.isChecked = pref.getBoolean(PREF_EMAIL, false)
        chkSms.isChecked = pref.getBoolean(PREF_SMS, false)
        edtMax.setText(pref.getString(PREF_MAX, "5"))

        btnSalvar.setOnClickListener {
            val edit = pref.edit()
            edit.putBoolean(PREF_EMAIL, chkEmail.isChecked).apply()
            edit.putBoolean(PREF_SMS, chkSms.isChecked).apply()
            edit.putString(PREF_MAX, edtMax.text.toString())
                .apply()
        }
    }
}