package com.fcemtopall.patika_yemeksepeti_final.ui.meal

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fcemtopall.patika_yemeksepeti_final.R

class MealDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = MealDetailsFragment()
    }

    private lateinit var viewModel: MealDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_meal_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MealDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}