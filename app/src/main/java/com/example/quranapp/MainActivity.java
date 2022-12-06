package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewDebug;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lw;
        TextView tw;
        String[] englishSurahNames = {
                "Al-Fatihah",
                "Al-Baqara ",
                "Al-i'Imran ",
                "An-Nisaa ",
                "Al-Maidah ",
                "Al-An'am ",
                "Al-A'raf ",
                "Al-Anfal ",
                "At-Tauba ",
                "Yunus ",
                "Hud ",
                "Yusuf ",
                "Ar-Ra'd ",
                "Ibrahim ",
                "Al-Hijr ",
                "An-Nahl ",
                "Al-Israa ",
                "Al-Kahf ",
                "Maryam ",
                "Ta-ha ",
                "Al-Anbiyaa ",
                "Al-Hajj ",
                "Al-Muminun ",
                "An-Nur ",
                "Al-Furqan ",
                "Ash-Shu'araa ",
                "An-Naml ",
                "Al-Qasas ",
                "Al-Ankabut ",
                "Ar-Rum ",
                "Luqman ",
                "As-Sajda ",
                "Al-Ahzab ",
                "Saba ",
                "Fatir ",
                "Ya-Sin ",
                "As-Saffat ",
                "Sad ",
                "Az-Zumar ",
                "Al-Mu'min ",
                "Ha-Mim ",
                "Ash-Shura ",
                "Az-Zukhruf ",
                "Ad-Dukhan ",
                "Al-Jathiya ",
                "Al-Ahqaf ",
                "Muhammad ",
                "Al-Fat-h ",
                "Al-Hujurat ",
                "Qaf ",
                "Az-Zariyat ",
                "At-Tur ",
                "An-Najm ",
                "Al-Qamar ",
                "Ar-Rahman ",
                "Al-Waqi'a ",
                "Al-Hadid ",
                "Al-Mujadila ",
                "Al-Hashr ",
                "Al-Mumtahana ",
                "As-Saff ",
                "Al-Jumu'a ",
                "Al-Munafiqun ",
                "At-Tagabun ",
                "At-Talaq ",
                "At-Tahrim ",
                "Al-Mulk ",
                "Al-Qalam ",
                "Al-Haqqa ",
                "Al-Ma'arij ",
                "Nuh ",
                "Al-Jinn ",
                "Al-Muzzammil ",
                "Al-Muddathth ",
                "Al-Qiyamat ",
                "Ad-Dahr ",
                "Al-Mursalat ",
                "An-Nabaa ",
                "An-Nazi'at ",
                "Abasa ",
                "At-Takwir ",
                "Al-Infitar ",
                "Al-Mutaffife ",
                "Al-Inshiqaq ",
                "Al-Buruj ",
                "At-Tariq ",
                "Al-A'la ",
                "Al-Gashiya ",
                "Al-Fajr ",
                "Al-Balad ",
                "Ash-Shams ",
                "Al-Lail ",
                "Adh-Dhuha ",
                "Al-Sharh ",
                "At-Tin ",
                "Al-Alaq ",
                "Al-Qadr ",
                "Al-Baiyina ",
                "Al-Zalzalah ",
                "Al-Adiyat ",
                "Al-Qari'a ",
                "At-Takathur ",
                "Al-Asr ",
                "Al-Humaza ",
                "Al-Fil ",
                "Quraish ",
                "Al-Ma'un ",
                "Al-Kauthar ",
                "Al-Kafirun ",
                "An-Nasr ",
                "Al-Lahab ",
                "Al-Ikhlas ",
                "Al-Falaq ",
                "Al-Nas ",
        };
        //int y=1;
        String[] englishSurahNamesWithIndexes= new String[englishSurahNames.length];
        for (int i=0; i< englishSurahNames.length;i++){
           String y = Integer.toString(i+1);

             englishSurahNamesWithIndexes[i]= y + " " + " "+englishSurahNames[i] ;
             //y++;

        }


        lw= findViewById(R.id.SuratNamesListView);

        ArrayList<String> arrli = new ArrayList<>(Arrays.asList(englishSurahNamesWithIndexes));
            //arrli  = Arrays.asList(englishSurahNames);
        ArrayAdapter<String> arradp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrli);
        lw.setAdapter(arradp);



    }
}