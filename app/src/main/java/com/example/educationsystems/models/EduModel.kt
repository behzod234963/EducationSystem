package com.example.educationsystems.models

import androidx.room.Entity
import androidx.room.PrimaryKey

class EduModel {

    @Entity(tableName = "courses")
    data class Coureses(
        @PrimaryKey(autoGenerate = true)
        val coursesId:Int?=null,
        val courseName:String,
    )

    @Entity(tableName = "groups")
    data class Groups(
        @PrimaryKey(autoGenerate = true)
        val groupsId:Int?=null,
        val groupsName:String,
        val groupIsOpen:Boolean=false)

    @Entity(tableName = "mentors")
    data class Mentors(
        @PrimaryKey(autoGenerate = true)
        val mentorsId:Int?=null,
        val mentorName:String,
        val mentorSurName:String,
        val mentorLastName:String
    )

    @Entity(tableName = "students")
    data class Students(
        @PrimaryKey(autoGenerate = true)
        val studentsId:Int?=null,
        val studentsName:String,
        val studentsSurName:String,
        val studentsLastName:String,
        val studentsBirthday:String)

}