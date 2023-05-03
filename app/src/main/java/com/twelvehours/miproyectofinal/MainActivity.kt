package com.twelvehours.miproyectofinal

import android.app.DownloadManager.Query
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.twelvehours.miproyectofinal.datos.GitHubBd
import com.twelvehours.miproyectofinal.entidades.Repositories
import com.twelvehours.miproyectofinal.entidades.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //esto es para comprovar que ssta funcionando bien la aplicacion 


        var room = Room.databaseBuilder(this,GitHubBd::class.java,"GitHubBd").build()



        lifecycleScope.launch(Dispatchers.IO){
            room.gitHubDb().updateUser(id = 1, name = "Carlos", followers = "Hernosto" , following = "fernando", numberRepositories = 30)
            room.gitHubDb().updateRepositories(id = 1, name = "Persistencia", description = "este sistematico" , language = "kotlin", commits = 30)
            var txtUser = room.gitHubDb().getAllUser()
            var txtRepo=room.gitHubDb().getAllRepositories()

            room.gitHubDb().insertUser(user= User(name = "juan", followers = "juana" , following = "maria", numberRepositories = 30))
            room.gitHubDb().insertRepositories(repositories = Repositories(name = "12Craft", description = "Gestionar repo" , language = "kotlin", numbercommits = 30))


            for(it in txtUser){
                    //funcional user
                println("${it.id},${it.name}, ${it.followers}, ${it.following}, ${it.numberRepositories}")

            }

            for (it in txtRepo){
                //funcional repositories
                println("${it.id},${it.name}, ${it.description}, ${it.language}, ${it.numbercommits}")
            }
        }


    }
}