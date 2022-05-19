package com.example.text;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hello extends AppCompatActivity {

    public Animation a;
    public TextView text1;
    public Button button1;
    public int l = 0;
    Text text = new Text();
    Delay delay = new Delay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);
        TextView text8 = findViewById(R.id.text8);
        TextView text9 = findViewById(R.id.text9);
        TextView text10 = findViewById(R.id.text10);
        TextView text11 = findViewById(R.id.text11);
        TextView text12 = findViewById(R.id.text12);
        TextView text13 = findViewById(R.id.text13);
        TextView text14 = findViewById(R.id.text14);
        TextView text15 = findViewById(R.id.text15);
        TextView text16 = findViewById(R.id.text16);
        TextView text17 = findViewById(R.id.text17);
        TextView text18 = findViewById(R.id.text18);
        TextView text19 = findViewById(R.id.text19);
        TextView text20 = findViewById(R.id.text20);
        TextView text21 = findViewById(R.id.text21);
        TextView text22 = findViewById(R.id.text22);
        TextView text23 = findViewById(R.id.text23);
        TextView text24 = findViewById(R.id.text24);
        TextView text25 = findViewById(R.id.text25);
        TextView text26 = findViewById(R.id.text26);
        TextView text27 = findViewById(R.id.text27);
        TextView text28 = findViewById(R.id.text28);
        TextView text29 = findViewById(R.id.text29);
        TextView text30 = findViewById(R.id.text30);
        TextView text31 = findViewById(R.id.text31);
        TextView text32 = findViewById(R.id.text32);
        TextView text33 = findViewById(R.id.text33);
        TextView text34 = findViewById(R.id.text34);
        TextView text35 = findViewById(R.id.text35);
        TextView text36 = findViewById(R.id.text36);
        TextView text37 = findViewById(R.id.text37);
        TextView text38 = findViewById(R.id.text38);
        TextView text39 = findViewById(R.id.text39);
        TextView text40 = findViewById(R.id.text40);
        TextView text41 = findViewById(R.id.text41);
        TextView text42 = findViewById(R.id.text42);
        TextView text43 = findViewById(R.id.text43);
        TextView text44 = findViewById(R.id.text44);
        TextView text45 = findViewById(R.id.text45);
        TextView text46 = findViewById(R.id.text46);
        Button butt1 = findViewById(R.id.butt1);

        text1.setText(text.scenario[0]);
        text2.setText(text.scenario[1]);
        text3.setText(text.scenario[2]);
        text4.setText(text.scenario[3]);
        text5.setText(text.scenario[4]);
        text6.setText(text.scenario[5]);
        text7.setText(text.scenario[6]);
        text8.setText(text.scenario[7]);
        text9.setText(text.scenario[8]);
        text10.setText(text.scenario[9]);
        text11.setText(text.scenario[10]);
        text12.setText(text.scenario[11]);
        text13.setText(text.scenario[12]);
        text14.setText(text.scenario[13]);
        text15.setText(text.scenario[14]);
        text16.setText(text.scenario[15]);
        text17.setText(text.scenario[16]);
        text18.setText(text.scenario[17]);
        text19.setText(text.scenario[18]);
        text20.setText(text.scenario[19]);
        text21.setText(text.scenario[20]);
        text22.setText(text.scenario[21]);
        text23.setText(text.scenario[22]);
        text24.setText(text.scenario[23]);
        text25.setText(text.scenario[24]);
        text26.setText(text.scenario[25]);
        text27.setText(text.scenario[26]);
        text28.setText(text.scenario[27]);
        text29.setText(text.scenario[28]);
        text30.setText(text.scenario[29]);
        text31.setText(text.scenario[30]);
        text32.setText(text.scenario[31]);
        text33.setText(text.scenario[32]);
        text34.setText(text.scenario[33]);
        text35.setText(text.scenario[34]);
        text36.setText(text.scenario[35]);
        text37.setText(text.scenario[36]);
        text38.setText(text.scenario[37]);
        text39.setText(text.scenario[38]);
        text40.setText(text.scenario[39]);
        text41.setText(text.scenario[40]);
        text42.setText(text.scenario[41]);
        text43.setText(text.scenario[42]);
        text44.setText(text.scenario[43]);
        text45.setText(text.scenario[44]);
        text46.setText(text.scenario[45]);

        // Анимация

        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.INVISIBLE);
        text6.setVisibility(View.INVISIBLE);
        text7.setVisibility(View.INVISIBLE);
        text8.setVisibility(View.INVISIBLE);
        text9.setVisibility(View.INVISIBLE);
        text10.setVisibility(View.INVISIBLE);
        text11.setVisibility(View.INVISIBLE);
        text12.setVisibility(View.INVISIBLE);
        text13.setVisibility(View.INVISIBLE);
        text14.setVisibility(View.INVISIBLE);
        text15.setVisibility(View.INVISIBLE);
        text16.setVisibility(View.INVISIBLE);
        text17.setVisibility(View.INVISIBLE);
        text18.setVisibility(View.INVISIBLE);
        text19.setVisibility(View.INVISIBLE);
        text20.setVisibility(View.INVISIBLE);
        text21.setVisibility(View.INVISIBLE);
        text22.setVisibility(View.INVISIBLE);
        text23.setVisibility(View.INVISIBLE);
        text24.setVisibility(View.INVISIBLE);
        text25.setVisibility(View.INVISIBLE);
        text26.setVisibility(View.INVISIBLE);
        text27.setVisibility(View.INVISIBLE);
        text28.setVisibility(View.INVISIBLE);
        text29.setVisibility(View.INVISIBLE);
        text30.setVisibility(View.INVISIBLE);
        text31.setVisibility(View.INVISIBLE);
        text32.setVisibility(View.INVISIBLE);
        text33.setVisibility(View.INVISIBLE);
        text34.setVisibility(View.INVISIBLE);
        text35.setVisibility(View.INVISIBLE);
        text36.setVisibility(View.INVISIBLE);
        text37.setVisibility(View.INVISIBLE);
        text38.setVisibility(View.INVISIBLE);
        text39.setVisibility(View.INVISIBLE);
        text40.setVisibility(View.INVISIBLE);
        text41.setVisibility(View.INVISIBLE);
        text42.setVisibility(View.INVISIBLE);
        text43.setVisibility(View.INVISIBLE);
        text44.setVisibility(View.INVISIBLE);
        text45.setVisibility(View.INVISIBLE);
        text46.setVisibility(View.INVISIBLE);
        butt1.setVisibility(View.INVISIBLE);

        // Запуск AsyncTask
        delay.execute();

    }

    // Назад
    @Override
    public void onBackPressed() {
        delay.cancel(true);
        delay = null;
        try {
            Intent intent = new Intent(Hello.this, MainActivity.class);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }


    class Delay extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            while (l <= 48) {
                publishProgress(l++);
                try {
                    Thread.sleep(100);
                    if (isCancelled()) return null;
                } catch (Exception e) {
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            TextView text1 = findViewById(R.id.text1);
            TextView text2 = findViewById(R.id.text2);
            TextView text3 = findViewById(R.id.text3);
            TextView text4 = findViewById(R.id.text4);
            TextView text5 = findViewById(R.id.text5);
            TextView text6 = findViewById(R.id.text6);
            TextView text7 = findViewById(R.id.text7);
            TextView text8 = findViewById(R.id.text8);
            TextView text9 = findViewById(R.id.text9);
            TextView text10 = findViewById(R.id.text10);
            TextView text11 = findViewById(R.id.text11);
            TextView text12 = findViewById(R.id.text12);
            TextView text13 = findViewById(R.id.text13);
            TextView text14 = findViewById(R.id.text14);
            TextView text15 = findViewById(R.id.text15);
            TextView text16 = findViewById(R.id.text16);
            TextView text17 = findViewById(R.id.text17);
            TextView text18 = findViewById(R.id.text18);
            TextView text19 = findViewById(R.id.text19);
            TextView text20 = findViewById(R.id.text20);
            TextView text21 = findViewById(R.id.text21);
            TextView text22 = findViewById(R.id.text22);
            TextView text23 = findViewById(R.id.text23);
            TextView text24 = findViewById(R.id.text24);
            TextView text25 = findViewById(R.id.text25);
            TextView text26 = findViewById(R.id.text26);
            TextView text27 = findViewById(R.id.text27);
            TextView text28 = findViewById(R.id.text28);
            TextView text29 = findViewById(R.id.text29);
            TextView text30 = findViewById(R.id.text30);
            TextView text31 = findViewById(R.id.text31);
            TextView text32 = findViewById(R.id.text32);
            TextView text33 = findViewById(R.id.text33);
            TextView text34 = findViewById(R.id.text34);
            TextView text35 = findViewById(R.id.text35);
            TextView text36 = findViewById(R.id.text36);
            TextView text37 = findViewById(R.id.text37);
            TextView text38 = findViewById(R.id.text38);
            TextView text39 = findViewById(R.id.text39);
            TextView text40 = findViewById(R.id.text40);
            TextView text41 = findViewById(R.id.text41);
            TextView text42 = findViewById(R.id.text42);
            TextView text43 = findViewById(R.id.text43);
            TextView text44 = findViewById(R.id.text44);
            TextView text45 = findViewById(R.id.text45);
            TextView text46 = findViewById(R.id.text46);
            Button butt1 = findViewById(R.id.butt1);
            Animation a = AnimationUtils.loadAnimation(Hello.this, R.anim.alpha);

            switch (l) {
                case 1:
                    text1.setVisibility(View.VISIBLE);
                    text1.startAnimation(a);
                    break;
                case 2:
                    text2.setVisibility(View.VISIBLE);
                    text2.startAnimation(a);
                    break;
                case 3:
                    text3.setVisibility(View.VISIBLE);
                    text3.startAnimation(a);
                    break;
                case 4:
                    text4.setVisibility(View.VISIBLE);
                    text4.startAnimation(a);
                    break;
                case 5:
                    text5.setVisibility(View.VISIBLE);
                    text5.startAnimation(a);
                    break;
                case 6:
                    text6.setVisibility(View.VISIBLE);
                    text6.startAnimation(a);
                    break;
                case 7:
                    text7.setVisibility(View.VISIBLE);
                    text7.startAnimation(a);
                    break;
                case 8:
                    text8.setVisibility(View.VISIBLE);
                    text8.startAnimation(a);
                    break;
                case 9:
                    text9.setVisibility(View.VISIBLE);
                    text9.startAnimation(a);
                    break;
                case 10:
                    text10.setVisibility(View.VISIBLE);
                    text10.startAnimation(a);
                    break;
                case 11:
                    text11.setVisibility(View.VISIBLE);
                    text11.startAnimation(a);
                    break;
                case 12:
                    text12.setVisibility(View.VISIBLE);
                    text12.startAnimation(a);
                    break;
                case 13:
                    text13.setVisibility(View.VISIBLE);
                    text13.startAnimation(a);
                    break;
                case 14:
                    text14.setVisibility(View.VISIBLE);
                    text14.startAnimation(a);
                    break;
                case 15:
                    text15.setVisibility(View.VISIBLE);
                    text15.startAnimation(a);
                    break;
                case 16:
                    text16.setVisibility(View.VISIBLE);
                    text16.startAnimation(a);
                    break;
                case 17:
                    text17.setVisibility(View.VISIBLE);
                    text17.startAnimation(a);
                    break;
                case 18:
                    text18.setVisibility(View.VISIBLE);
                    text18.startAnimation(a);
                    break;
                case 19:
                    text19.setVisibility(View.VISIBLE);
                    text19.startAnimation(a);
                    break;
                case 20:
                    text20.setVisibility(View.VISIBLE);
                    text20.startAnimation(a);
                    break;
                case 21:
                    text21.setVisibility(View.VISIBLE);
                    text21.startAnimation(a);
                    break;
                case 22:
                    text22.setVisibility(View.VISIBLE);
                    text22.startAnimation(a);
                    break;
                case 23:
                    text23.setVisibility(View.VISIBLE);
                    text23.startAnimation(a);
                    break;
                case 24:
                    text24.setVisibility(View.VISIBLE);
                    text24.startAnimation(a);
                    break;
                case 25:
                    text25.setVisibility(View.VISIBLE);
                    text25.startAnimation(a);
                    break;
                case 26:
                    text26.setVisibility(View.VISIBLE);
                    text26.startAnimation(a);
                    break;
                case 27:
                    text27.setVisibility(View.VISIBLE);
                    text27.startAnimation(a);
                    break;
                case 28:
                    text28.setVisibility(View.VISIBLE);
                    text28.startAnimation(a);
                    break;
                case 29:
                    text29.setVisibility(View.VISIBLE);
                    text29.startAnimation(a);
                    break;
                case 30:
                    text30.setVisibility(View.VISIBLE);
                    text30.startAnimation(a);
                    break;
                case 31:
                    text31.setVisibility(View.VISIBLE);
                    text31.startAnimation(a);
                    break;
                case 32:
                    text32.setVisibility(View.VISIBLE);
                    text32.startAnimation(a);
                    break;
                case 33:
                    text33.setVisibility(View.VISIBLE);
                    text33.startAnimation(a);
                    break;
                case 34:
                    text34.setVisibility(View.VISIBLE);
                    text34.startAnimation(a);
                    break;
                case 35:
                    text35.setVisibility(View.VISIBLE);
                    text35.startAnimation(a);
                    break;
                case 36:
                    text36.setVisibility(View.VISIBLE);
                    text36.startAnimation(a);
                    break;
                case 37:
                    text37.setVisibility(View.VISIBLE);
                    text37.startAnimation(a);
                    break;
                case 38:
                    text38.setVisibility(View.VISIBLE);
                    text38.startAnimation(a);
                    break;
                case 39:
                    text39.setVisibility(View.VISIBLE);
                    text39.startAnimation(a);
                    break;
                case 40:
                    text40.setVisibility(View.VISIBLE);
                    text40.startAnimation(a);
                    break;
                case 41:
                    text41.setVisibility(View.VISIBLE);
                    text41.startAnimation(a);
                    break;
                case 42:
                    text42.setVisibility(View.VISIBLE);
                    text42.startAnimation(a);
                    break;
                case 43:
                    text43.setVisibility(View.VISIBLE);
                    text43.startAnimation(a);
                    break;
                case 44:
                    text44.setVisibility(View.VISIBLE);
                    text44.startAnimation(a);
                    break;
                case 46:
                    text45.setVisibility(View.VISIBLE);
                    text45.startAnimation(a);
                    break;
                case 47:
                    text46.setVisibility(View.VISIBLE);
                    text46.startAnimation(a);
                    break;
                case 48:
                    butt1.setVisibility(View.VISIBLE);
                    butt1.startAnimation(a);
                    butt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try {
                                Intent intent = new Intent(Hello.this, Story.class);
                                startActivity(intent);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    });

                default:
                    break;
            }
        }
    }
}