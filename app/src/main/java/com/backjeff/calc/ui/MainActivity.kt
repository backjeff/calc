package com.backjeff.calc.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import com.backjeff.calc.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(), LifecycleOwner {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
        addObservables()
    }

    private fun addObservables() {
        with(viewModel) {
            result.observe(
                this@MainActivity,
                { result ->
                    if (result != null) {
                        binding.result.text = "$result"
                    }
                }
            )
        }
    }

    private fun setupViews() {
        binding.apply {
            buttonSum.setOnClickListener {
                viewModel.sum(
                    a = a.text.toString(),
                    b = b.text.toString()
                )
            }

            buttonSubtract.setOnClickListener {
                viewModel.subtract(
                    a = a.text.toString(),
                    b = b.text.toString()
                )
            }

            buttonMultiply.setOnClickListener {
                viewModel.multiply(
                    a = a.text.toString(),
                    b = b.text.toString()
                )
            }

            buttonDivide.setOnClickListener {
                viewModel.divide(
                    a = a.text.toString(),
                    b = b.text.toString()
                )
            }
        }
    }
}
