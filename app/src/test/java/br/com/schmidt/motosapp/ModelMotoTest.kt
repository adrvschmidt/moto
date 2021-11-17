package br.com.schmidt.motosapp

import android.R.attr
import org.junit.Test

import org.junit.Assert.*
import java.io.*
import java.lang.StringBuilder

import android.R.attr.classLoader
import br.com.schmidt.motosapp.models.Moto
import com.google.gson.Gson


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ModelMotoTest {

   // val ASSET_BASE_PATH = "../app/src/main/assets/"
    val JSON_MOTO = "{\"boolean\":true,\"model\":\"GS\",\"brand\":\"BMW\",\"year\":2021,\"motor\"" +
           ":{\"torque\":\"url1\",\"power\":\"url2\",\"cilindradas\":\"url3\",\"tipo\":\"extras\"," +
           "\"quant_oleo\":\"url1\",\"transmissao\":\"url2\",\"combustivel\":\"url3\",\"compressao\"" +
           ":\"extras\"},\"extras\":{\"extra1\":\"url1\",\"extra2\":\"url2\"},\"dimensoes\":" +
           "{\"comprimento\":\"url1\",\"largura\":\"url2\",\"altura\":\"url3\",\"altura_solo\":" +
           "\"extras\",\"altura_assento\":\"url1\",\"peso\":\"url2\"},\"pneus\":{\"medida_dianteiro\":" +
           "\"url1\",\"medida_traseiro\":\"url2\"},\"firstImage\":\"url1\",\"secondImage\":\"url2\"," +
           "\"thirdImage\":\"url3\",\"capacidade_tanque\":\"17L\"}"

    @Test
    fun addition_isCorrect() {
       // val classLoader: ClassLoader = obj.getClass().getClassLoader()
      //  val teste = readJsonFile(classLoader.getResource("test.json"))
      //  val inputStream: InputStream = javaClass.classLoader.getResourceAsStream("moto_test.json")
        val teste = Gson().fromJson(JSON_MOTO, Moto::class.java)
        println(teste)
      //  println(teste.pneus.hasCamera)
      //  println(teste.extras.extra1)
      //  println(teste.extras.extra3)
     //   val teste2 = readJsonFile(inputStream.toString())
        assertEquals(4, 2 + 2)
    }

    @Throws(IOException::class)
    fun readJsonFile(filename: String): String? {
        val br =
            BufferedReader(InputStreamReader(FileInputStream(filename)))
        val sb = StringBuilder()
        var line: String = br.readLine()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
            print(line)
        }
        return sb.toString()
    }
}