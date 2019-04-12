package com.netzon.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(LithoView.create(
            this,
            ButtonContainer.create(ComponentContext(this))
                .listener(object : ButtonContainerSpec.OnButtonClickListener {
                    override fun onButtonClick() {
                        Log.d("Test", "Hello World!")
                    }
                })
                .build()
        ))
    }
}
