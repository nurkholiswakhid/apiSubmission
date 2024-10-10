package com.apisubmission.ui.finished

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.apisubmission.databinding.FragmentFinishedBinding // Pastikan nama binding terimport dengan benar

class FinishedFragment : Fragment() { // Nama kelas sebaiknya dimulai dengan huruf kapital

    private var _binding: FragmentFinishedBinding? = null // Binding class yang nullable
    private val binding get() = _binding!! // Mengakses binding secara aman

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val finishedViewModel =
            ViewModelProvider(this).get(finishedViewModel::class.java) // Pastikan nama ViewModel sesuai

        _binding = FragmentFinishedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFinished // Pastikan ID cocok
        finishedViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it // Mengupdate teks dari ViewModel
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Hapus referensi binding saat view dihancurkan
    }
}
