package com.percival.bethany.wildlifeappusingmvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeKingdomDao {
    private val _kingdomList = mutableListOf<Kingdom>()
    private val _kingdoms = MutableLiveData<List<Kingdom>>()

    init {
        _kingdoms.value = _kingdomList
    }

    fun getKingdoms() = _kingdoms as LiveData<List<Kingdom>>
}