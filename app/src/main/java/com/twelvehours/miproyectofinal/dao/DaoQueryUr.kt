package com.twelvehours.miproyectofinal.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.twelvehours.miproyectofinal.entidades.Repositories
import com.twelvehours.miproyectofinal.entidades.User


@Dao
interface DaoQueryUr {

    //Crud para la tabla User
    @Query("Select *from User")
    fun getAll ():List<User>

    @Insert
    fun insertUser (user:User)

    @Query("Delete from User where id=:id")
    fun deleteUser (id:Int)

    @Query("Update User set name=:name, followers=:followers, following=:following, numberRepositories=:numberRepositories where id=:id")
    fun updateUser (id:Int, name:String, followers:String, following:String, numberRepositories:Int)

    //Crud para la tabla Repositories
    @Query("Select *from Repositories")
    fun getAllRepositories ():List<Repositories>

    @Insert
    fun insertRepositories (repositories: Repositories)

    @Query("Delete from Repositories where id=:id")
    fun deleteRepositories (id:Int)

    @Query("Update Repositories set name=:name, description=:description, language=:language, numbercommits=:commits where id=:id")
    fun updateRepositories (id:Int, name:String, description:String, language:String, commits:Int)

    






}