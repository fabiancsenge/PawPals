package hu.bme.aut.pawpals.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.bme.aut.pawpals.persistence.Walk
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val interactor: WalksInteractor) : ViewModel() {
    val walks: MutableLiveData<List<Walk>> by lazy {
        MutableLiveData<List<Walk>>().also {
            loadWalks()
        }
    }

    fun loadWalks() {
        viewModelScope.launch {
        }
        val exampleWalks = listOf(
            Walk(1000, "https:\\/\\/images.dog.ceo\\/breeds\\/finnish-lapphund\\/mochilamvan.jpg", "Mankey", "Budapest, Dobos lakótelep 9", "2023-05-22", "18:00", "5.3", "Bence Fülöp", "+3838546804336")
        )
        walks.value = exampleWalks
    }

}

class WalksInteractor @Inject constructor() {

}