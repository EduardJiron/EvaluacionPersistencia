package com.twelvehours.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(

@PrimaryKey(autoGenerate = true) val id :Int=0,
@ColumnInfo(name="name") val name:String?,

//ojo quiero los nombres de los seguidores y seguidos en nombre no en numeros
@ColumnInfo(name="followers") val followers:String?,
@ColumnInfo(name="following") val following:String?,
@ColumnInfo(name="numberRepositories") val numberRepositories:Int?


)
