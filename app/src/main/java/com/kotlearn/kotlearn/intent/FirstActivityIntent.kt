package com.kotlearn.kotlearn.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.databinding.ActivityFirstIntentBinding


/*
Intent - is a messaging object you can use to request an action from another app component
Uses of Intent
- Starting an activity
- Starting a service
- Delivering a broadcast (Broadcast Receivers)

Explicit Intents - we will give the destination class name explicitly
    val intent = Intent(this, SecondActivity::class.java)
    startService(intent)

Implicit Intents - can specify the destination using a String
    val sendIntent = Intent()
    sendIntent.action = Intent.ACTION_SEND
    sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage)
    sendIntent.type = "text/plain"
    if(sendIntent.resolveActivity(packageManager) != null) {
       startActivity(sendIntent)
    }

*/

class FirstActivityIntent : AppCompatActivity() {

    private lateinit var binding: ActivityFirstIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFirstIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClicks()

    }

    private fun onClicks() {
        binding.btnExplicit.setOnClickListener {
            val intent = Intent(this, SecondActivityIntent::class.java)
            intent.putExtra("IntentNAME","LLANDER LLOYD LIM!")
            startActivity(intent)
            finish()
        }

        binding.btnImplicit.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"DALE GAYSHIT")
            intent.type = "text/plain"
            startActivity(intent)
        }
    }


}