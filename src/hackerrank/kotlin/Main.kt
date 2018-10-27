package hackerrank.kotlin

import hackerrank.kotlin.Color.BLUE
import hackerrank.kotlin.Color.YELLOW
import hackerrank.kotlin.Visibility.GONE
import hackerrank.kotlin.Visibility.VISIBILE

val imePrezime = Pair<String, String>("Tino", "Balint")

fun main(args: Array<String>) {

    val (ime, prezime) = imePrezime

    "Znakovni niz".podjeliZnakovniNiz()




}

enum class Visibility {

    GONE,
    VISIBILE
}

enum class Color {

    BLUE,
    YELLOW
}

class TextView {

    fun jedi() {}
    fun spavaj() {}
}


interface Zivotinja {
    fun jedi() {
        print("Zivotinja jede")
    }

}

class ObjectGraph() {

    private fun provideDatabaseService(): DatabaseService {
        return DatabaseService()
    }

    fun provideApiService(): ApiService {
        return ApiService()
    }

    fun provideStudentBusinessLayer() =
            StudentBusinessLayer(provideApiService(), provideDatabaseService())

    fun provideProfessorBusinessLayer(apiService: ApiService) =
            ProfessorBusinessLayer(provideApiService())
}

class DatabaseService() {
}

class ApiService() {}

class StudentBusinessLayer(val service: ApiService, val databaseService: DatabaseService) {}

class ProfessorBusinessLayer(val service: ApiService) {}

val ime = "Tino"

val <T> List<T>.lastIndex: Int
    get() = size - 1

interface Sisavac {
    fun jedi() {
        print("Sisavac jede")
    }


}


class Muskarac {
    companion object {
        const val spol: String = "Muški"
        var ime: String = "Pero"

        fun jedi() {}
    }
}

fun String.podjeliZnakovniNiz() {
    this.forEach {
        println(it)
    }
}


fun nesto(arr: Array<Int>) {
    val lista = IntArray(arr.max()!!)

    arr.forEach { lista[it - 1]++ }

    //println(lista.indexOf(lista.max()!!) + 1)

}