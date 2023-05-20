package hu.bme.aut.pawpals.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import hu.bme.aut.pawpals.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    companion object {
        fun newInstance() = MainFragment()
    }

    private var _binding: FragmentMainBinding? = null
    private val mainViewModel: MainViewModel by viewModels()
    private val binding get() = _binding!!

    private lateinit var mainAdapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val root: View = binding.root



        mainAdapter = MainAdapter(context!!)
        binding.rvWalks.adapter = mainAdapter
        mainViewModel.walks.observe(viewLifecycleOwner) { walks ->
            mainAdapter.submitList(walks)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}