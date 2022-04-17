package com.thun.infocovidindonesia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.thun.infocovidindonesia.databinding.FragmentHomeBinding
import java.text.NumberFormat

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeViewModel.covidData.observe(viewLifecycleOwner) {
            binding.curredCount.text = getFormattedNumber(it.update?.total?.jumlahSembuh!!.toInt())
            binding.deathCount.text =
                getFormattedNumber(it.update?.total?.jumlahMeninggal!!.toInt())
            binding.infectedCount.text =
                getFormattedNumber(it.update?.total?.jumlahPositif!!.toInt())
        }
        return root
    }

    private fun getFormattedNumber(number: Int): String =
        NumberFormat.getInstance().format(number).toString()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}