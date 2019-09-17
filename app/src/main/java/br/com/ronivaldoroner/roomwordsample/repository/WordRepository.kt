package br.com.ronivaldoroner.roomwordsample.repository

import androidx.lifecycle.LiveData
import br.com.ronivaldoroner.roomwordsample.dao.WordDao
import br.com.ronivaldoroner.roomwordsample.entities.Word

class WordRepository(private val wordDao: WordDao){

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}