package com.example.animalbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Лев", "вид хищных млекопитающих, один из пяти представителей рода пантер (Panthera), относящегося к подсемейству больших кошек в составе семейства кошачьих.",
                R.drawable.leo, "Численность маленькая"));
        animals.add( new Animal("Жираф", "парнокопытное млекопитающее из семейства жирафовых. Является самым высоким наземным животным планеты.",
                R.drawable.giraf, "Численность маленькая"));
        animals.add( new Animal("Гиппопотам", "Парнокопытное млекопитающее из семейства бегемотовых, единственный современный вид рода Hippopotamus. Характерной особенностью гиппопотама является его полуводный образ жизни.",
                R.drawable.gipopotam, "Численность маленькая"));
        animals.add( new Animal("Леопард", "Вид хищных млекопитающих семейства кошачьих, один из пяти представителей рода пантера, относящегося к подсемейству больших кошек.",
                R.drawable.leopard, "Численность маленькая"));
        animals.add( new Animal("Страус", "Бескилевая нелетающая птица семейства страусовых. Его научное название в переводе с греческого означает «воробей-верблюд».",
                R.drawable.straus, "Численность большая"));
    }
}