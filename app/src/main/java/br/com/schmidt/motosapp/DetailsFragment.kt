package br.com.schmidt.motosapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.schmidt.motosapp.databinding.DetailsFragmentBinding
import com.bumptech.glide.Glide

class DetailsFragment : Fragment() {

    private val viewModel: DetailsViewModel by viewModels()
    private var _binding: DetailsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Adriano", "Chegou aqui")
        val layoutManager = LinearLayoutManager(requireActivity())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.recyclerview.layoutManager = layoutManager
        viewModel.getImages().observe(viewLifecycleOwner, {
            Log.d("Adriano", "Entrou aqui: ${it.size}")
            binding.recyclerview.adapter = ImageAdapter(it)
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}