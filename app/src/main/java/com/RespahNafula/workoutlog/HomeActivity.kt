package com.RespahNafula.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceControl
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bnvHome:BottomNavigationView
    lateinit var fcvHome:FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castViews()
        setupBottomNav()

    }
    fun castViews(){
        bnvHome=findViewById(R.id.btnLogin)
        fcvHome=findViewById(R.id.fcvHome)
    }
    fun setupBottomNav(){
        bnvHome.setOnItemSelectedListener{ item->
            when(item.itemId){
                R.id.Plan->{
                    var transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,TrackFragment())
                    transaction.commit()
                    true
                }
                R.id.track->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,TrackFragment())
                    true
                }
               R.id.profile->{
                   supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment())
                   true
               }
               else->false
            }

        }
    }
}