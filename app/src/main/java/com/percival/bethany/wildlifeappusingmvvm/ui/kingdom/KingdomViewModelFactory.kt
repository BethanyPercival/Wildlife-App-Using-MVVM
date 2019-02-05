package com.percival.bethany.wildlif
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.percival.bethany.wildlifeappusingmvvm.data.KingdomRepository
import com.percival.bethany.wildlifeappusingmvvm.ui.kingdom.KingdomViewModel

class KingdomViewModelFactory(private val _kingdomRepository: KingdomRepository): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        return KingdomViewModel(_kingdomRepository) as T
    }
}