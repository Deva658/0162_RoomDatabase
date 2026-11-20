package com.example.per9.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.per9.repositori.RepositoriSiswa

class DetailViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel() {

    private val idSiswa: Int = checkNotNull(savedStateHandle[DetailSiswaDestination.itemIdArg])
    
}
