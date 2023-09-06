package com.example.educationsystems.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.educationsystems.models.EduModel


@Database(entities = [
    EduModel.Coureses::class,
    EduModel.Groups::class,
    EduModel.Students::class,
    EduModel.Mentors::class],
    version = 1)
abstract class EducationDataBase :RoomDatabase(){

    abstract fun getCoursesDao():CoursesDao
    abstract fun getGroupsDao():GroupsDao
    abstract fun getStudentsDao():StudentsDao
    abstract fun getMentorsDao():MentorsDao

    companion object{

        var DB_INSTANCE:EducationDataBase?=null

        fun educationDataBase(ctx:Context):EducationDataBase{

            if (DB_INSTANCE==null){

                DB_INSTANCE= Room.databaseBuilder(ctx.applicationContext,EducationDataBase::class.java,"edu").allowMainThreadQueries().build()

            }

            return DB_INSTANCE!!

        }

    }

}