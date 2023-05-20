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
    }

}

class WalksInteractor @Inject constructor(

) {

}