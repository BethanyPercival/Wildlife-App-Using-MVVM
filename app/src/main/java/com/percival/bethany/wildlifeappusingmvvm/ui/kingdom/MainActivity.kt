package com.percival.bethany.wildlifeappusingmvvm.ui.kingdom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.percival.bethany.wildlifeappusingmvvm.R
import com.percival.bethany.wildlifeappusingmvvm.utils.InjectorUtils

class MainActivity : AppCompatActivity(), LifecycleOwner {
    private val _recyclerAdapter: KingdomRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialiseUi()
    }

    private fun initialiseUi() {
        val factory = InjectorUtils.provideKingdomsViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(KingdomViewModel::class.java)
        viewModel.getKingdoms().observe(this, Observer { kingdoms ->

        })
    }
}
