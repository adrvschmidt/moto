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
import androidx.recyclerview.widget.PagerSnapHelper
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
        binding.shimmerViewContainer.startShimmer()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Adriano", "Chegou aqui")
        val layoutManager = LinearLayoutManager(requireActivity())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val snapHelper = PagerSnapHelper()
        binding.recyclerview.layoutManager = layoutManager
        snapHelper.attachToRecyclerView(binding.recyclerview)
        viewModel.getImages().observe(viewLifecycleOwner, {
            Log.d("Adriano", "Entrou aqui: ${it.size}")
            binding.recyclerview.adapter = ImageAdapter(it)
            binding.recyclerview.addItemDecoration(LinePagerIndicatorDecoration())
            binding.shimmerViewContainer.stopShimmer()
            binding.shimmerViewContainer.visibility = View.GONE
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}