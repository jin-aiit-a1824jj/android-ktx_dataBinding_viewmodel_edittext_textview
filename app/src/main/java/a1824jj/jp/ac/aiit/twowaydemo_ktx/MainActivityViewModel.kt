package a1824jj.jp.ac.aiit.twowaydemo_ktx

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(), Observable {

    @Bindable
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Frank"
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        //@Bindable build error fix
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        //@Bindable build error fix
    }

}