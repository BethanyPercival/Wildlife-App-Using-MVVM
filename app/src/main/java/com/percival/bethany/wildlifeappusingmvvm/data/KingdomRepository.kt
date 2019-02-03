package com.percival.bethany.wildlifeappusingmvvm.data

class KingdomRepository private constructor(private val kingdomDao: FakeKingdomDao) {

    //This method would usually update and check the backend
    fun addKingdom(kingdom: Kingdom) {
        kingdomDao.addKingdom(kingdom)
    }

    fun getKingdoms() = kingdomDao.getKingdoms()

    companion object {
        @Volatile
        private var instance: KingdomRepository? = null

        fun getInstance(kingdomDao: FakeKingdomDao) =
            instance ?: synchronized(this) {
                instance ?: KingdomRepository(kingdomDao).also { instance = it }
            }
    }
}
