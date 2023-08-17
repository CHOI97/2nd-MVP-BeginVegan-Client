package com.example.beginvegan.src.ui.view.mainhome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beginvegan.R
import com.example.beginvegan.config.BaseFragment
import com.example.beginvegan.databinding.FragmentHomeMagazineVeganDefineBinding
import com.example.beginvegan.databinding.FragmentMainHomeBinding

class HomeMagazineVeganDefineFragment : BaseFragment<FragmentHomeMagazineVeganDefineBinding>(
    FragmentHomeMagazineVeganDefineBinding::bind,R.layout.fragment_home_magazine_vegan_define ) {

    override fun init() {
        binding.btnMagazineDefine.setOnClickListener {
            val homeFragment = parentFragment as MainHomeFragment
            homeFragment.onDialogBtnClicked()
        }
    }

}