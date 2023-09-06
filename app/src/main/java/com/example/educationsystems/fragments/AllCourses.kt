package com.example.educationsystems.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.educationsystems.R
import com.example.educationsystems.adapter.CoursesAdapter
import com.example.educationsystems.database.CoursesRepository
import com.example.educationsystems.databinding.FragmentAllCoursesBinding
import com.example.educationsystems.models.EduModel

class AllCourses : Fragment() {

    lateinit var binding: FragmentAllCoursesBinding
    lateinit var coursesRepository: CoursesRepository
    lateinit var couresesModel:ArrayList<EduModel.Coureses>
    lateinit var coursesAdapter: CoursesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentAllCoursesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

    }

    private fun initView() {

        coursesRepository= CoursesRepository(requireActivity().application)
        couresesModel= ArrayList()
        loadList()
        coursesAdapter= CoursesAdapter()
        binding.rvCourseListAllCourses.layoutManager=LinearLayoutManager(requireContext())
        binding.rvCourseListAllCourses.adapter=coursesAdapter
        coursesAdapter.submitList(couresesModel)

    }

    private fun loadList() {
        coursesRepository= CoursesRepository(requireActivity().application)
        couresesModel=ArrayList()
        val android=couresesModel.add(EduModel.Coureses(null,"Android Development"))
        val frontend=couresesModel.add(EduModel.Coureses(null,"Frontend Development"))
        val java=couresesModel.add(EduModel.Coureses(null,"Java Development"))
        val dataBase=couresesModel.add(EduModel.Coureses(null,"DataBase Development"))
        val spring=couresesModel.add(EduModel.Coureses(null,"Spring Development"))
        val python=couresesModel.add(EduModel.Coureses(null,"Python Development"))
        val iOS=couresesModel.add(EduModel.Coureses(null,"IOS Development"))
        val flutter=couresesModel.add(EduModel.Coureses(null,"Flutter Development"))

        coursesRepository.saveCourse(EduModel.Coureses(null,android.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,frontend.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,java.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,dataBase.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,spring.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,python.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,iOS.toString()))
        coursesRepository.saveCourse(EduModel.Coureses(null,flutter.toString()))

    }

}