package com.fcemtopall.patika_yemeksepeti_final.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.fcemtopall.patika_yemeksepeti_final.R
import com.fcemtopall.patika_yemeksepeti_final.databinding.FragmentOnboardingBinding
import com.fcemtopall.patika_yemeksepeti_final.models.local.SharedPrefManager

class OnboardingFragment : Fragment() {
    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.onboardingViewPager.adapter = adapter
        binding.onboardingViewPager.setPageTransformer(DepthTransformation())
        binding.dotsIndicator.setViewPager2(binding.onboardingViewPager)

        binding.onboardingViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 0) {
                    binding.prevButton.visibility = View.GONE
                    binding.nextButton.setOnClickListener {
                        binding.onboardingViewPager.currentItem =
                            binding.onboardingViewPager.currentItem + 1
                    }
                } else if (position == 2) {
                    binding.prevButton.visibility = View.VISIBLE
                    binding.nextButton.text = resources.getText(R.string.finish)
                    binding.nextButton.setOnClickListener {
                        SharedPrefManager(requireContext()).setOnboardingSeen()
                        findNavController().navigate(R.id.action_onboardingFragment_to_loginAndRegisterFragment)

                    }
                } else {
                    binding.prevButton.visibility = View.VISIBLE
                    binding.nextButton.text = resources.getText(R.string.next)
                    binding.nextButton.setOnClickListener {
                        binding.onboardingViewPager.currentItem =
                            binding.onboardingViewPager.currentItem + 1
                    }
                    binding.prevButton.setOnClickListener {
                        binding.onboardingViewPager.currentItem =
                            binding.onboardingViewPager.currentItem - 1
                    }
                }
            }
        })

    }
}


