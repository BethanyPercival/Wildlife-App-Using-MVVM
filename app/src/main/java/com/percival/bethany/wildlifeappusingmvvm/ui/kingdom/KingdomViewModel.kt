package com.percival.bethany.wildlifeappusingmvvm.ui.kingdom

import androidx.lifecycle.ViewModel
import com.percival.bethany.wildlifeappusingmvvm.data.KingdomRepository

class KingdomViewModel(private val _kingdomRepository: KingdomRepository): ViewModel() {

    fun getKingdoms() = _kingdomRepository.getKingdoms()
}