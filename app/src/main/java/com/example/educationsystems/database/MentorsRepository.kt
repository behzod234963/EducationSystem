package com.example.educationsystems.database

import android.app.Application
import com.example.educationsystems.models.EduModel

class MentorsRepository(val app:Application) {

    val mentorsDao=EducationDataBase.educationDataBase(app).getMentorsDao()

    fun saveMentors(mentor:EduModel.Mentors){

        mentorsDao.saveMentors(mentor)

    }

    fun getAllMentor():List<EduModel.Mentors>{

        return mentorsDao.getAllMentors()

    }

    fun getMentorById(id:Int):List<EduModel.Mentors>{

        return mentorsDao.getMentorsById(id)

    }

    fun clearMentors(mentor:List<EduModel.Mentors>){

        mentorsDao.clearMentors(mentor)

    }

}