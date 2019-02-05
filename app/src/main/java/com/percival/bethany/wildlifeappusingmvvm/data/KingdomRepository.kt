package com.percival.bethany.wildlifeappusingmvvm.data

class KingdomRepository private constructor(private val _kingdomDao: FakeKingdomDao) {

    fun getKingdoms() = _kingdomDao.getKingdoms()

    companion object {
        @Volatile
        private var instance: KingdomRepository? = null

        fun getInstance(kingdomDao: FakeKingdomDao) =
            instance ?: synchronized(this) {
                instance ?: KingdomRepository(kingdomDao).also { instance = it }
            }
    }
}
