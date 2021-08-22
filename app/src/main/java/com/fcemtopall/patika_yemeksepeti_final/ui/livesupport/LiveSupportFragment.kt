package com.fcemtopall.patika_yemeksepeti_final.ui.livesupport

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fcemtopall.patika_yemeksepeti_final.R

class LiveSupportFragment : Fragment() {

    companion object {
        fun newInstance() = LiveSupportFragment()
    }

    private lateinit var viewModel: LiveSupportViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_live_support, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LiveSupportViewModel::class.java)
        // TODO: Use the ViewModel
    }

}