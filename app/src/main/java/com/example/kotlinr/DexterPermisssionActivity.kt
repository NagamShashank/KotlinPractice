package com.example.kotlinr

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinr.databinding.ActivityDexterPermisssionBinding
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener

class DexterPermisssionActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDexterPermisssionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDexterPermisssionBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.PermissionsBtn.setOnClickListener( View.OnClickListener {
            getMyPermissions()
        })




    }

    private fun getMyPermissions() {
        Dexter.withContext(this)
            .withPermissions(Manifest.permission.CAMERA, Manifest.permission.READ_CONTACTS)
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                    report.let {
                        if (report != null) {
                            if(report.areAllPermissionsGranted()){
                                Toast.makeText(applicationContext,"All Permissions Granted", Toast.LENGTH_SHORT).show()
                            }else{
                                Toast.makeText(applicationContext,"Permissions Denied", Toast.LENGTH_SHORT).show()
                            }
                        }

                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions: MutableList<PermissionRequest>?, token: PermissionToken?) {
                    token?.continuePermissionRequest()
                }
            }).withErrorListener{
                Toast.makeText(applicationContext,it.name, Toast.LENGTH_SHORT).show()
            }.check()
    }
}