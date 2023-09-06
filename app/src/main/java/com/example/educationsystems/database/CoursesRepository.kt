package com.example.educationsystems.database

import android.app.Application
import com.example.educationsystems.models.EduModel

class CoursesRepository(val app: Application) {

    val courseDao=EducationDataBase.educationDataBase(app).getCoursesDao()

    fun saveCourse(course:EduModel.Coureses){

        courseDao.saveCourse(course)

    }

    fun getAllCourse():List<EduModel.Coureses>{

        return courseDao.getAllCourse()

    }

    fun getCourseById(id:Int):List<EduModel.Coureses>{

        return courseDao.getCourseById(id)

    }

    fun clearCourses(course:List<EduModel.Coureses>){

        courseDao.clearCourses(course)

    }

}