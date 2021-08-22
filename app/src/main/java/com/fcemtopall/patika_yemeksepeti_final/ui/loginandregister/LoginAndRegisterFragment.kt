package com.fcemtopall.patika_yemeksepeti_final.ui.loginandregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fcemtopall.patika_yemeksepeti_final.databinding.FragmentLoginAndRegisterBinding

class LoginAndRegisterFragment : Fragment() {
    private lateinit var binding: FragmentLoginAndRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginAndRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        val adapter = CustomViewPager(childFragmentManager)
        adapter.addFragment(LoginFragment(), "Login")
        adapter.addFragment(SignupFragment(), "Sign-up")
        binding.loginAndSignupViewPager.adapter = adapter
        binding.loginAndSignupTabLayout.setupWithViewPager(binding.loginAndSignupViewPager)
    }

}