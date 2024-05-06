package com.example.tamagchi

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var changeButton: Button
    private lateinit var changeButton2: Button

    private var currentImageIndex = 0
    private val imageList = listOf(
        R.drawable.dog_eat,
        R.drawable.dog_play,
        R.drawable.dog_wash
    )

    private var isImage1Displayed = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        changeButton = findViewById(R.id.CButton1)
        changeButton2 = findViewById(R.id.Cbutton2)

        changeButton.setOnClickListener {
            changeImage()
        }

        changeButton2.setOnClickListener {
            changeImage()
        }
    }

    private fun changeImage() {
        currentImageIndex = (currentImageIndex + 1) % imageList.size
        imageView.setImageResource(imageList[currentImageIndex])
                }
            }
