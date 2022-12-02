package info.holliebaker.labels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import info.holliebaker.labels.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.buttonAdd.setOnClickListener { onClickAdd() }
    }
    
    public fun onClickAdd() {
        val context = binding.buttonAdd.context
        val intent = Intent(context, AddLabelActivity::class.java)
 
         context.startActivity(intent)
    }
}
