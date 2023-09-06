package com.example.educationsystems.database

import android.app.Application
import com.example.educationsystems.models.EduModel

class StudentsRepository(val app:Application) {

    val studentsDao=EducationDataBase.educationDataBase(app).getStudentsDao()

    fun saveStudents(student:EduModel.Students){

        studentsDao.saveStudents(student)

    }

    fun getAllStudents():List<EduModel.Students>{

        return studentsDao.getAllStudents()

    }

    fun getStudentById(id:Int):List<EduModel.Students>{

        return studentsDao.getStudentsById(id)

    }

    fun clearStudents(student:List<EduModel.Students>){

        studentsDao.clearStudents(student)

    }

}