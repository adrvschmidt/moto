package br.com.schmidt.motosapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {
    private val arrayOfImages: MutableLiveData<List<String>> = MutableLiveData()

    fun getImages(): LiveData<List<String>> {
        return arrayOfImages
    }

    init {
        Thread.sleep(1000)
        loadImages()
    }

    private fun loadImages() {
        val list: List<String> = arrayListOf("https://www.google.com/imgres?imgurl=https%3A%2F%2" +
                "Fmotonewsbrasil.com%2Fwp-content%2Fuploads%2F2021%2F10%2F2022-triumph-tiger-sport-" +
                "660-8-800x445.jpg&imgrefurl=https%3A%2F%2Fmotonewsbrasil.com%2Ftriumph-lanca-tiger-" +
                "sport-660-aventureira-esportiva-de-media-cilindrada%2F&tbnid=8rgMQRReTNqnfM&vet=12a" +
                "hUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygAegUIARCIAQ..i&docid=XSkEbVx7l0uTdM&w=800&h=445&it" +
                "g=1&q=triumph%20sport%20660&ved=2ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygAegUIARCIAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmotorshow.com.br%2Fwp-content%2Fuplo" +
                    "ads%2Fsites%2F2%2F2021%2F10%2Ftiger-sport-660-0o6a3434-pb-e1633448139993.jpg&i" +
                    "mgrefurl=https%3A%2F%2Fmotorshow.com.br%2Ftriumph-apresenta-nova-tiger-sport-6" +
                    "60-assista%2F&tbnid=Czig8uMu6wyi6M&vet=12ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygEe" +
                    "gUIARCQAQ..i&docid=1leFBMPoiC8ZlM&w=500&h=333&itg=1&q=triumph%20sport%20660&ve" +
                    "d=2ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygEegUIARCQAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.motociclismoonline.com.br%2Fu" +
                    "ploads%2F2021%2F10%2FTiger_Sport_660__0O6A2177_2_0_PB.jpg&imgrefurl=https%3A%2" +
                    "F%2Fwww.motociclismoonline.com.br%2Fnoticias%2Ftriumph-lanca-tiger-sport-660-" +
                    "e-entra-em-novo-segmento%2F&tbnid=WxTHIDr2W4n8SM&vet=12ahUKEwicxqKB_5_0AhWUNbkGH" +
                    "VwED7UQMygJegUIARCaAQ..i&docid=0RomfClFDdDS8M&w=1024&h=683&itg=1&q=triumph%20spo" +
                    "rt%20660&ved=2ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygJegUIARCaAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FchxUeXrz2Xo%2Fm" +
                    "axresdefault.jpg&imgrefurl=https%3A%2F%2Fmobilidade.estadao.com.br%2Fmeios-de-" +
                    "transporte%2Ftriumph-mostra-nova-tiger-sport-660-aventureira-esportiva-de-tres-" +
                    "cilindros%2F&tbnid=AsrNfl49pv02dM&vet=12ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygNegU" +
                    "IARCiAQ..i&docid=OwePZtfA7euPSM&w=1280&h=720&itg=1&q=triumph%20sport%20660&ved=" +
                    "2ahUKEwicxqKB_5_0AhWUNbkGHVwED7UQMygNegUIARCiAQ")
      //  arrayOfImages.postValue(list)
      //  arrayOfImages.postValue(list)
        Log.d("Adriano", "Teste 1")
        arrayOfImages.postValue(list)
    }
}