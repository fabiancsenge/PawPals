package hu.bme.aut.pawpals.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

class DetailsViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "TODO"
    }
    val text: LiveData<String> = _text
}