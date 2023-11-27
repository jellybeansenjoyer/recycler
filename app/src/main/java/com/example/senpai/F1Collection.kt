package com.example.senpai

class F1Collection {
    fun createF1Collection():List<DataF1>{
        val drivers=listOf<DataF1>(
            DataF1("Max Verstappen","Red Bull",R.drawable.ver),
            DataF1("Sergio Perez", "Red Bull",R.drawable.per),
            DataF1("Alex Albon","Williams",R.drawable.alb),
            DataF1("Logan Sargeant", "Williams",R.drawable.log),
            DataF1("Lewis Hamilton","Mercedes",R.drawable.ham),
            DataF1("George Russel","Mercedes",R.drawable.rus),
            DataF1("Lando Norris","McLaren",R.drawable.nor),
            DataF1("Oscar Piastri","McLaren",R.drawable.pia),
            DataF1("Nico Hulkenberg","Haas",R.drawable.hul),
            DataF1("Kevin Magnussen","Haas",R.drawable.mag),
            DataF1("Charles Leclerc","Ferrari",R.drawable.lec),
            DataF1("Carlos Sainz","Ferrari",R.drawable.car),
            DataF1("Fernando Alonso","Aston Martin",R.drawable.alo),
            DataF1("Lance Stroll","Aston Martin",R.drawable.str),
            DataF1("Esteban Ocon","Alpine",R.drawable.est),
            DataF1("Pierre Gasley","Alpine",R.drawable.gas),
            DataF1("Yuki Tsunoda","AlphaTauri",R.drawable.tsu),
            DataF1("Daniel Ricciardo","AlphaTauri",R.drawable.ric),
            DataF1("Valtteri Bottas","Alfa Romeo",R.drawable.bot),
            DataF1("Guanyu Zhou","Alfa Romeo",R.drawable.gua),

            )
      return drivers.shuffled()
    }
}