package com.kotlearn.kotlearn.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.kotlearn.kotlearn.MainActivity
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.databinding.ActivityNotificationBinding


//You need to create notification channel first

class NotificationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotificationBinding
    private val CHANNEL_ID = "channel_id_example_01"
    private val notificationId = 101
    private lateinit var pendingIntent: PendingIntent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createNotificationChannel()

        onClicks()
    }

    private fun onClicks() {
        binding.btnNotif.setOnClickListener {
            sendNotification()
        }
    }


    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Notification Title"
            val descriptionText = "Notification Description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification() {

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        } else {
            pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        }

        val bitmap = BitmapFactory.decodeResource(
            applicationContext.resources,
            R.drawable.ic_launcher_background
        )
        val bitmapLargeIcon = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.img_naruto)

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("EXAMPLE TITLE")
            .setContentText("EXAMPLE DESC")
            .setLargeIcon(bitmap)
//            .setStyle(NotificationCompat.BigPictureStyle().bigPicture(bitmapLargeIcon)) //for displaying big picture in notif
            .setStyle(NotificationCompat.BigTextStyle().bigText("Sunt dominaes examinare fatalis, clemens rectores."))//for displaying big text
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)

        with(NotificationManagerCompat.from(this)) {
            notify(notificationId, builder.build())
        }

    }
}