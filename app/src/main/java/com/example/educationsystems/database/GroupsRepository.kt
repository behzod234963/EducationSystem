package com.example.educationsystems.database

import android.app.Application
import com.example.educationsystems.models.EduModel

class GroupsRepository(val app:Application) {

    val groupsDao=EducationDataBase.educationDataBase(app).getGroupsDao()

    fun saveGroups(group:EduModel.Groups){

        groupsDao.saveGroup(group)

    }

    fun getAllGroup():List<EduModel.Groups>{

        return groupsDao.getAllGroups()

    }

    fun getGroupById(id:Int):List<EduModel.Groups>{

        return groupsDao.getGroupById(id)

    }

    fun clearGroups(group:List<EduModel.Groups>){

        groupsDao.clearGroups(group)

    }

}