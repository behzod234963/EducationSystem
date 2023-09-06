package com.example.educationsystems.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.educationsystems.models.EduModel

@Dao
interface CoursesDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCourse(course:EduModel.Coureses)

    @Query("SELECT *FROM courses")
    fun getAllCourse(): List<EduModel.Coureses>

    @Query("SELECT *FROM courses WHERE coursesId=:id")
    fun getCourseById(id:Int):List<EduModel.Coureses>

    @Delete
    fun clearCourses(course:List<EduModel.Coureses>)

}

@Dao
interface GroupsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveGroup(group:EduModel.Groups)

    @Query("SELECT *FROM groups")
    fun getAllGroups(): List<EduModel.Groups>

    @Query("SELECT *FROM groups WHERE groupsId=:id")
    fun getGroupById(id:Int):List<EduModel.Groups>

    @Delete
    fun clearGroups(group:List<EduModel.Groups>)

}

@Dao
interface StudentsDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveStudents(students:EduModel.Students)

    @Query("SELECT *FROM students")
    fun getAllStudents(): List<EduModel.Students>

    @Query("SELECT *FROM students WHERE studentsId=:id")
    fun getStudentsById(id:Int):List<EduModel.Students>

    @Delete
    fun clearStudents(course:List<EduModel.Students>)

}

@Dao
interface MentorsDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMentors(course:EduModel.Mentors)

    @Query("SELECT *FROM mentors")
    fun getAllMentors(): List<EduModel.Mentors>

    @Query("SELECT *FROM mentors WHERE mentorsId=:id")
    fun getMentorsById(id:Int):List<EduModel.Mentors>

    @Delete
    fun clearMentors(mentors:List<EduModel.Mentors>)

}