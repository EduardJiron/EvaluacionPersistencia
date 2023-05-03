package com.twelvehours.miproyectofinal.datos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.twelvehours.miproyectofinal.dao.DaoQueryUr
import com.twelvehours.miproyectofinal.entidades.Repositories
import com.twelvehours.miproyectofinal.entidades.User


@Database (entities = [User::class, Repositories::class], version = 1)
abstract class GitHubBd:RoomDatabase(){

    abstract fun gitHubDb():DaoQueryUr

}

