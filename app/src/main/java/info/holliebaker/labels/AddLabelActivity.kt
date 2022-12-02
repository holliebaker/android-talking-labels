package info.holliebaker.labels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import info.holliebaker.labels.databinding.ActivityAddLabelBinding

class AddLabelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddLabelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddLabelBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
