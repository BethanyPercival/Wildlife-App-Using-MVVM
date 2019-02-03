package com.percival.bethany.wildlifeappusingmvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeKingdomDao {
    private val kingdomList = mutableListOf<Kingdom>()
    private val kingdoms = MutableLiveData<List<Kingdom>>()

    init {
        kingdoms.value = kingdomList
    }

    fun addKingdom(kingdom: Kingdom) {
        kingdomList.add(kingdom)
        kingdoms.value = kingdomList
    }

    fun getKingdoms() = kingdoms as LiveData<List<Kingdom>>
}