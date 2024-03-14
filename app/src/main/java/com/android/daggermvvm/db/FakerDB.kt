package com.android.daggermvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.daggermvvm.db.FakerDAO
import com.android.daggermvvm.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {

    abstract fun getFakerDAO() : FakerDAO

}