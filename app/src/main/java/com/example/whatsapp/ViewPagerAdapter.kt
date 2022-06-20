package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fraManager:FragmentManager):FragmentPagerAdapter(fraManager) {

    var fragments = ArrayList<Fragment>()
    var tabTitles = ArrayList<String>()

    fun add_fragment1(fragment: ChatsFragment){
        this.fragments.add(fragment)
        this.tabTitles.add("CHATS")
    }

        fun add_fragment2(fragment: StatusFragment){
            this.fragments.add(fragment)
            this.tabTitles.add("STATUS")
        }

            fun add_fragment3(fragment: CallsFragment){
                this.fragments.add(fragment)
                this.tabTitles.add("CALLS")
            }


    override fun getCount(): Int {
        return this.fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return this.fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return this.tabTitles[position]
    }


}

