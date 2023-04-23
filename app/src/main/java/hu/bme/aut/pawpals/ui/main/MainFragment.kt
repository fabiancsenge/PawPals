package hu.bme.aut.pawpals.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val detailsViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}