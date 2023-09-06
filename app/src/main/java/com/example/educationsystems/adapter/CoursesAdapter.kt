package com.example.educationsystems.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.educationsystems.R
import com.example.educationsystems.models.EduModel

class CoursesAdapter:RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

    var onClick:((Int)->Unit)?=null

    val list:ArrayList<EduModel.Coureses> = ArrayList()

    fun submitList(list:ArrayList<EduModel.Coureses>){

        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    = CoursesViewHolder(LayoutInflater.
    from(parent.context).inflate(R.layout.item_all_corses_list,parent,false))

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {

        val l=list[position]
        holder.apply {

            tvCourseName.text=l.courseName
            llCourseList.setOnClickListener {

                onClick?.invoke(position)

            }

        }

    }

    class CoursesViewHolder(view: View):RecyclerView.ViewHolder(view){

        val llCourseList:LinearLayout=view.findViewById(R.id.llCoursesList)
        val tvCourseName:TextView=view.findViewById(R.id.tvCourseName)

    }

}