package com.fcemtopall.patika_yemeksepeti_final.ui.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.auth0.android.jwt.JWT
import com.fcemtopall.patika_yemeksepeti_final.R
import com.fcemtopall.patika_yemeksepeti_final.databinding.FragmentSplashBinding
import com.fcemtopall.patika_yemeksepeti_final.models.local.SharedPrefManager
import com.fcemtopall.patika_yemeksepeti_final.ui.MainActivity

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        val view = binding.root
        init()
        return view
    }

    private fun init() {
        binding.splashAnimation.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                val token = getToken()

                if (!isOnboardingSeen()) {
                    findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
                } else {
                    if (token.isNullOrEmpty()) {
                        findNavController().navigate(R.id.action_splashFragment_to_loginAndRegisterFragment)
                    } else {
                        val jwt = JWT(token)

                        if (jwt.isExpired(0)) {
                            findNavController().navigate(R.id.action_splashFragment_to_loginAndRegisterFragment)
                        } else {
                            val intent = Intent(context, MainActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()

                        }
                    }
                }


            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }

        })
    }

    private fun getToken(): String? {
        return SharedPrefManager(requireContext()).getToken()
    }

    private fun isOnboardingSeen(): Boolean {
        return SharedPrefManager(requireContext()).isOnboardingSeen()
    }
}