package com.twelvehours.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Repositories(


@PrimaryKey(autoGenerate = true) val id :Int=0,
@ColumnInfo(name="name") val name:String?,
@ColumnInfo(name="description") val description:String?,
@ColumnInfo(name="language") val language:String?,
@ColumnInfo(name="numbercommits") val numbercommits:Int?

)
