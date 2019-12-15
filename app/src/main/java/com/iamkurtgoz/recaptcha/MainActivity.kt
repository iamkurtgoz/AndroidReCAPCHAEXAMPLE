package com.iamkurtgoz.recaptcha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.gms.safetynet.SafetyNet
import com.google.android.gms.safetynet.SafetyNetClient

class MainActivity : AppCompatActivity() {

    private val siteKey: String = "6Le72ccUAAAAADRmRU5_DAMJRh0JB4Uuz3L8Q_lz"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reCaptcha(view: View){
        SafetyNet.getClient(this).verifyWithRecaptcha(siteKey)
            .addOnSuccessListener {
                //Başarılı ise çalışır
                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()
            }.addOnFailureListener {
                //Hata aldıysa
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
            }
    }
}
