package com.example.kotlinr

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //private var toast: Toast? = null
    //private var mToastToShow: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("LogCheck","This is On Create")

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.ButtonAct1.setOnClickListener(View.OnClickListener {
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        Toast.makeText(this, "This is Activity 2", Toast.LENGTH_SHORT).show()

        })

        binding.ButtonAct3.setOnClickListener(View.OnClickListener {
            intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            Toast.makeText(this, "This is Activity 4", Toast.LENGTH_SHORT).show()
        })

        binding.ButtonAct4.setOnClickListener(View.OnClickListener {
            intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
            Toast.makeText(this, "This is Activity 5", Toast.LENGTH_SHORT).show()
        })

//        val toastCountDown: CountDownTimer

//        toastCountDown =
//            object : CountDownTimer(toastDurationInMilliSeconds.toLong(), 1000 /*Tick duration*/) {
//                override fun onTick(millisUntilFinished: Long) {
//                    mToastToShow!!.show()
//                }
//
//                override fun onFinish() {
//                    mToastToShow!!.cancel()
//                }
//            }
//
//        mToastToShow?.show()
//        toastCountDown.start()


        binding.ButtonAct2.setOnClickListener( View.OnClickListener {
            intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        })

    }

    override fun onStart() {
        super.onStart()
        Log.e("LogCheck","This is On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LogCheck","This is On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LogCheck","This is On Pause")

    }

    override fun onStop() {
        super.onStop()
        Log.e("LogCheck","This is On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LogCheck","This is On Destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("LogCheck","This is On Restart")
    }

}