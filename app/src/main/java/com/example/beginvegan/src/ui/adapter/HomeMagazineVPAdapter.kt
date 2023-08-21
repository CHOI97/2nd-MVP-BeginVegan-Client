package com.example.beginvegan.src.ui.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.beginvegan.src.data.model.magazine.Magazine
import com.example.beginvegan.src.ui.view.mainhome.HomeMagazineVeganDefineFragment
import com.example.beginvegan.src.ui.view.mainhome.HomeMagazineVeganTypesFragment
import com.example.beginvegan.src.ui.view.mainhome.MainHomeFragment

class HomeMagazineVPAdapter(mainHomeFragment: MainHomeFragment,magazineList:List<Magazine>): FragmentStateAdapter(mainHomeFragment) {

    private val fragmentList = listOf<Fragment>(
        HomeMagazineVeganDefineFragment(magazineList[0]),
        HomeMagazineVeganTypesFragment(magazineList[1])
    )

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}