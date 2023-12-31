package com.example.data.data.local.room


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.data.local.room.daos.CharacterDao
import com.example.data.data.local.room.entity.CharacterModelEntity

@Database(entities = [CharacterModelEntity::class], version = 1, exportSchema = false)
abstract class DataBase: RoomDatabase() {

    abstract fun characterDao(): CharacterDao
}