package com.marzbani.android_hcfrc.authentication.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.marzbani.android_hcfrc.authentication.presentation.component.AuthScaffold
import com.marzbani.android_hcfrc.authentication.presentation.viewModel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment() {

    private val viewModel: AuthViewModel by viewModels()

    companion object {
        fun newInstance() = LoginFragment()
    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {
                AuthScaffold.ScaffoldExample()
            }
        }
    }

}