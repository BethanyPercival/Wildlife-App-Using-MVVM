package com.percival.bethany.wildlifeappusingmvvm.data

class FakeDatabase private constructor() {
    var kingdomDao = FakeKingdomDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}