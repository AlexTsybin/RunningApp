package com.alextsy.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alextsy.runningapp.R
import kotlinx.android.synthetic.main.fragment_setup.*
import kotlinx.android.synthetic.main.item_run.*

class SetupFragment : Fragment(R.layout.fragment_setup) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvContinue.setOnClickListener {
            val action = SetupFragmentDirections.actionSetupFragmentToRunFragment()
            findNavController().navigate(action)
        }
    }
}