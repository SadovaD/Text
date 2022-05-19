package com.example.text;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Story extends AppCompatActivity {
    public Animation a;
    public int l = 0;
    public int c = 0;
    public int d = 0;
    public int s = 0;
    public int f = 0;
    public int y = 0;
    public int j = 0;
    public int u = 0;
    public int k = 0;
    public int i = 0;
    Text1 text = new Text1();
    Text1.Text2 t = new Text1.Text2();
    Text3 tt = new Text3();
    Text3.Text4 ttx = new Text3.Text4();
    Text5 ttr = new Text5();
    Story.Delay delay = new Delay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story);
        //Глава 1
        TextView text0 = findViewById(R.id.text0);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        Button button3 = findViewById(R.id.button3);
        Button button2 = findViewById(R.id.button2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);
        Button button5 = findViewById(R.id.button5);
        Button button4 = findViewById(R.id.button4);
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
        Button button7 = findViewById(R.id.button7);
        Button button6 = findViewById(R.id.button6);
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
        //Глава 2
        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);
        TextView t3 = findViewById(R.id.t3);
        TextView t4 = findViewById(R.id.t4);
        TextView t5 = findViewById(R.id.t5);
        TextView t6 = findViewById(R.id.t6);
        TextView t7 = findViewById(R.id.t7);
        TextView t8 = findViewById(R.id.t8);
        TextView t9 = findViewById(R.id.t9);
        TextView t10 = findViewById(R.id.t10);
        TextView t11 = findViewById(R.id.t11);
        TextView t12 = findViewById(R.id.t12);
        TextView t13 = findViewById(R.id.t13);
        TextView t14 = findViewById(R.id.t14);
        TextView t15 = findViewById(R.id.t15);
        TextView t16 = findViewById(R.id.t16);
        TextView t17 = findViewById(R.id.t17);
        TextView t18 = findViewById(R.id.t18);
        TextView t19 = findViewById(R.id.t19);
        TextView t20 = findViewById(R.id.t20);
        TextView t21 = findViewById(R.id.t21);
        TextView t22 = findViewById(R.id.t22);
        TextView t23 = findViewById(R.id.t23);
        TextView t24 = findViewById(R.id.t24);
        TextView t25 = findViewById(R.id.t25);
        TextView t26 = findViewById(R.id.t26);
        TextView t27 = findViewById(R.id.t27);
        TextView t28 = findViewById(R.id.t28);
        TextView t29 = findViewById(R.id.t29);
        TextView t30 = findViewById(R.id.t30);
        TextView t31 = findViewById(R.id.t31);
        TextView t32 = findViewById(R.id.t32);
        TextView t33 = findViewById(R.id.t33);
        TextView t34 = findViewById(R.id.t34);
        TextView t35 = findViewById(R.id.t35);
        TextView t36 = findViewById(R.id.t36);
        TextView t37 = findViewById(R.id.t37);
        TextView t38 = findViewById(R.id.t38);
        TextView t39 = findViewById(R.id.t39);
        TextView t40 = findViewById(R.id.t40);
        TextView t41 = findViewById(R.id.t41);
        TextView t42 = findViewById(R.id.t42);
        TextView t43 = findViewById(R.id.t43);
        TextView t44 = findViewById(R.id.t44);
        TextView t45 = findViewById(R.id.t45);
        TextView t46 = findViewById(R.id.t46);
        //Глава 3
        TextView tt1 = findViewById(R.id.tt1);
        TextView tt2 = findViewById(R.id.tt2);
        TextView tt3 = findViewById(R.id.tt3);
        TextView tt4 = findViewById(R.id.tt4);
        TextView tt5 = findViewById(R.id.tt5);
        TextView tt6 = findViewById(R.id.tt6);
        TextView tt7 = findViewById(R.id.tt7);
        TextView tt8 = findViewById(R.id.tt8);
        TextView tt9 = findViewById(R.id.tt9);
        TextView tt10 = findViewById(R.id.tt10);
        TextView tt11 = findViewById(R.id.tt11);
        TextView tt12 = findViewById(R.id.tt12);
        TextView tt13 = findViewById(R.id.tt13);
        TextView tt14 = findViewById(R.id.tt14);
        TextView tt15 = findViewById(R.id.tt15);
        TextView tt16 = findViewById(R.id.tt16);
        TextView tt17 = findViewById(R.id.tt17);
        TextView tt18 = findViewById(R.id.tt18);
        TextView tt19 = findViewById(R.id.tt19);
        TextView tt20 = findViewById(R.id.tt20);
        TextView tt21 = findViewById(R.id.tt21);
        TextView tt22 = findViewById(R.id.tt22);
        TextView tt23 = findViewById(R.id.tt23);
        TextView tt24 = findViewById(R.id.tt24);
        TextView tt25 = findViewById(R.id.tt25);
        TextView tt26 = findViewById(R.id.tt26);
        TextView tt27 = findViewById(R.id.tt27);
        TextView tt28 = findViewById(R.id.tt28);
        TextView tt29 = findViewById(R.id.tt29);
        TextView tt30 = findViewById(R.id.tt30);
        TextView tt31 = findViewById(R.id.tt31);
        TextView tt32 = findViewById(R.id.tt32);
        TextView tt33 = findViewById(R.id.tt33);
        TextView tt34 = findViewById(R.id.tt34);
        TextView tt35 = findViewById(R.id.tt35);
        TextView tt36 = findViewById(R.id.tt36);
        TextView tt37 = findViewById(R.id.tt37);
        TextView tt38 = findViewById(R.id.tt38);
        TextView tt39 = findViewById(R.id.tt39);
        TextView tt40 = findViewById(R.id.tt40);
        TextView tt41 = findViewById(R.id.tt41);
        TextView tt42 = findViewById(R.id.tt42);
        TextView tt43 = findViewById(R.id.tt43);
        TextView tt44 = findViewById(R.id.tt44);
        TextView tt45 = findViewById(R.id.tt45);
        TextView tt46 = findViewById(R.id.tt46);
        TextView tt47 = findViewById(R.id.tt47);
        TextView tt48 = findViewById(R.id.tt48);
        TextView tt49 = findViewById(R.id.tt49);
        TextView tt50 = findViewById(R.id.tt50);
        TextView tt51 = findViewById(R.id.tt51);
        TextView tt52 = findViewById(R.id.tt52);
        TextView tt53 = findViewById(R.id.tt53);
        TextView tt54 = findViewById(R.id.tt54);
        TextView tt55 = findViewById(R.id.tt55);
        TextView tt56 = findViewById(R.id.tt56);
        TextView tt57 = findViewById(R.id.tt57);
        TextView tt58 = findViewById(R.id.tt58);
        TextView tt59 = findViewById(R.id.tt59);
        // Глава 4
        TextView ttx1 = findViewById(R.id.ttx1);
        TextView ttx2 = findViewById(R.id.ttx2);
        TextView ttx3 = findViewById(R.id.ttx3);
        TextView ttx4 = findViewById(R.id.ttx4);
        Button button9 = findViewById(R.id.button9);
        Button button8 = findViewById(R.id.button8);
        TextView ttx5 = findViewById(R.id.ttx5);
        TextView ttx6 = findViewById(R.id.ttx6);
        TextView ttx7 = findViewById(R.id.ttx7);
        TextView ttx8 = findViewById(R.id.ttx8);
        TextView ttx9 = findViewById(R.id.ttx9);
        TextView ttx10 = findViewById(R.id.ttx10);
        Button button12 = findViewById(R.id.button12);
        Button button11 = findViewById(R.id.button11);
        Button button10 = findViewById(R.id.button10);
        TextView ttx11 = findViewById(R.id.ttx11);
        TextView ttx12 = findViewById(R.id.ttx12);
        TextView ttx13 = findViewById(R.id.ttx13);
        TextView ttx14 = findViewById(R.id.ttx14);
        Button button15 = findViewById(R.id.button15);
        Button button14 = findViewById(R.id.button14);
        Button button13 = findViewById(R.id.button13);
        TextView ttx15 = findViewById(R.id.ttx15);
        TextView ttx16 = findViewById(R.id.ttx16);
        TextView ttx17 = findViewById(R.id.ttx17);
        TextView ttx18 = findViewById(R.id.ttx18);
        Button button18 = findViewById(R.id.button18);
        Button button17 = findViewById(R.id.button17);
        Button button16 = findViewById(R.id.button16);
        TextView ttx19 = findViewById(R.id.ttx19);
        TextView ttx20 = findViewById(R.id.ttx20);
        TextView ttx21 = findViewById(R.id.ttx21);
        TextView ttx22 = findViewById(R.id.ttx22);
        TextView ttx23 = findViewById(R.id.ttx23);
        TextView ttx24 = findViewById(R.id.ttx24);
        TextView ttx25 = findViewById(R.id.ttx25);
        TextView ttx26 = findViewById(R.id.ttx26);
        TextView ttx27 = findViewById(R.id.ttx27);
        TextView ttx28 = findViewById(R.id.ttx28);
        TextView ttx29 = findViewById(R.id.ttx29);
        TextView ttx30 = findViewById(R.id.ttx30);
        TextView ttx31 = findViewById(R.id.ttx31);
        TextView ttx32 = findViewById(R.id.ttx32);
        TextView ttx33 = findViewById(R.id.ttx33);
        TextView ttx34 = findViewById(R.id.ttx34);
        TextView ttx35 = findViewById(R.id.ttx35);
        TextView ttx36 = findViewById(R.id.ttx36);
        TextView ttx37 = findViewById(R.id.ttx37);
        TextView ttx38 = findViewById(R.id.ttx38);
        TextView ttx39 = findViewById(R.id.ttx39);
        TextView ttx40 = findViewById(R.id.ttx40);
        TextView ttx41 = findViewById(R.id.ttx41);
        TextView ttx42 = findViewById(R.id.ttx42);
        TextView ttx43 = findViewById(R.id.ttx43);
        TextView ttx44 = findViewById(R.id.ttx44);
        TextView ttx45 = findViewById(R.id.ttx45);
        TextView ttx46 = findViewById(R.id.ttx46);
        TextView ttx47 = findViewById(R.id.ttx47);
        TextView ttx48 = findViewById(R.id.ttx48);
        TextView ttx49 = findViewById(R.id.ttx49);
        TextView ttx50 = findViewById(R.id.ttx50);
        TextView ttx51 = findViewById(R.id.ttx51);
        TextView ttx52 = findViewById(R.id.ttx52);
        TextView ttx53 = findViewById(R.id.ttx53);
        TextView ttx54 = findViewById(R.id.ttx54);
        TextView ttx55 = findViewById(R.id.ttx55);
        TextView ttx56 = findViewById(R.id.ttx56);
        TextView ttx57 = findViewById(R.id.ttx57);
        TextView ttx58 = findViewById(R.id.ttx58);
        TextView ttx59 = findViewById(R.id.ttx59);
        TextView ttx60 = findViewById(R.id.ttx60);
        TextView ttx61 = findViewById(R.id.ttx61);
        TextView ttx62 = findViewById(R.id.ttx62);
        TextView ttx63 = findViewById(R.id.ttx63);
        TextView ttx64 = findViewById(R.id.ttx64);
        Button button20 = findViewById(R.id.button20);
        Button button19 = findViewById(R.id.button19);
        TextView ttx65 = findViewById(R.id.ttx65);
        TextView ttx66 = findViewById(R.id.ttx66);
        TextView ttx67 = findViewById(R.id.ttx67);
        TextView ttx68 = findViewById(R.id.ttx68);
        TextView ttx69 = findViewById(R.id.ttx69);
        Button button22 = findViewById(R.id.button22);
        Button button21 = findViewById(R.id.button21);
        TextView ttx70 = findViewById(R.id.ttx70);
        TextView ttx71 = findViewById(R.id.ttx71);
        TextView ttx72 = findViewById(R.id.ttx72);
        TextView ttx73 = findViewById(R.id.ttx73);
        TextView ttx74 = findViewById(R.id.ttx74);
        TextView ttx75 = findViewById(R.id.ttx75);
        TextView ttx76 = findViewById(R.id.ttx76);
        TextView ttx77 = findViewById(R.id.ttx77);
        TextView ttx78 = findViewById(R.id.ttx78);
        TextView ttx79 = findViewById(R.id.ttx79);
        TextView ttx80 = findViewById(R.id.ttx80);
        TextView ttx81 = findViewById(R.id.ttx81);
        TextView ttx82 = findViewById(R.id.ttx82);
        TextView ttx83 = findViewById(R.id.ttx83);
        TextView ttx84 = findViewById(R.id.ttx84);
        TextView ttx85 = findViewById(R.id.ttx85);
        TextView ttx86 = findViewById(R.id.ttx86);
        //Глава 5
        TextView ttr1 = findViewById(R.id.ttr1);
        TextView ttr2 = findViewById(R.id.ttr2);
        TextView ttr3 = findViewById(R.id.ttr3);
        TextView ttr4 = findViewById(R.id.ttr4);
        TextView ttr5 = findViewById(R.id.ttr5);
        TextView ttr6 = findViewById(R.id.ttr6);
        TextView ttr7 = findViewById(R.id.ttr7);
        TextView ttr8 = findViewById(R.id.ttr8);
        TextView ttr9 = findViewById(R.id.ttr9);
        TextView ttr10 = findViewById(R.id.ttr10);
        TextView ttr11 = findViewById(R.id.ttr11);
        TextView ttr12 = findViewById(R.id.ttr12);
        TextView ttr13 = findViewById(R.id.ttr13);
        TextView ttr14 = findViewById(R.id.ttr14);
        TextView ttr15 = findViewById(R.id.ttr15);
        Button button24 = findViewById(R.id.button24);
        Button button23 = findViewById(R.id.button23);
        TextView ttr16 = findViewById(R.id.ttr16);
        TextView ttr17 = findViewById(R.id.ttr17);
        TextView ttr18 = findViewById(R.id.ttr18);
        TextView ttr19 = findViewById(R.id.ttr19);
        TextView ttr20 = findViewById(R.id.ttr20);
        Button button27 = findViewById(R.id.button27);
        Button button26 = findViewById(R.id.button26);
        Button button25 = findViewById(R.id.button25);
        TextView ttr21 = findViewById(R.id.ttr21);
        TextView ttr22 = findViewById(R.id.ttr22);
        TextView ttr23 = findViewById(R.id.ttr23);
        TextView ttr24 = findViewById(R.id.ttr24);
        TextView ttr25 = findViewById(R.id.ttr25);
        TextView ttr26 = findViewById(R.id.ttr26);
        Button button30 = findViewById(R.id.button30);
        Button button29 = findViewById(R.id.button29);
        Button button28 = findViewById(R.id.button28);
        TextView ttr27 = findViewById(R.id.ttr27);
        TextView ttr28 = findViewById(R.id.ttr28);
        TextView ttr29 = findViewById(R.id.ttr29);
        TextView ttr30 = findViewById(R.id.ttr30);
        TextView ttr31 = findViewById(R.id.ttr31);
        TextView ttr32 = findViewById(R.id.ttr32);
        TextView ttr33 = findViewById(R.id.ttr33);
        TextView ttr34 = findViewById(R.id.ttr34);
        TextView ttr35 = findViewById(R.id.ttr35);
        TextView ttr36 = findViewById(R.id.ttr36);
        TextView ttr37 = findViewById(R.id.ttr37);
        TextView ttr38 = findViewById(R.id.ttr38);
        TextView ttr39 = findViewById(R.id.ttr39);
        TextView ttr40 = findViewById(R.id.ttr40);
        TextView ttr41 = findViewById(R.id.ttr41);
        TextView ttr42 = findViewById(R.id.ttr42);
        TextView ttr43 = findViewById(R.id.ttr43);
        TextView ttr44 = findViewById(R.id.ttr44);
        TextView ttr45 = findViewById(R.id.ttr45);
        TextView ttr46 = findViewById(R.id.ttr46);
        TextView ttr47 = findViewById(R.id.ttr47);
        TextView ttr48 = findViewById(R.id.ttr48);
        TextView ttr49 = findViewById(R.id.ttr49);
        TextView ttr50 = findViewById(R.id.ttr50);
        TextView ttr51 = findViewById(R.id.ttr51);
        TextView ttr52 = findViewById(R.id.ttr52);
        TextView ttr53 = findViewById(R.id.ttr53);
        TextView ttr54 = findViewById(R.id.ttr54);
        TextView ttr55 = findViewById(R.id.ttr55);
        TextView ttr56 = findViewById(R.id.ttr56);
        TextView ttr57 = findViewById(R.id.ttr57);
        TextView ttr58 = findViewById(R.id.ttr58);
        TextView ttr59 = findViewById(R.id.ttr59);
        TextView ttr60 = findViewById(R.id.ttr60);
        TextView ttr61 = findViewById(R.id.ttr61);
        TextView ttr62 = findViewById(R.id.ttr62);
        TextView ttr63 = findViewById(R.id.ttr63);
        TextView ttr64 = findViewById(R.id.ttr64);
        TextView ttr65 = findViewById(R.id.ttr65);
        TextView ttr66 = findViewById(R.id.ttr66);
        TextView ttr67 = findViewById(R.id.ttr67);
        TextView ttr68 = findViewById(R.id.ttr68);
        TextView ttr69 = findViewById(R.id.ttr69);
        TextView ttr70 = findViewById(R.id.ttr70);
        TextView ttr71 = findViewById(R.id.ttr71);
        TextView ttr72 = findViewById(R.id.ttr72);
        TextView ttr73 = findViewById(R.id.ttr73);
        TextView ttr74 = findViewById(R.id.ttr74);
        TextView ttr75 = findViewById(R.id.ttr75);
        TextView ttr76 = findViewById(R.id.ttr76);
        TextView ttr77 = findViewById(R.id.ttr77);
        TextView ttr78 = findViewById(R.id.ttr78);
        TextView ttr79 = findViewById(R.id.ttr79);
        TextView ttr80 = findViewById(R.id.ttr80);
        TextView ttr81 = findViewById(R.id.ttr81);

// Порядок появления на экране
        //Глава 1
        text0.setText(text.scenario1[0]);
        text1.setText(text.scenario1[1]);
        text2.setText(text.scenario1[2]);
        ///Button
        text3.setText(text.scenario1[5]);
        text4.setText(text.scenario1[6]);
        text5.setText(text.scenario1[7]);
        text6.setText(text.scenario1[8]);
        text7.setText(text.scenario1[9]);
        ///Button
        text8.setText(text.scenario1[12]);
        text9.setText(text.scenario1[13]);
        text10.setText(text.scenario1[14]);
        text11.setText(text.scenario1[15]);
        text12.setText(text.scenario1[16]);
        text13.setText(text.scenario1[17]);
        text14.setText(text.scenario1[18]);
        text15.setText(text.scenario1[19]);
        text16.setText(text.scenario1[20]);
        text17.setText(text.scenario1[21]);
        text18.setText(text.scenario1[22]);
        text19.setText(text.scenario1[23]);
        text20.setText(text.scenario1[24]);
        text21.setText(text.scenario1[25]);
        text22.setText(text.scenario1[26]);
        text23.setText(text.scenario1[27]);
        text24.setText(text.scenario1[28]);
        text25.setText(text.scenario1[29]);
        text26.setText(text.scenario1[30]);
        ///Button
        text27.setText(text.scenario1[33]);
        text28.setText(text.scenario1[34]);
        text29.setText(text.scenario1[35]);
        text30.setText(text.scenario1[36]);
        text31.setText(text.scenario1[37]);
        text32.setText(text.scenario1[38]);
        text33.setText(text.scenario1[39]);
        text34.setText(text.scenario1[40]);
        text35.setText(text.scenario1[41]);
        text36.setText(text.scenario1[42]);
        text37.setText(text.scenario1[43]);
        text38.setText(text.scenario1[44]);
        text39.setText(text.scenario1[45]);
        ///Глава 2
        t1.setText(t.scenario2[0]);
        t2.setText(t.scenario2[1]);
        t3.setText(t.scenario2[2]);
        t4.setText(t.scenario2[3]);
        t5.setText(t.scenario2[4]);
        t6.setText(t.scenario2[5]);
        t7.setText(t.scenario2[6]);
        t8.setText(t.scenario2[7]);
        t9.setText(t.scenario2[8]);
        t10.setText(t.scenario2[9]);
        t11.setText(t.scenario2[10]);
        t12.setText(t.scenario2[11]);
        t13.setText(t.scenario2[12]);
        t14.setText(t.scenario2[13]);
        t15.setText(t.scenario2[14]);
        t16.setText(t.scenario2[15]);
        t17.setText(t.scenario2[16]);
        t18.setText(t.scenario2[17]);
        t19.setText(t.scenario2[18]);
        t20.setText(t.scenario2[19]);
        t21.setText(t.scenario2[20]);
        t22.setText(t.scenario2[21]);
        t23.setText(t.scenario2[22]);
        t24.setText(t.scenario2[23]);
        t25.setText(t.scenario2[24]);
        t26.setText(t.scenario2[25]);
        t27.setText(t.scenario2[26]);
        t28.setText(t.scenario2[27]);
        t29.setText(t.scenario2[28]);
        t30.setText(t.scenario2[29]);
        t31.setText(t.scenario2[30]);
        t32.setText(t.scenario2[31]);
        t33.setText(t.scenario2[32]);
        t34.setText(t.scenario2[33]);
        t35.setText(t.scenario2[34]);
        t36.setText(t.scenario2[35]);
        t37.setText(t.scenario2[36]);
        t38.setText(t.scenario2[37]);
        t39.setText(t.scenario2[38]);
        t40.setText(t.scenario2[39]);
        t41.setText(t.scenario2[40]);
        t42.setText(t.scenario2[41]);
        t43.setText(t.scenario2[42]);
        t44.setText(t.scenario2[43]);
        t45.setText(t.scenario2[44]);
        t46.setText(t.scenario2[45]);
        // Глава 3
        tt1.setText(tt.scenario3[0]);
        tt2.setText(tt.scenario3[1]);
        tt3.setText(tt.scenario3[2]);
        tt4.setText(tt.scenario3[3]);
        tt5.setText(tt.scenario3[4]);
        tt6.setText(tt.scenario3[5]);
        tt7.setText(tt.scenario3[6]);
        tt8.setText(tt.scenario3[7]);
        tt9.setText(tt.scenario3[8]);
        tt10.setText(tt.scenario3[9]);
        tt11.setText(tt.scenario3[10]);
        tt12.setText(tt.scenario3[11]);
        tt13.setText(tt.scenario3[12]);
        tt14.setText(tt.scenario3[13]);
        tt15.setText(tt.scenario3[14]);
        tt16.setText(tt.scenario3[15]);
        tt17.setText(tt.scenario3[16]);
        tt18.setText(tt.scenario3[17]);
        tt19.setText(tt.scenario3[18]);
        tt20.setText(tt.scenario3[19]);
        tt21.setText(tt.scenario3[20]);
        tt22.setText(tt.scenario3[21]);
        tt23.setText(tt.scenario3[22]);
        tt24.setText(tt.scenario3[23]);
        tt25.setText(tt.scenario3[24]);
        tt26.setText(tt.scenario3[25]);
        tt27.setText(tt.scenario3[26]);
        tt28.setText(tt.scenario3[27]);
        tt29.setText(tt.scenario3[28]);
        tt30.setText(tt.scenario3[29]);
        tt31.setText(tt.scenario3[30]);
        tt32.setText(tt.scenario3[31]);
        tt33.setText(tt.scenario3[32]);
        tt34.setText(tt.scenario3[33]);
        tt35.setText(tt.scenario3[34]);
        tt36.setText(tt.scenario3[35]);
        tt37.setText(tt.scenario3[36]);
        tt38.setText(tt.scenario3[37]);
        tt39.setText(tt.scenario3[38]);
        tt40.setText(tt.scenario3[39]);
        tt41.setText(tt.scenario3[40]);
        tt42.setText(tt.scenario3[41]);
        tt43.setText(tt.scenario3[42]);
        tt44.setText(tt.scenario3[43]);
        tt45.setText(tt.scenario3[44]);
        tt46.setText(tt.scenario3[45]);
        tt47.setText(tt.scenario3[46]);
        tt48.setText(tt.scenario3[47]);
        tt49.setText(tt.scenario3[48]);
        tt50.setText(tt.scenario3[49]);
        tt51.setText(tt.scenario3[50]);
        tt52.setText(tt.scenario3[51]);
        tt53.setText(tt.scenario3[52]);
        tt54.setText(tt.scenario3[53]);
        tt55.setText(tt.scenario3[54]);
        tt56.setText(tt.scenario3[55]);
        tt57.setText(tt.scenario3[56]);
        tt58.setText(tt.scenario3[57]);
        tt59.setText(tt.scenario3[58]);
        // Глава 4
        ttx1.setText(ttx.scenario4[0]);
        ttx2.setText(ttx.scenario4[1]);
        ttx3.setText(ttx.scenario4[2]);
        ttx4.setText(ttx.scenario4[3]);
        //Button
        ttx5.setText(ttx.scenario4[6]);
        ttx6.setText(ttx.scenario4[7]);
        ttx7.setText(ttx.scenario4[8]);
        ttx8.setText(ttx.scenario4[9]);
        ttx9.setText(ttx.scenario4[10]);
        ttx10.setText(ttx.scenario4[11]);
        //Button
        ttx11.setText(ttx.scenario4[12]);
        ttx12.setText(ttx.scenario4[13]);
        ttx13.setText(ttx.scenario4[14]);
        ttx14.setText(ttx.scenario4[15]);
        //Button
        ttx15.setText(ttx.scenario4[16]);
        ttx16.setText(ttx.scenario4[17]);
        ttx17.setText(ttx.scenario4[18]);
        ttx18.setText(ttx.scenario4[19]);
        //Button
        ttx19.setText(ttx.scenario4[20]);
        ttx20.setText(ttx.scenario4[21]);
        ttx21.setText(ttx.scenario4[22]);
        ttx22.setText(ttx.scenario4[23]);
        ttx23.setText(ttx.scenario4[24]);
        ttx24.setText(ttx.scenario4[25]);
        ttx25.setText(ttx.scenario4[26]);
        ttx26.setText(ttx.scenario4[27]);
        ttx27.setText(ttx.scenario4[28]);
        ttx28.setText(ttx.scenario4[29]);
        ttx29.setText(ttx.scenario4[30]);
        ttx30.setText(ttx.scenario4[31]);
        ttx31.setText(ttx.scenario4[32]);
        ttx32.setText(ttx.scenario4[33]);
        ttx33.setText(ttx.scenario4[34]);
        ttx34.setText(ttx.scenario4[35]);
        ttx35.setText(ttx.scenario4[36]);
        ttx36.setText(ttx.scenario4[37]);
        ttx37.setText(ttx.scenario4[38]);
        ttx38.setText(ttx.scenario4[39]);
        ttx39.setText(ttx.scenario4[40]);
        ttx40.setText(ttx.scenario4[41]);
        ttx41.setText(ttx.scenario4[42]);
        ttx42.setText(ttx.scenario4[43]);
        ttx43.setText(ttx.scenario4[44]);
        ttx44.setText(ttx.scenario4[45]);
        ttx45.setText(ttx.scenario4[46]);
        ttx46.setText(ttx.scenario4[47]);
        ttx47.setText(ttx.scenario4[48]);
        ttx48.setText(ttx.scenario4[49]);
        ttx49.setText(ttx.scenario4[50]);
        ttx50.setText(ttx.scenario4[51]);
        ttx51.setText(ttx.scenario4[52]);
        ttx52.setText(ttx.scenario4[53]);
        ttx53.setText(ttx.scenario4[54]);
        ttx54.setText(ttx.scenario4[55]);
        ttx55.setText(ttx.scenario4[56]);
        ttx56.setText(ttx.scenario4[57]);
        ttx57.setText(ttx.scenario4[58]);
        ttx58.setText(ttx.scenario4[59]);
        ttx59.setText(ttx.scenario4[60]);
        ttx60.setText(ttx.scenario4[61]);
        ttx61.setText(ttx.scenario4[62]);
        ttx62.setText(ttx.scenario4[63]);
        ttx63.setText(ttx.scenario4[64]);
        ttx64.setText(ttx.scenario4[65]);
        //Button
        ttx65.setText(ttx.scenario4[68]);
        ttx66.setText(ttx.scenario4[69]);
        ttx67.setText(ttx.scenario4[70]);
        ttx68.setText(ttx.scenario4[71]);
        ttx69.setText(ttx.scenario4[72]);
        //Button
        ttx70.setText(ttx.scenario4[75]);
        ttx71.setText(ttx.scenario4[76]);
        ttx72.setText(ttx.scenario4[77]);
        ttx73.setText(ttx.scenario4[78]);
        ttx74.setText(ttx.scenario4[79]);
        ttx75.setText(ttx.scenario4[80]);
        ttx76.setText(ttx.scenario4[81]);
        ttx77.setText(ttx.scenario4[82]);
        ttx78.setText(ttx.scenario4[83]);
        ttx79.setText(ttx.scenario4[84]);
        ttx80.setText(ttx.scenario4[85]);
        ttx81.setText(ttx.scenario4[86]);
        ttx82.setText(ttx.scenario4[87]);
        ttx83.setText(ttx.scenario4[88]);
        ttx84.setText(ttx.scenario4[89]);
        ttx85.setText(ttx.scenario4[90]);
        ttx86.setText(ttx.scenario4[91]);
        //Глава 5
        ttr1.setText(ttr.scenario5[0]);
        ttr2.setText(ttr.scenario5[1]);
        ttr3.setText(ttr.scenario5[2]);
        ttr4.setText(ttr.scenario5[3]);
        ttr5.setText(ttr.scenario5[4]);
        ttr6.setText(ttr.scenario5[5]);
        ttr7.setText(ttr.scenario5[6]);
        ttr8.setText(ttr.scenario5[7]);
        ttr9.setText(ttr.scenario5[8]);
        ttr10.setText(ttr.scenario5[9]);
        ttr11.setText(ttr.scenario5[10]);
        ttr12.setText(ttr.scenario5[11]);
        ttr13.setText(ttr.scenario5[12]);
        ttr14.setText(ttr.scenario5[13]);
        ttr15.setText(ttr.scenario5[14]);
        //Button
        ttr16.setText(ttr.scenario5[17]);
        ttr17.setText(ttr.scenario5[18]);
        ttr18.setText(ttr.scenario5[19]);
        ttr19.setText(ttr.scenario5[20]);
        ttr20.setText(ttr.scenario5[21]);
        //Button
        ttr21.setText(ttr.scenario5[25]);
        ttr22.setText(ttr.scenario5[26]);
        ttr23.setText(ttr.scenario5[27]);
        ttr24.setText(ttr.scenario5[28]);
        ttr25.setText(ttr.scenario5[29]);
        ttr26.setText(ttr.scenario5[30]);
        //Button
        ttr27.setText(ttr.scenario5[34]);
        ttr28.setText(ttr.scenario5[35]);
        ttr29.setText(ttr.scenario5[36]);
        ttr30.setText(ttr.scenario5[37]);
        ttr31.setText(ttr.scenario5[39]);
        ttr32.setText(ttr.scenario5[40]);
        ttr33.setText(ttr.scenario5[41]);
        ttr34.setText(ttr.scenario5[42]);
        ttr35.setText(ttr.scenario5[43]);
        ttr36.setText(ttr.scenario5[44]);
        ttr37.setText(ttr.scenario5[45]);
        ttr38.setText(ttr.scenario5[46]);
        ttr39.setText(ttr.scenario5[47]);
        ttr40.setText(ttr.scenario5[48]);
        ttr41.setText(ttr.scenario5[49]);
        ttr42.setText(ttr.scenario5[50]);
        ttr43.setText(ttr.scenario5[51]);
        ttr44.setText(ttr.scenario5[52]);
        ttr45.setText(ttr.scenario5[53]);
        ttr46.setText(ttr.scenario5[54]);
        ttr47.setText(ttr.scenario5[55]);
        ttr48.setText(ttr.scenario5[56]);
        ttr49.setText(ttr.scenario5[57]);
        ttr50.setText(ttr.scenario5[58]);
        ttr51.setText(ttr.scenario5[59]);
        ttr52.setText(ttr.scenario5[60]);
        ttr53.setText(ttr.scenario5[61]);
        ttr54.setText(ttr.scenario5[62]);
        ttr55.setText(ttr.scenario5[63]);
        ttr56.setText(ttr.scenario5[64]);
        ttr57.setText(ttr.scenario5[65]);
        ttr58.setText(ttr.scenario5[66]);
        ttr59.setText(ttr.scenario5[67]);
        ttr60.setText(ttr.scenario5[68]);
        ttr61.setText(ttr.scenario5[69]);
        ttr62.setText(ttr.scenario5[70]);
        ttr63.setText(ttr.scenario5[71]);
        ttr64.setText(ttr.scenario5[72]);
        ttr65.setText(ttr.scenario5[73]);
        ttr66.setText(ttr.scenario5[74]);
        ttr67.setText(ttr.scenario5[75]);
        ttr68.setText(ttr.scenario5[76]);
        ttr69.setText(ttr.scenario5[77]);
        ttr70.setText(ttr.scenario5[78]);
        ttr71.setText(ttr.scenario5[79]);
        ttr72.setText(ttr.scenario5[80]);
        ttr73.setText(ttr.scenario5[81]);
        ttr74.setText(ttr.scenario5[82]);
        ttr75.setText(ttr.scenario5[83]);
        ttr76.setText(ttr.scenario5[84]);
        ttr77.setText(ttr.scenario5[85]);
        ttr78.setText(ttr.scenario5[86]);
        ttr79.setText(ttr.scenario5[87]);
        ttr80.setText(ttr.scenario5[88]);
        ttr81.setText(ttr.scenario5[89]);

//Скрываем текс
        text0.setVisibility(View.INVISIBLE);
        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        text5.setVisibility(View.GONE);
        text6.setVisibility(View.INVISIBLE);
        text7.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        text8.setVisibility(View.GONE);
        text9.setVisibility(View.GONE);
        text10.setVisibility(View.GONE);
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
        button7.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        text27.setVisibility(View.GONE);
        text28.setVisibility(View.GONE);
        text29.setVisibility(View.GONE);
        text30.setVisibility(View.GONE);
        text31.setVisibility(View.GONE);
        text32.setVisibility(View.GONE);
        text33.setVisibility(View.GONE);
        text34.setVisibility(View.INVISIBLE);
        text35.setVisibility(View.INVISIBLE);
        text36.setVisibility(View.INVISIBLE);
        text37.setVisibility(View.INVISIBLE);
        text38.setVisibility(View.INVISIBLE);
        text39.setVisibility(View.INVISIBLE);

        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        t4.setVisibility(View.INVISIBLE);
        t5.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);
        t7.setVisibility(View.INVISIBLE);
        t8.setVisibility(View.INVISIBLE);
        t9.setVisibility(View.INVISIBLE);
        t10.setVisibility(View.INVISIBLE);
        t11.setVisibility(View.INVISIBLE);
        t12.setVisibility(View.INVISIBLE);
        t13.setVisibility(View.INVISIBLE);
        t14.setVisibility(View.INVISIBLE);
        t15.setVisibility(View.INVISIBLE);
        t16.setVisibility(View.INVISIBLE);
        t17.setVisibility(View.INVISIBLE);
        t18.setVisibility(View.INVISIBLE);
        t19.setVisibility(View.INVISIBLE);
        t20.setVisibility(View.INVISIBLE);
        t21.setVisibility(View.INVISIBLE);
        t22.setVisibility(View.INVISIBLE);
        t23.setVisibility(View.INVISIBLE);
        t24.setVisibility(View.INVISIBLE);
        t25.setVisibility(View.INVISIBLE);
        t26.setVisibility(View.INVISIBLE);
        t27.setVisibility(View.INVISIBLE);
        t28.setVisibility(View.INVISIBLE);
        t29.setVisibility(View.INVISIBLE);
        t30.setVisibility(View.INVISIBLE);
        t31.setVisibility(View.INVISIBLE);
        t32.setVisibility(View.INVISIBLE);
        t33.setVisibility(View.INVISIBLE);
        t34.setVisibility(View.INVISIBLE);
        t35.setVisibility(View.INVISIBLE);
        t36.setVisibility(View.INVISIBLE);
        t37.setVisibility(View.INVISIBLE);
        t38.setVisibility(View.INVISIBLE);
        t39.setVisibility(View.INVISIBLE);
        t40.setVisibility(View.INVISIBLE);
        t41.setVisibility(View.INVISIBLE);
        t42.setVisibility(View.INVISIBLE);
        t43.setVisibility(View.INVISIBLE);
        t44.setVisibility(View.INVISIBLE);
        t45.setVisibility(View.INVISIBLE);
        t46.setVisibility(View.INVISIBLE);

        tt1.setVisibility(View.INVISIBLE);
        tt2.setVisibility(View.INVISIBLE);
        tt3.setVisibility(View.INVISIBLE);
        tt4.setVisibility(View.INVISIBLE);
        tt5.setVisibility(View.INVISIBLE);
        tt6.setVisibility(View.INVISIBLE);
        tt7.setVisibility(View.INVISIBLE);
        tt8.setVisibility(View.INVISIBLE);
        tt9.setVisibility(View.INVISIBLE);
        tt10.setVisibility(View.INVISIBLE);
        tt11.setVisibility(View.INVISIBLE);
        tt12.setVisibility(View.INVISIBLE);
        tt13.setVisibility(View.INVISIBLE);
        tt14.setVisibility(View.INVISIBLE);
        tt15.setVisibility(View.INVISIBLE);
        tt16.setVisibility(View.INVISIBLE);
        tt17.setVisibility(View.INVISIBLE);
        tt18.setVisibility(View.INVISIBLE);
        tt19.setVisibility(View.INVISIBLE);
        tt20.setVisibility(View.INVISIBLE);
        tt21.setVisibility(View.INVISIBLE);
        tt22.setVisibility(View.INVISIBLE);
        tt23.setVisibility(View.INVISIBLE);
        tt24.setVisibility(View.INVISIBLE);
        tt25.setVisibility(View.INVISIBLE);
        tt26.setVisibility(View.INVISIBLE);
        tt27.setVisibility(View.INVISIBLE);
        tt28.setVisibility(View.INVISIBLE);
        tt29.setVisibility(View.INVISIBLE);
        tt30.setVisibility(View.INVISIBLE);
        tt31.setVisibility(View.INVISIBLE);
        tt32.setVisibility(View.INVISIBLE);
        tt33.setVisibility(View.INVISIBLE);
        tt34.setVisibility(View.INVISIBLE);
        tt35.setVisibility(View.INVISIBLE);
        tt36.setVisibility(View.INVISIBLE);
        tt37.setVisibility(View.INVISIBLE);
        tt38.setVisibility(View.INVISIBLE);
        tt39.setVisibility(View.INVISIBLE);
        tt40.setVisibility(View.INVISIBLE);
        tt41.setVisibility(View.INVISIBLE);
        tt42.setVisibility(View.INVISIBLE);
        tt43.setVisibility(View.INVISIBLE);
        tt44.setVisibility(View.INVISIBLE);
        tt45.setVisibility(View.INVISIBLE);
        tt46.setVisibility(View.INVISIBLE);
        tt47.setVisibility(View.INVISIBLE);
        tt48.setVisibility(View.INVISIBLE);
        tt49.setVisibility(View.INVISIBLE);
        tt50.setVisibility(View.INVISIBLE);
        tt51.setVisibility(View.INVISIBLE);
        tt52.setVisibility(View.INVISIBLE);
        tt53.setVisibility(View.INVISIBLE);
        tt54.setVisibility(View.INVISIBLE);
        tt55.setVisibility(View.INVISIBLE);
        tt56.setVisibility(View.INVISIBLE);
        tt57.setVisibility(View.INVISIBLE);
        tt58.setVisibility(View.INVISIBLE);
        tt59.setVisibility(View.INVISIBLE);

        ttx1.setVisibility(View.INVISIBLE);
        ttx2.setVisibility(View.INVISIBLE);
        ttx3.setVisibility(View.INVISIBLE);
        ttx4.setVisibility(View.INVISIBLE);
        button9.setVisibility(View.INVISIBLE);
        button8.setVisibility(View.INVISIBLE);
        ttx5.setVisibility(View.GONE);
        ttx6.setVisibility(View.GONE);
        ttx7.setVisibility(View.GONE);
        ttx8.setVisibility(View.GONE);
        ttx9.setVisibility(View.GONE);
        ttx10.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);
        button11.setVisibility(View.GONE);
        button10.setVisibility(View.GONE);
        ttx11.setVisibility(View.GONE);
        ttx12.setVisibility(View.GONE);
        ttx13.setVisibility(View.GONE);
        ttx14.setVisibility(View.GONE);
        button15.setVisibility(View.GONE);
        button14.setVisibility(View.GONE);
        button13.setVisibility(View.GONE);
        ttx15.setVisibility(View.GONE);
        ttx16.setVisibility(View.GONE);
        ttx17.setVisibility(View.GONE);
        ttx18.setVisibility(View.GONE);
        button18.setVisibility(View.GONE);
        button17.setVisibility(View.GONE);
        button16.setVisibility(View.GONE);
        ttx19.setVisibility(View.GONE);
        ttx20.setVisibility(View.GONE);
        ttx21.setVisibility(View.GONE);
        ttx22.setVisibility(View.GONE);
        ttx23.setVisibility(View.GONE);
        ttx24.setVisibility(View.GONE);
        ttx25.setVisibility(View.GONE);
        ttx26.setVisibility(View.INVISIBLE);
        ttx27.setVisibility(View.INVISIBLE);
        ttx28.setVisibility(View.INVISIBLE);
        ttx29.setVisibility(View.INVISIBLE);
        ttx30.setVisibility(View.INVISIBLE);
        ttx31.setVisibility(View.INVISIBLE);
        ttx32.setVisibility(View.INVISIBLE);
        ttx33.setVisibility(View.INVISIBLE);
        ttx34.setVisibility(View.INVISIBLE);
        ttx35.setVisibility(View.INVISIBLE);
        ttx36.setVisibility(View.INVISIBLE);
        ttx37.setVisibility(View.INVISIBLE);
        ttx38.setVisibility(View.INVISIBLE);
        ttx39.setVisibility(View.INVISIBLE);
        ttx40.setVisibility(View.INVISIBLE);
        ttx41.setVisibility(View.INVISIBLE);
        ttx42.setVisibility(View.INVISIBLE);
        ttx43.setVisibility(View.INVISIBLE);
        ttx44.setVisibility(View.INVISIBLE);
        ttx45.setVisibility(View.INVISIBLE);
        ttx46.setVisibility(View.INVISIBLE);
        ttx47.setVisibility(View.INVISIBLE);
        ttx48.setVisibility(View.INVISIBLE);
        ttx49.setVisibility(View.INVISIBLE);
        ttx50.setVisibility(View.INVISIBLE);
        ttx51.setVisibility(View.INVISIBLE);
        ttx52.setVisibility(View.INVISIBLE);
        ttx53.setVisibility(View.INVISIBLE);
        ttx54.setVisibility(View.INVISIBLE);
        ttx55.setVisibility(View.INVISIBLE);
        ttx56.setVisibility(View.INVISIBLE);
        ttx57.setVisibility(View.INVISIBLE);
        ttx58.setVisibility(View.INVISIBLE);
        ttx59.setVisibility(View.INVISIBLE);
        ttx60.setVisibility(View.INVISIBLE);
        ttx61.setVisibility(View.INVISIBLE);
        ttx62.setVisibility(View.INVISIBLE);
        ttx63.setVisibility(View.INVISIBLE);
        ttx64.setVisibility(View.INVISIBLE);
        button20.setVisibility(View.INVISIBLE);
        button19.setVisibility(View.INVISIBLE);
        ttx65.setVisibility(View.GONE);
        ttx66.setVisibility(View.GONE);
        ttx67.setVisibility(View.GONE);
        ttx68.setVisibility(View.INVISIBLE);
        ttx69.setVisibility(View.INVISIBLE);
        button22.setVisibility(View.INVISIBLE);
        button21.setVisibility(View.INVISIBLE);
        ttx70.setVisibility(View.GONE);
        ttx71.setVisibility(View.GONE);
        ttx72.setVisibility(View.GONE);
        ttx73.setVisibility(View.GONE);
        ttx74.setVisibility(View.INVISIBLE);
        ttx75.setVisibility(View.INVISIBLE);
        ttx76.setVisibility(View.INVISIBLE);
        ttx77.setVisibility(View.INVISIBLE);
        ttx78.setVisibility(View.INVISIBLE);
        ttx79.setVisibility(View.INVISIBLE);
        ttx80.setVisibility(View.INVISIBLE);
        ttx81.setVisibility(View.INVISIBLE);
        ttx82.setVisibility(View.INVISIBLE);
        ttx83.setVisibility(View.INVISIBLE);
        ttx84.setVisibility(View.INVISIBLE);
        ttx85.setVisibility(View.INVISIBLE);
        ttx86.setVisibility(View.INVISIBLE);

        ttr1.setVisibility(View.INVISIBLE);
        ttr2.setVisibility(View.INVISIBLE);
        ttr3.setVisibility(View.INVISIBLE);
        ttr4.setVisibility(View.INVISIBLE);
        ttr5.setVisibility(View.INVISIBLE);
        ttr6.setVisibility(View.INVISIBLE);
        ttr7.setVisibility(View.INVISIBLE);
        ttr8.setVisibility(View.INVISIBLE);
        ttr9.setVisibility(View.INVISIBLE);
        ttr10.setVisibility(View.INVISIBLE);
        ttr11.setVisibility(View.INVISIBLE);
        ttr12.setVisibility(View.INVISIBLE);
        ttr13.setVisibility(View.INVISIBLE);
        ttr14.setVisibility(View.INVISIBLE);
        ttr15.setVisibility(View.INVISIBLE);
        button24.setVisibility(View.INVISIBLE);
        button23.setVisibility(View.INVISIBLE);
        ttr16.setVisibility(View.GONE);
        ttr17.setVisibility(View.GONE);
        ttr18.setVisibility(View.INVISIBLE);
        ttr19.setVisibility(View.INVISIBLE);
        ttr20.setVisibility(View.INVISIBLE);
        button27.setVisibility(View.INVISIBLE);
        button26.setVisibility(View.INVISIBLE);
        button25.setVisibility(View.INVISIBLE);
        ttr21.setVisibility(View.GONE);
        ttr22.setVisibility(View.GONE);
        ttr23.setVisibility(View.GONE);
        ttr24.setVisibility(View.GONE);
        ttr25.setVisibility(View.GONE);
        ttr26.setVisibility(View.GONE);
        button30.setVisibility(View.GONE);
        button29.setVisibility(View.GONE);
        button28.setVisibility(View.GONE);
        ttr27.setVisibility(View.GONE);
        ttr28.setVisibility(View.GONE);
        ttr29.setVisibility(View.GONE);
        ttr30.setVisibility(View.INVISIBLE);
        ttr31.setVisibility(View.INVISIBLE);
        ttr32.setVisibility(View.INVISIBLE);
        ttr33.setVisibility(View.INVISIBLE);
        ttr34.setVisibility(View.INVISIBLE);
        ttr35.setVisibility(View.INVISIBLE);
        ttr36.setVisibility(View.INVISIBLE);
        ttr37.setVisibility(View.INVISIBLE);
        ttr38.setVisibility(View.INVISIBLE);
        ttr39.setVisibility(View.INVISIBLE);
        ttr40.setVisibility(View.INVISIBLE);
        ttr41.setVisibility(View.INVISIBLE);
        ttr42.setVisibility(View.INVISIBLE);
        ttr43.setVisibility(View.INVISIBLE);
        ttr44.setVisibility(View.INVISIBLE);
        ttr45.setVisibility(View.INVISIBLE);
        ttr46.setVisibility(View.INVISIBLE);
        ttr47.setVisibility(View.INVISIBLE);
        ttr48.setVisibility(View.INVISIBLE);
        ttr49.setVisibility(View.INVISIBLE);
        ttr50.setVisibility(View.INVISIBLE);
        ttr51.setVisibility(View.INVISIBLE);
        ttr52.setVisibility(View.INVISIBLE);
        ttr53.setVisibility(View.INVISIBLE);
        ttr54.setVisibility(View.INVISIBLE);
        ttr55.setVisibility(View.INVISIBLE);
        ttr56.setVisibility(View.INVISIBLE);
        ttr57.setVisibility(View.INVISIBLE);
        ttr58.setVisibility(View.INVISIBLE);
        ttr59.setVisibility(View.INVISIBLE);
        ttr60.setVisibility(View.INVISIBLE);
        ttr61.setVisibility(View.INVISIBLE);
        ttr62.setVisibility(View.INVISIBLE);
        ttr63.setVisibility(View.INVISIBLE);
        ttr64.setVisibility(View.INVISIBLE);
        ttr65.setVisibility(View.INVISIBLE);
        ttr66.setVisibility(View.INVISIBLE);
        ttr67.setVisibility(View.INVISIBLE);
        ttr68.setVisibility(View.INVISIBLE);
        ttr69.setVisibility(View.INVISIBLE);
        ttr70.setVisibility(View.INVISIBLE);
        ttr71.setVisibility(View.INVISIBLE);
        ttr72.setVisibility(View.INVISIBLE);
        ttr73.setVisibility(View.INVISIBLE);
        ttr74.setVisibility(View.INVISIBLE);
        ttr75.setVisibility(View.INVISIBLE);
        ttr76.setVisibility(View.INVISIBLE);
        ttr77.setVisibility(View.INVISIBLE);
        ttr78.setVisibility(View.INVISIBLE);
        ttr79.setVisibility(View.INVISIBLE);
        ttr80.setVisibility(View.INVISIBLE);
        ttr81.setVisibility(View.INVISIBLE);

        delay.execute();

    }

    class Delay extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            while (l <= 325) {
                {
                    if (c == 0 & l == 4) {
                        l = 4;
                    } else {
                        if (d == 0 & l == 10) {
                            l = 10;
                        } else {
                            if (s == 0 & l == 30) {
                                l = 30;
                            } else {
                                if (f == 0 & l == 153) {
                                    l = 153;
                                } else {
                                    if (y == 0 & l == 160) {
                                        l = 160;
                                    } else {
                                        if (j == 0 & l == 164) {
                                            l = 164;
                                        } else {
                                            if (u == 0 & l == 169) {
                                                l = 169;
                                            } else {
                                                if (k == 0 & l == 217) {
                                                    l = 217;
                                                } else {
                                                    if (i == 0 & l == 223) {
                                                        l = 223;
                                                    } else {
                                                    }
                                                    publishProgress(l++);
                                                    try {
                                                        Thread.sleep(3000);
                                                        if (isCancelled()) return null;
                                                    } catch (Exception e) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            TextView text0 = findViewById(R.id.text0);
            TextView text1 = findViewById(R.id.text1);
            TextView text2 = findViewById(R.id.text2);
            Button button3 = findViewById(R.id.button3);
            Button button2 = findViewById(R.id.button2);
            TextView text3 = findViewById(R.id.text3);
            TextView text4 = findViewById(R.id.text4);
            TextView text5 = findViewById(R.id.text5);
            TextView text6 = findViewById(R.id.text6);
            TextView text7 = findViewById(R.id.text7);
            Button button5 = findViewById(R.id.button5);
            Button button4 = findViewById(R.id.button4);
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
            Button button7 = findViewById(R.id.button7);
            Button button6 = findViewById(R.id.button6);
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
            ///Глава 2
            TextView t1 = findViewById(R.id.t1);
            TextView t2 = findViewById(R.id.t2);
            TextView t3 = findViewById(R.id.t3);
            TextView t4 = findViewById(R.id.t4);
            TextView t5 = findViewById(R.id.t5);
            TextView t6 = findViewById(R.id.t6);
            TextView t7 = findViewById(R.id.t7);
            TextView t8 = findViewById(R.id.t8);
            TextView t9 = findViewById(R.id.t9);
            TextView t10 = findViewById(R.id.t10);
            TextView t11 = findViewById(R.id.t11);
            TextView t12 = findViewById(R.id.t12);
            TextView t13 = findViewById(R.id.t13);
            TextView t14 = findViewById(R.id.t14);
            TextView t15 = findViewById(R.id.t15);
            TextView t16 = findViewById(R.id.t16);
            TextView t17 = findViewById(R.id.t17);
            TextView t18 = findViewById(R.id.t18);
            TextView t19 = findViewById(R.id.t19);
            TextView t20 = findViewById(R.id.t20);
            TextView t21 = findViewById(R.id.t21);
            TextView t22 = findViewById(R.id.t22);
            TextView t23 = findViewById(R.id.t23);
            TextView t24 = findViewById(R.id.t24);
            TextView t25 = findViewById(R.id.t25);
            TextView t26 = findViewById(R.id.t26);
            TextView t27 = findViewById(R.id.t27);
            TextView t28 = findViewById(R.id.t28);
            TextView t29 = findViewById(R.id.t29);
            TextView t30 = findViewById(R.id.t30);
            TextView t31 = findViewById(R.id.t31);
            TextView t32 = findViewById(R.id.t32);
            TextView t33 = findViewById(R.id.t33);
            TextView t34 = findViewById(R.id.t34);
            TextView t35 = findViewById(R.id.t35);
            TextView t36 = findViewById(R.id.t36);
            TextView t37 = findViewById(R.id.t37);
            TextView t38 = findViewById(R.id.t38);
            TextView t39 = findViewById(R.id.t39);
            TextView t40 = findViewById(R.id.t40);
            TextView t41 = findViewById(R.id.t41);
            TextView t42 = findViewById(R.id.t42);
            TextView t43 = findViewById(R.id.t43);
            TextView t44 = findViewById(R.id.t44);
            TextView t45 = findViewById(R.id.t45);
            TextView t46 = findViewById(R.id.t46);
            TextView tt1 = findViewById(R.id.tt1);
            TextView tt2 = findViewById(R.id.tt2);
            TextView tt3 = findViewById(R.id.tt3);
            TextView tt4 = findViewById(R.id.tt4);
            TextView tt5 = findViewById(R.id.tt5);
            TextView tt6 = findViewById(R.id.tt6);
            TextView tt7 = findViewById(R.id.tt7);
            TextView tt8 = findViewById(R.id.tt8);
            TextView tt9 = findViewById(R.id.tt9);
            TextView tt10 = findViewById(R.id.tt10);
            TextView tt11 = findViewById(R.id.tt11);
            TextView tt12 = findViewById(R.id.tt12);
            TextView tt13 = findViewById(R.id.tt13);
            TextView tt14 = findViewById(R.id.tt14);
            TextView tt15 = findViewById(R.id.tt15);
            TextView tt16 = findViewById(R.id.tt16);
            TextView tt17 = findViewById(R.id.tt17);
            TextView tt18 = findViewById(R.id.tt18);
            TextView tt19 = findViewById(R.id.tt19);
            TextView tt20 = findViewById(R.id.tt20);
            TextView tt21 = findViewById(R.id.tt21);
            TextView tt22 = findViewById(R.id.tt22);
            TextView tt23 = findViewById(R.id.tt23);
            TextView tt24 = findViewById(R.id.tt24);
            TextView tt25 = findViewById(R.id.tt25);
            TextView tt26 = findViewById(R.id.tt26);
            TextView tt27 = findViewById(R.id.tt27);
            TextView tt28 = findViewById(R.id.tt28);
            TextView tt29 = findViewById(R.id.tt29);
            TextView tt30 = findViewById(R.id.tt30);
            TextView tt31 = findViewById(R.id.tt31);
            TextView tt32 = findViewById(R.id.tt32);
            TextView tt33 = findViewById(R.id.tt33);
            TextView tt34 = findViewById(R.id.tt34);
            TextView tt35 = findViewById(R.id.tt35);
            TextView tt36 = findViewById(R.id.tt36);
            TextView tt37 = findViewById(R.id.tt37);
            TextView tt38 = findViewById(R.id.tt38);
            TextView tt39 = findViewById(R.id.tt39);
            TextView tt40 = findViewById(R.id.tt40);
            TextView tt41 = findViewById(R.id.tt41);
            TextView tt42 = findViewById(R.id.tt42);
            TextView tt43 = findViewById(R.id.tt43);
            TextView tt44 = findViewById(R.id.tt44);
            TextView tt45 = findViewById(R.id.tt45);
            TextView tt46 = findViewById(R.id.tt46);
            TextView tt47 = findViewById(R.id.tt47);
            TextView tt48 = findViewById(R.id.tt48);
            TextView tt49 = findViewById(R.id.tt49);
            TextView tt50 = findViewById(R.id.tt50);
            TextView tt51 = findViewById(R.id.tt51);
            TextView tt52 = findViewById(R.id.tt52);
            TextView tt53 = findViewById(R.id.tt53);
            TextView tt54 = findViewById(R.id.tt54);
            TextView tt55 = findViewById(R.id.tt55);
            TextView tt56 = findViewById(R.id.tt56);
            TextView tt57 = findViewById(R.id.tt57);
            TextView tt58 = findViewById(R.id.tt58);
            TextView tt59 = findViewById(R.id.tt59);

            TextView ttx1 = findViewById(R.id.ttx1);
            TextView ttx2 = findViewById(R.id.ttx2);
            TextView ttx3 = findViewById(R.id.ttx3);
            TextView ttx4 = findViewById(R.id.ttx4);
            Button button9 = findViewById(R.id.button9);
            Button button8 = findViewById(R.id.button8);
            TextView ttx5 = findViewById(R.id.ttx5);
            TextView ttx6 = findViewById(R.id.ttx6);
            TextView ttx7 = findViewById(R.id.ttx7);
            TextView ttx8 = findViewById(R.id.ttx8);
            TextView ttx9 = findViewById(R.id.ttx9);
            TextView ttx10 = findViewById(R.id.ttx10);
            Button button12 = findViewById(R.id.button12);
            Button button11 = findViewById(R.id.button11);
            Button button10 = findViewById(R.id.button10);
            TextView ttx11 = findViewById(R.id.ttx11);
            TextView ttx12 = findViewById(R.id.ttx12);
            TextView ttx13 = findViewById(R.id.ttx13);
            TextView ttx14 = findViewById(R.id.ttx14);
            Button button15 = findViewById(R.id.button15);
            Button button14 = findViewById(R.id.button14);
            Button button13 = findViewById(R.id.button13);
            TextView ttx15 = findViewById(R.id.ttx15);
            TextView ttx16 = findViewById(R.id.ttx16);
            TextView ttx17 = findViewById(R.id.ttx17);
            TextView ttx18 = findViewById(R.id.ttx18);
            Button button18 = findViewById(R.id.button18);
            Button button17 = findViewById(R.id.button17);
            Button button16 = findViewById(R.id.button16);
            TextView ttx19 = findViewById(R.id.ttx19);
            TextView ttx20 = findViewById(R.id.ttx20);
            TextView ttx21 = findViewById(R.id.ttx21);
            TextView ttx22 = findViewById(R.id.ttx22);
            TextView ttx23 = findViewById(R.id.ttx23);
            TextView ttx24 = findViewById(R.id.ttx24);
            TextView ttx25 = findViewById(R.id.ttx25);
            TextView ttx26 = findViewById(R.id.ttx26);
            TextView ttx27 = findViewById(R.id.ttx27);
            TextView ttx28 = findViewById(R.id.ttx28);
            TextView ttx29 = findViewById(R.id.ttx29);
            TextView ttx30 = findViewById(R.id.ttx30);
            TextView ttx31 = findViewById(R.id.ttx31);
            TextView ttx32 = findViewById(R.id.ttx32);
            TextView ttx33 = findViewById(R.id.ttx33);
            TextView ttx34 = findViewById(R.id.ttx34);
            TextView ttx35 = findViewById(R.id.ttx35);
            TextView ttx36 = findViewById(R.id.ttx36);
            TextView ttx37 = findViewById(R.id.ttx37);
            TextView ttx38 = findViewById(R.id.ttx38);
            TextView ttx39 = findViewById(R.id.ttx39);
            TextView ttx40 = findViewById(R.id.ttx40);
            TextView ttx41 = findViewById(R.id.ttx41);
            TextView ttx42 = findViewById(R.id.ttx42);
            TextView ttx43 = findViewById(R.id.ttx43);
            TextView ttx44 = findViewById(R.id.ttx44);
            TextView ttx45 = findViewById(R.id.ttx45);
            TextView ttx46 = findViewById(R.id.ttx46);
            TextView ttx47 = findViewById(R.id.ttx47);
            TextView ttx48 = findViewById(R.id.ttx48);
            TextView ttx49 = findViewById(R.id.ttx49);
            TextView ttx50 = findViewById(R.id.ttx50);
            TextView ttx51 = findViewById(R.id.ttx51);
            TextView ttx52 = findViewById(R.id.ttx52);
            TextView ttx53 = findViewById(R.id.ttx53);
            TextView ttx54 = findViewById(R.id.ttx54);
            TextView ttx55 = findViewById(R.id.ttx55);
            TextView ttx56 = findViewById(R.id.ttx56);
            TextView ttx57 = findViewById(R.id.ttx57);
            TextView ttx58 = findViewById(R.id.ttx58);
            TextView ttx59 = findViewById(R.id.ttx59);
            TextView ttx60 = findViewById(R.id.ttx60);
            TextView ttx61 = findViewById(R.id.ttx61);
            TextView ttx62 = findViewById(R.id.ttx62);
            TextView ttx63 = findViewById(R.id.ttx63);
            TextView ttx64 = findViewById(R.id.ttx64);
            Button button20 = findViewById(R.id.button20);
            Button button19 = findViewById(R.id.button19);
            TextView ttx65 = findViewById(R.id.ttx65);
            TextView ttx66 = findViewById(R.id.ttx66);
            TextView ttx67 = findViewById(R.id.ttx67);
            TextView ttx68 = findViewById(R.id.ttx68);
            TextView ttx69 = findViewById(R.id.ttx69);
            Button button22 = findViewById(R.id.button22);
            Button button21 = findViewById(R.id.button21);
            TextView ttx70 = findViewById(R.id.ttx70);
            TextView ttx71 = findViewById(R.id.ttx71);
            TextView ttx72 = findViewById(R.id.ttx72);
            TextView ttx73 = findViewById(R.id.ttx73);
            TextView ttx74 = findViewById(R.id.ttx74);
            TextView ttx75 = findViewById(R.id.ttx75);
            TextView ttx76 = findViewById(R.id.ttx76);
            TextView ttx77 = findViewById(R.id.ttx77);
            TextView ttx78 = findViewById(R.id.ttx78);
            TextView ttx79 = findViewById(R.id.ttx79);
            TextView ttx80 = findViewById(R.id.ttx80);
            TextView ttx81 = findViewById(R.id.ttx81);
            TextView ttx82 = findViewById(R.id.ttx82);
            TextView ttx83 = findViewById(R.id.ttx83);
            TextView ttx84 = findViewById(R.id.ttx84);
            TextView ttx85 = findViewById(R.id.ttx85);
            TextView ttx86 = findViewById(R.id.ttx86);

            TextView ttr1 = findViewById(R.id.ttr1);
            TextView ttr2 = findViewById(R.id.ttr2);
            TextView ttr3 = findViewById(R.id.ttr3);
            TextView ttr4 = findViewById(R.id.ttr4);
            TextView ttr5 = findViewById(R.id.ttr5);
            TextView ttr6 = findViewById(R.id.ttr6);
            TextView ttr7 = findViewById(R.id.ttr7);
            TextView ttr8 = findViewById(R.id.ttr8);
            TextView ttr9 = findViewById(R.id.ttr9);
            TextView ttr10 = findViewById(R.id.ttr10);
            TextView ttr11 = findViewById(R.id.ttr11);
            TextView ttr12 = findViewById(R.id.ttr12);
            TextView ttr13 = findViewById(R.id.ttr13);
            TextView ttr14 = findViewById(R.id.ttr14);
            TextView ttr15 = findViewById(R.id.ttr15);
            Button button24 = findViewById(R.id.button24);
            Button button23 = findViewById(R.id.button23);
            TextView ttr16 = findViewById(R.id.ttr16);
            TextView ttr17 = findViewById(R.id.ttr17);
            TextView ttr18 = findViewById(R.id.ttr18);
            TextView ttr19 = findViewById(R.id.ttr19);
            TextView ttr20 = findViewById(R.id.ttr20);
            Button button27 = findViewById(R.id.button27);
            Button button26 = findViewById(R.id.button26);
            Button button25 = findViewById(R.id.button25);
            TextView ttr21 = findViewById(R.id.ttr21);
            TextView ttr22 = findViewById(R.id.ttr22);
            TextView ttr23 = findViewById(R.id.ttr23);
            TextView ttr24 = findViewById(R.id.ttr24);
            TextView ttr25 = findViewById(R.id.ttr25);
            TextView ttr26 = findViewById(R.id.ttr26);
            Button button30 = findViewById(R.id.button30);
            Button button29 = findViewById(R.id.button29);
            Button button28 = findViewById(R.id.button28);
            TextView ttr27 = findViewById(R.id.ttr27);
            TextView ttr28 = findViewById(R.id.ttr28);
            TextView ttr29 = findViewById(R.id.ttr29);
            TextView ttr30 = findViewById(R.id.ttr30);
            TextView ttr31 = findViewById(R.id.ttr31);
            TextView ttr32 = findViewById(R.id.ttr32);
            TextView ttr33 = findViewById(R.id.ttr33);
            TextView ttr34 = findViewById(R.id.ttr34);
            TextView ttr35 = findViewById(R.id.ttr35);
            TextView ttr36 = findViewById(R.id.ttr36);
            TextView ttr37 = findViewById(R.id.ttr37);
            TextView ttr38 = findViewById(R.id.ttr38);
            TextView ttr39 = findViewById(R.id.ttr39);
            TextView ttr40 = findViewById(R.id.ttr40);
            TextView ttr41 = findViewById(R.id.ttr41);
            TextView ttr42 = findViewById(R.id.ttr42);
            TextView ttr43 = findViewById(R.id.ttr43);
            TextView ttr44 = findViewById(R.id.ttr44);
            TextView ttr45 = findViewById(R.id.ttr45);
            TextView ttr46 = findViewById(R.id.ttr46);
            TextView ttr47 = findViewById(R.id.ttr47);
            TextView ttr48 = findViewById(R.id.ttr48);
            TextView ttr49 = findViewById(R.id.ttr49);
            TextView ttr50 = findViewById(R.id.ttr50);
            TextView ttr51 = findViewById(R.id.ttr51);
            TextView ttr52 = findViewById(R.id.ttr52);
            TextView ttr53 = findViewById(R.id.ttr53);
            TextView ttr54 = findViewById(R.id.ttr54);
            TextView ttr55 = findViewById(R.id.ttr55);
            TextView ttr56 = findViewById(R.id.ttr56);
            TextView ttr57 = findViewById(R.id.ttr57);
            TextView ttr58 = findViewById(R.id.ttr58);
            TextView ttr59 = findViewById(R.id.ttr59);
            TextView ttr60 = findViewById(R.id.ttr60);
            TextView ttr61 = findViewById(R.id.ttr61);
            TextView ttr62 = findViewById(R.id.ttr62);
            TextView ttr63 = findViewById(R.id.ttr63);
            TextView ttr64 = findViewById(R.id.ttr64);
            TextView ttr65 = findViewById(R.id.ttr65);
            TextView ttr66 = findViewById(R.id.ttr66);
            TextView ttr67 = findViewById(R.id.ttr67);
            TextView ttr68 = findViewById(R.id.ttr68);
            TextView ttr69 = findViewById(R.id.ttr69);
            TextView ttr70 = findViewById(R.id.ttr70);
            TextView ttr71 = findViewById(R.id.ttr71);
            TextView ttr72 = findViewById(R.id.ttr72);
            TextView ttr73 = findViewById(R.id.ttr73);
            TextView ttr74 = findViewById(R.id.ttr74);
            TextView ttr75 = findViewById(R.id.ttr75);
            TextView ttr76 = findViewById(R.id.ttr76);
            TextView ttr77 = findViewById(R.id.ttr77);
            TextView ttr78 = findViewById(R.id.ttr78);
            TextView ttr79 = findViewById(R.id.ttr79);
            TextView ttr80 = findViewById(R.id.ttr80);
            TextView ttr81 = findViewById(R.id.ttr81);

            Animation a = AnimationUtils.loadAnimation(Story.this, R.anim.alpha);

            switch (l) {
                case 1:
                    text0.setVisibility(View.VISIBLE);
                    text0.startAnimation(a);
                    break;
                case 2:
                    text1.setVisibility(View.VISIBLE);
                    text1.startAnimation(a);
                    break;
                case 3:
                    text2.setVisibility(View.VISIBLE);
                    text2.startAnimation(a);
                    break;
                case 4:
                    button3.setVisibility(View.VISIBLE);
                    button3.startAnimation(a);
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (c == 0) {
                                    c = 1;
                                    text4.setVisibility(View.GONE);
                                    text5.setVisibility(View.GONE);
                                    text6.setVisibility(View.GONE);
                                    l = l + 3;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button2.setVisibility(View.VISIBLE);
                    button2.startAnimation(a);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (c == 0) {
                                    c = 1;
                                    text3.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 5:
                    text3.setVisibility(View.VISIBLE);
                    text3.startAnimation(a);
                    break;
                case 6:
                    text4.setVisibility(View.VISIBLE);
                    text4.startAnimation(a);
                    break;
                case 7:
                    text5.setVisibility(View.VISIBLE);
                    text5.startAnimation(a);
                    break;
                case 8:
                    text6.setVisibility(View.VISIBLE);
                    text6.startAnimation(a);
                    break;
                case 9:
                    text7.setVisibility(View.VISIBLE);
                    text7.startAnimation(a);
                    break;
                case 10:
                    button5.setVisibility(View.VISIBLE);
                    button5.startAnimation(a);
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (d == 0) {
                                    d = 1;

                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button4.setVisibility(View.VISIBLE);
                    button4.startAnimation(a);
                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (d == 0) {
                                    d = 1;
                                    text8.setVisibility(View.GONE);
                                    text9.setVisibility(View.GONE);
                                    text10.setVisibility(View.GONE);
                                    l = l + 3;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 11:
                    text8.setVisibility(View.VISIBLE);
                    text8.startAnimation(a);
                    break;
                case 12:
                    text9.setVisibility(View.VISIBLE);
                    text9.startAnimation(a);
                    break;
                case 13:
                    text10.setVisibility(View.VISIBLE);
                    text10.startAnimation(a);
                    text10.setVisibility(View.GONE);
                    break;
                case 14:
                    text11.setVisibility(View.VISIBLE);
                    text11.startAnimation(a);
                    break;
                case 15:
                    text12.setVisibility(View.VISIBLE);
                    text12.startAnimation(a);
                    break;
                case 16:
                    text13.setVisibility(View.VISIBLE);
                    text13.startAnimation(a);
                    break;
                case 17:
                    text14.setVisibility(View.VISIBLE);
                    text14.startAnimation(a);
                    break;
                case 18:
                    text15.setVisibility(View.VISIBLE);
                    text15.startAnimation(a);
                    break;
                case 19:
                    text16.setVisibility(View.VISIBLE);
                    text16.startAnimation(a);
                    break;
                case 20:
                    text17.setVisibility(View.VISIBLE);
                    text17.startAnimation(a);
                    break;
                case 21:
                    text18.setVisibility(View.VISIBLE);
                    text18.startAnimation(a);
                    break;
                case 22:
                    text19.setVisibility(View.VISIBLE);
                    text19.startAnimation(a);
                    break;
                case 23:
                    text20.setVisibility(View.VISIBLE);
                    text20.startAnimation(a);
                    break;
                case 24:
                    text21.setVisibility(View.VISIBLE);
                    text21.startAnimation(a);
                    break;
                case 25:
                    text22.setVisibility(View.VISIBLE);
                    text22.startAnimation(a);
                    break;
                case 26:
                    text23.setVisibility(View.VISIBLE);
                    text23.startAnimation(a);
                    break;
                case 27:
                    text24.setVisibility(View.VISIBLE);
                    text24.startAnimation(a);
                    break;
                case 28:
                    text25.setVisibility(View.VISIBLE);
                    text25.startAnimation(a);
                    break;
                case 29:
                    text26.setVisibility(View.VISIBLE);
                    text26.startAnimation(a);
                    break;
                case 30:
                    button7.setVisibility(View.VISIBLE);
                    button7.startAnimation(a);
                    button7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (s == 0) {
                                    s = 1;
                                    text28.setVisibility(View.GONE);
                                    text29.setVisibility(View.GONE);
                                    text30.setVisibility(View.GONE);
                                    text31.setVisibility(View.GONE);
                                    text32.setVisibility(View.GONE);
                                    l = l + 5;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button6.setVisibility(View.VISIBLE);
                    button6.startAnimation(a);
                    button6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (s == 0) {
                                    s = 1;
                                    text27.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 31:
                    text27.setVisibility(View.VISIBLE);
                    text27.startAnimation(a);
                    break;
                case 32:
                    text28.setVisibility(View.VISIBLE);
                    text28.startAnimation(a);
                    break;
                case 33:
                    text29.setVisibility(View.VISIBLE);
                    text29.startAnimation(a);
                    break;
                case 34:
                    text30.setVisibility(View.VISIBLE);
                    text30.startAnimation(a);
                    break;
                case 35:
                    text31.setVisibility(View.VISIBLE);
                    text31.startAnimation(a);
                    break;
                case 36:
                    text32.setVisibility(View.VISIBLE);
                    text32.startAnimation(a);
                    break;
                case 37:
                    text33.setVisibility(View.VISIBLE);
                    text33.startAnimation(a);
                    break;
                case 38:
                    text34.setVisibility(View.VISIBLE);
                    text34.startAnimation(a);
                    break;
                case 39:
                    text35.setVisibility(View.VISIBLE);
                    text35.startAnimation(a);
                    break;
                case 40:
                    text36.setVisibility(View.VISIBLE);
                    text36.startAnimation(a);
                    break;
                case 41:
                    text37.setVisibility(View.VISIBLE);
                    text37.startAnimation(a);
                    break;
                case 42:
                    text38.setVisibility(View.VISIBLE);
                    text38.startAnimation(a);
                    break;
                case 43:
                    text39.setVisibility(View.VISIBLE);
                    text39.startAnimation(a);
                    break;
                case 44:
                    t1.setVisibility(View.VISIBLE);
                    t1.startAnimation(a);
                    break;
                case 45:
                    t2.setVisibility(View.VISIBLE);
                    t2.startAnimation(a);
                    break;
                case 46:
                    t3.setVisibility(View.VISIBLE);
                    t3.startAnimation(a);
                    break;
                case 47:
                    t4.setVisibility(View.VISIBLE);
                    t4.startAnimation(a);
                    break;
                case 48:
                    t5.setVisibility(View.VISIBLE);
                    t5.startAnimation(a);
                    break;
                case 49:
                    t6.setVisibility(View.VISIBLE);
                    t6.startAnimation(a);
                    break;
                case 50:
                    t7.setVisibility(View.VISIBLE);
                    t7.startAnimation(a);
                    break;
                case 51:
                    t8.setVisibility(View.VISIBLE);
                    t8.startAnimation(a);
                    break;
                case 52:
                    t9.setVisibility(View.VISIBLE);
                    t9.startAnimation(a);
                    break;
                case 53:
                    t10.setVisibility(View.VISIBLE);
                    t10.startAnimation(a);
                    break;
                case 54:
                    t11.setVisibility(View.VISIBLE);
                    t11.startAnimation(a);
                    break;
                case 55:
                    t12.setVisibility(View.VISIBLE);
                    t12.startAnimation(a);
                    break;
                case 56:
                    t13.setVisibility(View.VISIBLE);
                    t13.startAnimation(a);
                    break;
                case 57:
                    t14.setVisibility(View.VISIBLE);
                    t14.startAnimation(a);
                    break;
                case 58:
                    t15.setVisibility(View.VISIBLE);
                    t15.startAnimation(a);
                    break;
                case 59:
                    t16.setVisibility(View.VISIBLE);
                    t16.startAnimation(a);
                    break;
                case 60:
                    t17.setVisibility(View.VISIBLE);
                    t17.startAnimation(a);
                    break;
                case 61:
                    t18.setVisibility(View.VISIBLE);
                    t18.startAnimation(a);
                    break;
                case 62:
                    t19.setVisibility(View.VISIBLE);
                    t19.startAnimation(a);
                    break;
                case 63:
                    t20.setVisibility(View.VISIBLE);
                    t20.startAnimation(a);
                    break;
                case 64:
                    t21.setVisibility(View.VISIBLE);
                    t21.startAnimation(a);
                    break;
                case 65:
                    t22.setVisibility(View.VISIBLE);
                    t22.startAnimation(a);
                    break;
                case 66:
                    t23.setVisibility(View.VISIBLE);
                    t23.startAnimation(a);
                    break;
                case 67:
                    t24.setVisibility(View.VISIBLE);
                    t24.startAnimation(a);
                    break;
                case 68:
                    t25.setVisibility(View.VISIBLE);
                    t25.startAnimation(a);
                    break;
                case 69:
                    t26.setVisibility(View.VISIBLE);
                    t26.startAnimation(a);
                    break;
                case 70:
                    t27.setVisibility(View.VISIBLE);
                    t27.startAnimation(a);
                    break;
                case 71:
                    t28.setVisibility(View.VISIBLE);
                    t28.startAnimation(a);
                    break;
                case 72:
                    t29.setVisibility(View.VISIBLE);
                    t29.startAnimation(a);
                    break;
                case 73:
                    t30.setVisibility(View.VISIBLE);
                    t30.startAnimation(a);
                    break;
                case 74:
                    t31.setVisibility(View.VISIBLE);
                    t31.startAnimation(a);
                    break;
                case 75:
                    t32.setVisibility(View.VISIBLE);
                    t32.startAnimation(a);
                    break;
                case 76:
                    t33.setVisibility(View.VISIBLE);
                    t33.startAnimation(a);
                    break;
                case 77:
                    t34.setVisibility(View.VISIBLE);
                    t34.startAnimation(a);
                    break;
                case 78:
                    t35.setVisibility(View.VISIBLE);
                    t35.startAnimation(a);
                    break;
                case 79:
                    t36.setVisibility(View.VISIBLE);
                    t36.startAnimation(a);
                    break;
                case 80:
                    t37.setVisibility(View.VISIBLE);
                    t37.startAnimation(a);
                    break;
                case 81:
                    t38.setVisibility(View.VISIBLE);
                    t38.startAnimation(a);
                    break;
                case 82:
                    t39.setVisibility(View.VISIBLE);
                    t39.startAnimation(a);
                    break;
                case 83:
                    t40.setVisibility(View.VISIBLE);
                    t40.startAnimation(a);
                    break;
                case 84:
                    t41.setVisibility(View.VISIBLE);
                    t41.startAnimation(a);
                    break;
                case 85:
                    t42.setVisibility(View.VISIBLE);
                    t42.startAnimation(a);
                    break;
                case 86:
                    t43.setVisibility(View.VISIBLE);
                    t43.startAnimation(a);
                    break;
                case 87:
                    t44.setVisibility(View.VISIBLE);
                    t44.startAnimation(a);
                    break;
                case 88:
                    t45.setVisibility(View.VISIBLE);
                    t45.startAnimation(a);
                    break;
                case 89:
                    t46.setVisibility(View.VISIBLE);
                    t46.startAnimation(a);
                    break;
                case 90:
                    tt1.setVisibility(View.VISIBLE);
                    tt1.startAnimation(a);
                    break;
                case 91:
                    tt2.setVisibility(View.VISIBLE);
                    tt2.startAnimation(a);
                    break;
                case 92:
                    tt3.setVisibility(View.VISIBLE);
                    tt3.startAnimation(a);
                    break;
                case 93:
                    tt4.setVisibility(View.VISIBLE);
                    tt4.startAnimation(a);
                    break;
                case 94:
                    tt5.setVisibility(View.VISIBLE);
                    tt5.startAnimation(a);
                    break;
                case 95:
                    tt6.setVisibility(View.VISIBLE);
                    tt6.startAnimation(a);
                    break;
                case 96:
                    tt7.setVisibility(View.VISIBLE);
                    tt7.startAnimation(a);
                    break;
                case 97:
                    tt8.setVisibility(View.VISIBLE);
                    tt8.startAnimation(a);
                    break;
                case 98:
                    tt9.setVisibility(View.VISIBLE);
                    tt9.startAnimation(a);
                    break;
                case 99:
                    tt10.setVisibility(View.VISIBLE);
                    tt10.startAnimation(a);
                    break;
                case 100:
                    tt11.setVisibility(View.VISIBLE);
                    tt11.startAnimation(a);
                    break;
                case 101:
                    tt12.setVisibility(View.VISIBLE);
                    tt12.startAnimation(a);
                    break;
                case 102:
                    tt13.setVisibility(View.VISIBLE);
                    tt13.startAnimation(a);
                    break;
                case 103:
                    tt14.setVisibility(View.VISIBLE);
                    tt14.startAnimation(a);
                    break;
                case 104:
                    tt15.setVisibility(View.VISIBLE);
                    tt15.startAnimation(a);
                    break;
                case 105:
                    tt16.setVisibility(View.VISIBLE);
                    tt16.startAnimation(a);
                    break;
                case 106:
                    tt17.setVisibility(View.VISIBLE);
                    tt17.startAnimation(a);
                    break;
                case 107:
                    tt18.setVisibility(View.VISIBLE);
                    tt18.startAnimation(a);
                    break;
                case 108:
                    tt19.setVisibility(View.VISIBLE);
                    tt19.startAnimation(a);
                    break;
                case 109:
                    tt20.setVisibility(View.VISIBLE);
                    tt20.startAnimation(a);
                    break;
                case 110:
                    tt21.setVisibility(View.VISIBLE);
                    tt21.startAnimation(a);
                    break;
                case 111:
                    tt22.setVisibility(View.VISIBLE);
                    tt22.startAnimation(a);
                    break;
                case 112:
                    tt23.setVisibility(View.VISIBLE);
                    tt23.startAnimation(a);
                    break;
                case 113:
                    tt24.setVisibility(View.VISIBLE);
                    tt24.startAnimation(a);
                    break;
                case 114:
                    tt25.setVisibility(View.VISIBLE);
                    tt25.startAnimation(a);
                    break;
                case 115:
                    tt26.setVisibility(View.VISIBLE);
                    tt26.startAnimation(a);
                    break;
                case 116:
                    tt27.setVisibility(View.VISIBLE);
                    tt27.startAnimation(a);
                    break;
                case 117:
                    tt28.setVisibility(View.VISIBLE);
                    tt28.startAnimation(a);
                    break;
                case 118:
                    tt29.setVisibility(View.VISIBLE);
                    tt29.startAnimation(a);
                    break;
                case 119:
                    tt30.setVisibility(View.VISIBLE);
                    tt30.startAnimation(a);
                    break;
                case 120:
                    tt31.setVisibility(View.VISIBLE);
                    tt31.startAnimation(a);
                    break;
                case 121:
                    tt32.setVisibility(View.VISIBLE);
                    tt32.startAnimation(a);
                    break;
                case 122:
                    tt33.setVisibility(View.VISIBLE);
                    tt33.startAnimation(a);
                    break;
                case 123:
                    tt34.setVisibility(View.VISIBLE);
                    tt34.startAnimation(a);
                    break;
                case 124:
                    tt35.setVisibility(View.VISIBLE);
                    tt35.startAnimation(a);
                    break;
                case 125:
                    tt36.setVisibility(View.VISIBLE);
                    tt36.startAnimation(a);
                    break;
                case 126:
                    tt37.setVisibility(View.VISIBLE);
                    tt37.startAnimation(a);
                    break;
                case 127:
                    tt38.setVisibility(View.VISIBLE);
                    tt38.startAnimation(a);
                    break;
                case 128:
                    tt39.setVisibility(View.VISIBLE);
                    tt39.startAnimation(a);
                    break;
                case 129:
                    tt40.setVisibility(View.VISIBLE);
                    tt40.startAnimation(a);
                    break;
                case 130:
                    tt41.setVisibility(View.VISIBLE);
                    tt41.startAnimation(a);
                    break;
                case 131:
                    tt42.setVisibility(View.VISIBLE);
                    tt42.startAnimation(a);
                    break;
                case 132:
                    tt43.setVisibility(View.VISIBLE);
                    tt43.startAnimation(a);
                    break;
                case 133:
                    tt44.setVisibility(View.VISIBLE);
                    tt44.startAnimation(a);
                    break;
                case 134:
                    tt45.setVisibility(View.VISIBLE);
                    tt45.startAnimation(a);
                    break;
                case 135:
                    tt46.setVisibility(View.VISIBLE);
                    tt46.startAnimation(a);
                    break;
                case 136:
                    tt47.setVisibility(View.VISIBLE);
                    tt47.startAnimation(a);
                    break;
                case 137:
                    tt48.setVisibility(View.VISIBLE);
                    tt48.startAnimation(a);
                    break;
                case 138:
                    tt49.setVisibility(View.VISIBLE);
                    tt49.startAnimation(a);
                    break;
                case 139:
                    tt50.setVisibility(View.VISIBLE);
                    tt50.startAnimation(a);
                    break;
                case 140:
                    tt51.setVisibility(View.VISIBLE);
                    tt51.startAnimation(a);
                    break;
                case 141:
                    tt52.setVisibility(View.VISIBLE);
                    tt52.startAnimation(a);
                    break;
                case 142:
                    tt53.setVisibility(View.VISIBLE);
                    tt53.startAnimation(a);
                    break;
                case 143:
                    tt54.setVisibility(View.VISIBLE);
                    tt54.startAnimation(a);
                    break;
                case 144:
                    tt55.setVisibility(View.VISIBLE);
                    tt55.startAnimation(a);
                    break;
                case 145:
                    tt56.setVisibility(View.VISIBLE);
                    tt56.startAnimation(a);
                    break;
                case 146:
                    tt57.setVisibility(View.VISIBLE);
                    tt57.startAnimation(a);
                    break;
                case 147:
                    tt58.setVisibility(View.VISIBLE);
                    tt58.startAnimation(a);
                    break;
                case 148:
                    tt59.setVisibility(View.VISIBLE);
                    tt59.startAnimation(a);
                    break;
                case 149:
                    ttx1.setVisibility(View.VISIBLE);
                    ttx1.startAnimation(a);
                    break;
                case 150:
                    ttx2.setVisibility(View.VISIBLE);
                    ttx2.startAnimation(a);
                    break;
                case 151:
                    ttx3.setVisibility(View.VISIBLE);
                    ttx3.startAnimation(a);
                    break;
                case 152:
                    ttx4.setVisibility(View.VISIBLE);
                    ttx4.startAnimation(a);
                    break;
                case 153:
                    button9.setVisibility(View.VISIBLE);
                    button9.startAnimation(a);
                    button9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (f == 0) {
                                    f = 1;
                                    ttx5.setVisibility(View.GONE);
                                    ttx6.setVisibility(View.GONE);
                                    ttx7.setVisibility(View.GONE);
                                    ttx8.setVisibility(View.GONE);
                                    ttx9.setVisibility(View.GONE);
                                    ttx10.setVisibility(View.GONE);
                                    button12.setVisibility(View.GONE);
                                    button11.setVisibility(View.GONE);
                                    button10.setVisibility(View.GONE);
                                    ttx11.setVisibility(View.GONE);
                                    ttx12.setVisibility(View.GONE);
                                    ttx13.setVisibility(View.GONE);
                                    ttx14.setVisibility(View.GONE);
                                    button15.setVisibility(View.GONE);
                                    button14.setVisibility(View.GONE);
                                    button13.setVisibility(View.GONE);
                                    ttx15.setVisibility(View.GONE);
                                    ttx16.setVisibility(View.GONE);
                                    ttx17.setVisibility(View.GONE);
                                    ttx18.setVisibility(View.GONE);
                                    button18.setVisibility(View.GONE);
                                    button17.setVisibility(View.GONE);
                                    button16.setVisibility(View.GONE);
                                    ttx19.setVisibility(View.GONE);
                                    ttx20.setVisibility(View.GONE);
                                    ttx21.setVisibility(View.GONE);
                                    ttx22.setVisibility(View.GONE);
                                    ttx23.setVisibility(View.GONE);
                                    ttx24.setVisibility(View.GONE);
                                    ttx25.setVisibility(View.GONE);
                                    ttx26.setVisibility(View.GONE);

                                    l = l + 22;

                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button8.setVisibility(View.VISIBLE);
                    button8.startAnimation(a);
                    button8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (f == 0) {
                                    f = 1;
                                    text24.setVisibility(View.GONE);
                                    text25.setVisibility(View.GONE);
                                    l = l + 2;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 154:
                    ttx5.setVisibility(View.VISIBLE);
                    ttx5.startAnimation(a);
                    break;
                case 155:
                    ttx6.setVisibility(View.VISIBLE);
                    ttx6.startAnimation(a);
                    break;
                case 156:
                    ttx7.setVisibility(View.VISIBLE);
                    ttx7.startAnimation(a);
                    break;
                case 157:
                    ttx8.setVisibility(View.VISIBLE);
                    ttx8.startAnimation(a);
                    break;
                case 158:
                    ttx9.setVisibility(View.VISIBLE);
                    ttx9.startAnimation(a);
                    break;
                case 159:
                    ttx10.setVisibility(View.VISIBLE);
                    ttx10.startAnimation(a);
                    break;
                case 160:
                    button12.setVisibility(View.VISIBLE);
                    button12.startAnimation(a);
                    button12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (y == 0) {
                                    y = 1;
                                    ttx20.setVisibility(View.GONE);
                                    l++;

                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button11.setVisibility(View.VISIBLE);
                    button11.startAnimation(a);
                    button11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (y == 0) {
                                    y = 1;
                                    ttx20.setVisibility(View.GONE);
                                    l++;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button10.setVisibility(View.VISIBLE);
                    button10.startAnimation(a);
                    button10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (y == 0) {
                                    y = 1;
                                    ttx23.setVisibility(View.GONE);
                                    l++;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 161:
                    ttx11.setVisibility(View.VISIBLE);
                    ttx11.startAnimation(a);
                    break;
                case 162:
                    ttx12.setVisibility(View.VISIBLE);
                    ttx12.startAnimation(a);
                    break;
                case 163:
                    ttx13.setVisibility(View.VISIBLE);
                    ttx13.startAnimation(a);
                    break;
                case 164:
                    ttx14.setVisibility(View.VISIBLE);
                    ttx14.startAnimation(a);
                    break;
                case 165:
                    button15.setVisibility(View.VISIBLE);
                    button15.startAnimation(a);
                    button15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (j == 0) {
                                    j = 1;
                                    ttx20.setVisibility(View.GONE);
                                    ttx21.setVisibility(View.GONE);
                                    l = l + 2;

                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button14.setVisibility(View.VISIBLE);
                    button14.startAnimation(a);
                    button14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (j == 0) {
                                    j = 1;
                                    ttx23.setVisibility(View.GONE);
                                    ttx22.setVisibility(View.GONE);
                                    l = l + 2;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    button13.setVisibility(View.VISIBLE);
                    button13.startAnimation(a);
                    button13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (j == 0) {
                                    j = 1;
                                    ttx20.setVisibility(View.GONE);
                                    ttx21.setVisibility(View.GONE);

                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                case 166:
                    ttx15.setVisibility(View.VISIBLE);
                    ttx15.startAnimation(a);
                    break;
                case 167:
                    ttx16.setVisibility(View.VISIBLE);
                    ttx16.startAnimation(a);
                    break;
                case 168:
                    ttx17.setVisibility(View.VISIBLE);
                    ttx17.startAnimation(a);
                    break;
                case 169:
                    ttx18.setVisibility(View.VISIBLE);
                    ttx18.startAnimation(a);
                    break;
                case 170:
                    button18.setVisibility(View.VISIBLE);
                    button18.startAnimation(a);
                    button18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (u == 0) {
                                    u = 1;
                                    ttx21.setVisibility(View.GONE);
                                    ttx22.setVisibility(View.GONE);
                                    l = l + 3;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button17.setVisibility(View.VISIBLE);
                    button17.startAnimation(a);
                    button17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (u == 0) {
                                    u = 1;
                                    ttx20.setVisibility(View.GONE);
                                    ttx21.setVisibility(View.GONE);
                                    ttx22.setVisibility(View.GONE);
                                    l = l + 3;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    button16.setVisibility(View.VISIBLE);
                    button16.startAnimation(a);
                    button16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (u == 0) {
                                    u = 1;
                                    ttx20.setVisibility(View.GONE);
                                    ttx21.setVisibility(View.GONE);
                                    ttx22.setVisibility(View.GONE);
                                    l = l + 3;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 171:
                    ttx19.setVisibility(View.VISIBLE);
                    ttx19.startAnimation(a);
                    break;
                case 172:
                    ttx20.setVisibility(View.VISIBLE);
                    ttx20.startAnimation(a);
                    break;
                case 173:
                    ttx21.setVisibility(View.VISIBLE);
                    ttx21.startAnimation(a);
                    break;
                case 174:
                    ttx22.setVisibility(View.VISIBLE);
                    ttx22.startAnimation(a);
                    break;
                case 175:
                    ttx23.setVisibility(View.VISIBLE);
                    ttx23.startAnimation(a);
                    break;
                case 176:
                    ttx24.setVisibility(View.VISIBLE);
                    ttx24.startAnimation(a);
                    break;
                case 177:
                    ttx25.setVisibility(View.VISIBLE);
                    ttx25.startAnimation(a);
                    break;
                case 178:
                    ttx26.setVisibility(View.VISIBLE);
                    ttx26.startAnimation(a);
                    break;
                case 179:
                    ttx27.setVisibility(View.VISIBLE);
                    ttx27.startAnimation(a);
                    break;
                case 180:
                    ttx28.setVisibility(View.VISIBLE);
                    ttx28.startAnimation(a);
                    break;
                case 181:
                    ttx29.setVisibility(View.VISIBLE);
                    ttx29.startAnimation(a);
                    break;
                case 182:
                    ttx30.setVisibility(View.VISIBLE);
                    ttx30.startAnimation(a);
                    break;
                case 183:
                    ttx31.setVisibility(View.VISIBLE);
                    ttx31.startAnimation(a);
                    break;
                case 184:
                    ttx32.setVisibility(View.VISIBLE);
                    ttx32.startAnimation(a);
                    break;
                case 185:
                    ttx33.setVisibility(View.VISIBLE);
                    ttx33.startAnimation(a);
                    break;
                case 186:
                    ttx34.setVisibility(View.VISIBLE);
                    ttx34.startAnimation(a);
                    break;
                case 187:
                    ttx35.setVisibility(View.VISIBLE);
                    ttx35.startAnimation(a);
                    break;
                case 188:
                    ttx36.setVisibility(View.VISIBLE);
                    ttx36.startAnimation(a);
                    break;
                case 189:
                    ttx37.setVisibility(View.VISIBLE);
                    ttx37.startAnimation(a);
                    break;
                case 190:
                    ttx38.setVisibility(View.VISIBLE);
                    ttx38.startAnimation(a);
                    break;
                case 191:
                    ttx39.setVisibility(View.VISIBLE);
                    ttx39.startAnimation(a);
                    break;
                case 192:
                    ttx40.setVisibility(View.VISIBLE);
                    ttx40.startAnimation(a);
                    break;
                case 193:
                    ttx41.setVisibility(View.VISIBLE);
                    ttx41.startAnimation(a);
                    break;
                case 194:
                    ttx42.setVisibility(View.VISIBLE);
                    ttx42.startAnimation(a);
                    break;
                case 195:
                    ttx43.setVisibility(View.VISIBLE);
                    ttx43.startAnimation(a);
                    break;
                case 196:
                    ttx44.setVisibility(View.VISIBLE);
                    ttx44.startAnimation(a);
                    break;
                case 197:
                    ttx45.setVisibility(View.VISIBLE);
                    ttx45.startAnimation(a);
                    break;
                case 198:
                    ttx46.setVisibility(View.VISIBLE);
                    ttx46.startAnimation(a);
                    break;
                case 199:
                    ttx47.setVisibility(View.VISIBLE);
                    ttx47.startAnimation(a);
                    break;
                case 200:
                    ttx48.setVisibility(View.VISIBLE);
                    ttx48.startAnimation(a);
                    break;
                case 201:
                    ttx49.setVisibility(View.VISIBLE);
                    ttx49.startAnimation(a);
                    break;
                case 202:
                    ttx50.setVisibility(View.VISIBLE);
                    ttx50.startAnimation(a);
                    break;
                case 203:
                    ttx51.setVisibility(View.VISIBLE);
                    ttx51.startAnimation(a);
                    break;
                case 204:
                    ttx52.setVisibility(View.VISIBLE);
                    ttx52.startAnimation(a);
                    break;
                case 205:
                    ttx53.setVisibility(View.VISIBLE);
                    ttx53.startAnimation(a);
                    break;
                case 206:
                    ttx54.setVisibility(View.VISIBLE);
                    ttx54.startAnimation(a);
                    break;
                case 207:
                    ttx55.setVisibility(View.VISIBLE);
                    ttx55.startAnimation(a);
                    break;
                case 208:
                    ttx56.setVisibility(View.VISIBLE);
                    ttx56.startAnimation(a);
                    break;
                case 209:
                    ttx57.setVisibility(View.VISIBLE);
                    ttx57.startAnimation(a);
                    break;
                case 210:
                    ttx58.setVisibility(View.VISIBLE);
                    ttx58.startAnimation(a);
                    break;
                case 211:
                    ttx59.setVisibility(View.VISIBLE);
                    ttx59.startAnimation(a);
                    break;
                case 212:
                    ttx60.setVisibility(View.VISIBLE);
                    ttx60.startAnimation(a);
                    break;
                case 213:
                    ttx61.setVisibility(View.VISIBLE);
                    ttx61.startAnimation(a);
                    break;
                case 214:
                    ttx62.setVisibility(View.VISIBLE);
                    ttx62.startAnimation(a);
                    break;
                case 215:
                    ttx63.setVisibility(View.VISIBLE);
                    ttx63.startAnimation(a);
                    break;
                case 216:
                    ttx64.setVisibility(View.VISIBLE);
                    ttx64.startAnimation(a);
                    break;
                case 217:
                    button20.setVisibility(View.VISIBLE);
                    button20.startAnimation(a);
                    button20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button19.setVisibility(View.VISIBLE);
                    button19.startAnimation(a);
                    button19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx65.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 218:
                    ttx65.setVisibility(View.VISIBLE);
                    ttx65.startAnimation(a);
                    break;
                case 219:
                    ttx66.setVisibility(View.VISIBLE);
                    ttx66.startAnimation(a);
                    break;
                case 220:
                    ttx67.setVisibility(View.VISIBLE);
                    ttx67.startAnimation(a);
                    break;
                case 221:
                    ttx68.setVisibility(View.VISIBLE);
                    ttx68.startAnimation(a);
                    break;
                case 222:
                    ttx69.setVisibility(View.VISIBLE);
                    ttx69.startAnimation(a);
                    break;
                case 223:
                    button22.setVisibility(View.VISIBLE);
                    button22.startAnimation(a);
                    button22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (i == 0) {
                                    i = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 3;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button21.setVisibility(View.VISIBLE);
                    button21.startAnimation(a);
                    button21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (i == 0) {
                                    i = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 224:
                    ttx70.setVisibility(View.VISIBLE);
                    ttx70.startAnimation(a);
                    break;
                case 225:
                    ttx71.setVisibility(View.VISIBLE);
                    ttx71.startAnimation(a);
                    break;
                case 226:
                    ttx72.setVisibility(View.VISIBLE);
                    ttx72.startAnimation(a);
                    break;
                case 227:
                    ttx73.setVisibility(View.VISIBLE);
                    ttx73.startAnimation(a);
                    break;
                case 228:
                    ttx74.setVisibility(View.VISIBLE);
                    ttx74.startAnimation(a);
                    break;
                case 229:
                    ttx75.setVisibility(View.VISIBLE);
                    ttx75.startAnimation(a);
                    break;
                case 230:
                    ttx76.setVisibility(View.VISIBLE);
                    ttx76.startAnimation(a);
                    break;
                case 231:
                    ttx77.setVisibility(View.VISIBLE);
                    ttx77.startAnimation(a);
                    break;
                case 232:
                    ttx78.setVisibility(View.VISIBLE);
                    ttx78.startAnimation(a);
                    break;
                case 233:
                    ttx79.setVisibility(View.VISIBLE);
                    ttx79.startAnimation(a);
                    break;
                case 234:
                    ttx80.setVisibility(View.VISIBLE);
                    ttx80.startAnimation(a);
                    break;
                case 235:
                    ttx81.setVisibility(View.VISIBLE);
                    ttx81.startAnimation(a);
                    break;
                case 236:
                    ttx82.setVisibility(View.VISIBLE);
                    ttx82.startAnimation(a);
                    break;
                case 237:
                    ttx83.setVisibility(View.VISIBLE);
                    ttx83.startAnimation(a);
                    break;
                case 238:
                    ttx84.setVisibility(View.VISIBLE);
                    ttx84.startAnimation(a);
                    break;
                case 239:
                    ttx85.setVisibility(View.VISIBLE);
                    ttx85.startAnimation(a);
                    break;
                case 240:
                    ttx86.setVisibility(View.VISIBLE);
                    ttx86.startAnimation(a);
                    break;
                case 241:
                    ttr1.setVisibility(View.VISIBLE);
                    ttr1.startAnimation(a);
                    break;
                case 242:
                    ttr2.setVisibility(View.VISIBLE);
                    ttr2.startAnimation(a);
                    break;
                case 243:
                    ttr3.setVisibility(View.VISIBLE);
                    ttr3.startAnimation(a);
                    break;
                case 244:
                    ttr4.setVisibility(View.VISIBLE);
                    ttr4.startAnimation(a);
                    break;
                case 245:
                    ttr5.setVisibility(View.VISIBLE);
                    ttr5.startAnimation(a);
                    break;
                case 246:
                    ttr6.setVisibility(View.VISIBLE);
                    ttr6.startAnimation(a);
                    break;
                case 247:
                    ttr7.setVisibility(View.VISIBLE);
                    ttr7.startAnimation(a);
                    break;
                case 248:
                    ttr8.setVisibility(View.VISIBLE);
                    ttr8.startAnimation(a);
                    break;
                case 249:
                    ttr9.setVisibility(View.VISIBLE);
                    ttr9.startAnimation(a);
                    break;
                case 250:
                    ttr10.setVisibility(View.VISIBLE);
                    ttr10.startAnimation(a);
                    break;
                case 251:
                    ttr11.setVisibility(View.VISIBLE);
                    ttr11.startAnimation(a);
                    break;
                case 252:
                    ttr12.setVisibility(View.VISIBLE);
                    ttr12.startAnimation(a);
                    break;
                case 253:
                    ttr13.setVisibility(View.VISIBLE);
                    ttr13.startAnimation(a);
                    break;
                case 254:
                    ttr14.setVisibility(View.VISIBLE);
                    ttr14.startAnimation(a);
                    break;
                case 255:
                    ttr15.setVisibility(View.VISIBLE);
                    ttr15.startAnimation(a);
                    break;
                case 256:
                    button20.setVisibility(View.VISIBLE);
                    button20.startAnimation(a);
                    button24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button23.setVisibility(View.VISIBLE);
                    button19.startAnimation(a);
                    button19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx65.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 257:
                    ttr16.setVisibility(View.VISIBLE);
                    ttr16.startAnimation(a);
                    break;
                case 258:
                    ttr17.setVisibility(View.VISIBLE);
                    ttr17.startAnimation(a);
                    break;
                case 259:
                    ttr18.setVisibility(View.VISIBLE);
                    ttr18.startAnimation(a);
                    break;
                case 260:
                    ttr19.setVisibility(View.VISIBLE);
                    ttr19.startAnimation(a);
                    break;
                case 261:
                    ttr20.setVisibility(View.VISIBLE);
                    ttr20.startAnimation(a);
                    break;
                case 262:
                    button27.setVisibility(View.VISIBLE);
                    button27.startAnimation(a);
                    button27.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button26.setVisibility(View.VISIBLE);
                    button26.startAnimation(a);
                    button26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button25.setVisibility(View.VISIBLE);
                    button25.startAnimation(a);
                    button25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx65.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 263:
                    ttr21.setVisibility(View.VISIBLE);
                    ttr21.startAnimation(a);
                    break;
                case 264:
                    ttr22.setVisibility(View.VISIBLE);
                    ttr22.startAnimation(a);
                    break;
                case 265:
                    ttr23.setVisibility(View.VISIBLE);
                    ttr23.startAnimation(a);
                    break;
                case 266:
                    ttr24.setVisibility(View.VISIBLE);
                    ttr24.startAnimation(a);
                    break;
                case 267:
                    ttr25.setVisibility(View.VISIBLE);
                    ttr25.startAnimation(a);
                    break;
                case 268:
                    ttr26.setVisibility(View.VISIBLE);
                    ttr26.startAnimation(a);
                    break;
                case 269:
                    button30.setVisibility(View.VISIBLE);
                    button30.startAnimation(a);
                    button30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button29.setVisibility(View.VISIBLE);
                    button29.startAnimation(a);
                    button29.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx66.setVisibility(View.GONE);
                                    ttx67.setVisibility(View.GONE);
                                    l = l + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button28.setVisibility(View.VISIBLE);
                    button28.startAnimation(a);
                    button28.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (k == 0) {
                                    k = 1;
                                    ttx65.setVisibility(View.GONE);
                                    l++;
                                }

                            } catch (Exception e) {
                            }
                        }
                    });
                    break;
                case 270:
                    ttr27.setVisibility(View.VISIBLE);
                    ttr27.startAnimation(a);
                    break;
                case 271:
                    ttr28.setVisibility(View.VISIBLE);
                    ttr28.startAnimation(a);
                    break;
                case 272:
                    ttr29.setVisibility(View.VISIBLE);
                    ttr29.startAnimation(a);
                    break;
                case 273:
                    ttr30.setVisibility(View.VISIBLE);
                    ttr30.startAnimation(a);
                    break;
                case 274:
                    ttr31.setVisibility(View.VISIBLE);
                    ttr31.startAnimation(a);
                    break;
                case 275:
                    ttr32.setVisibility(View.VISIBLE);
                    ttr32.startAnimation(a);
                    break;
                case 276:
                    ttr33.setVisibility(View.VISIBLE);
                    ttr33.startAnimation(a);
                    break;
                case 277:
                    ttr34.setVisibility(View.VISIBLE);
                    ttr34.startAnimation(a);
                    break;
                case 278:
                    ttr35.setVisibility(View.VISIBLE);
                    ttr35.startAnimation(a);
                    break;
                case 279:
                    ttr36.setVisibility(View.VISIBLE);
                    ttr36.startAnimation(a);
                    break;
                case 280:
                    ttr37.setVisibility(View.VISIBLE);
                    ttr37.startAnimation(a);
                    break;
                case 281:
                    ttr38.setVisibility(View.VISIBLE);
                    ttr38.startAnimation(a);
                    break;
                case 282:
                    ttr39.setVisibility(View.VISIBLE);
                    ttr39.startAnimation(a);
                    break;
                case 283:
                    ttr40.setVisibility(View.VISIBLE);
                    ttr40.startAnimation(a);
                    break;
                case 284:
                    ttr41.setVisibility(View.VISIBLE);
                    ttr41.startAnimation(a);
                    break;
                case 285:
                    ttr42.setVisibility(View.VISIBLE);
                    ttr42.startAnimation(a);
                    break;
                case 286:
                    ttr43.setVisibility(View.VISIBLE);
                    ttr43.startAnimation(a);
                    break;
                case 287:
                    ttr44.setVisibility(View.VISIBLE);
                    ttr44.startAnimation(a);
                    break;
                case 288:
                    ttr45.setVisibility(View.VISIBLE);
                    ttr45.startAnimation(a);
                    break;
                case 289:
                    ttr46.setVisibility(View.VISIBLE);
                    ttr46.startAnimation(a);
                    break;
                case 290:
                    ttr47.setVisibility(View.VISIBLE);
                    ttr47.startAnimation(a);
                    break;
                case 291:
                    ttr48.setVisibility(View.VISIBLE);
                    ttr48.startAnimation(a);
                    break;
                case 292:
                    ttr49.setVisibility(View.VISIBLE);
                    ttr49.startAnimation(a);
                    break;
                case 293:
                    ttr50.setVisibility(View.VISIBLE);
                    ttr50.startAnimation(a);
                    break;
                case 294:
                    ttr51.setVisibility(View.VISIBLE);
                    ttr51.startAnimation(a);
                    break;
                case 295:
                    ttr52.setVisibility(View.VISIBLE);
                    ttr52.startAnimation(a);
                    break;
                case 296:
                    ttr53.setVisibility(View.VISIBLE);
                    ttr53.startAnimation(a);
                    break;
                case 297:
                    ttr54.setVisibility(View.VISIBLE);
                    ttr54.startAnimation(a);
                    break;
                case 298:
                    ttr55.setVisibility(View.VISIBLE);
                    ttr55.startAnimation(a);
                    break;
                case 299:
                    ttr56.setVisibility(View.VISIBLE);
                    ttr56.startAnimation(a);
                    break;
                case 300:
                    ttr57.setVisibility(View.VISIBLE);
                    ttr57.startAnimation(a);
                    break;
                case 301:
                    ttr58.setVisibility(View.VISIBLE);
                    ttr58.startAnimation(a);
                    break;
                case 302:
                    ttr59.setVisibility(View.VISIBLE);
                    ttr59.startAnimation(a);
                    break;
                case 303:
                    ttr60.setVisibility(View.VISIBLE);
                    ttr60.startAnimation(a);
                    break;
                case 304:
                    ttr61.setVisibility(View.VISIBLE);
                    ttr61.startAnimation(a);
                    break;
                case 305:
                    ttr62.setVisibility(View.VISIBLE);
                    ttr62.startAnimation(a);
                    break;
                case 306:
                    ttr63.setVisibility(View.VISIBLE);
                    ttr63.startAnimation(a);
                    break;
                case 307:
                    ttr64.setVisibility(View.VISIBLE);
                    ttr64.startAnimation(a);
                    break;
                case 308:
                    ttr65.setVisibility(View.VISIBLE);
                    ttr65.startAnimation(a);
                    break;
                case 309:
                    ttr66.setVisibility(View.VISIBLE);
                    ttr66.startAnimation(a);
                    break;
                case 310:
                    ttr67.setVisibility(View.VISIBLE);
                    ttr67.startAnimation(a);
                    break;
                case 311:
                    ttr68.setVisibility(View.VISIBLE);
                    ttr68.startAnimation(a);
                    break;
                case 312:
                    ttr69.setVisibility(View.VISIBLE);
                    ttr69.startAnimation(a);
                    break;
                case 313:
                    ttr70.setVisibility(View.VISIBLE);
                    ttr70.startAnimation(a);
                    break;
                case 314:
                    ttr71.setVisibility(View.VISIBLE);
                    ttr71.startAnimation(a);
                    break;
                case 315:
                    ttr72.setVisibility(View.VISIBLE);
                    ttr72.startAnimation(a);
                    break;
                case 316:
                    ttr73.setVisibility(View.VISIBLE);
                    ttr73.startAnimation(a);
                    break;
                case 317:
                    ttr74.setVisibility(View.VISIBLE);
                    ttr74.startAnimation(a);
                    break;
                case 318:
                    ttr75.setVisibility(View.VISIBLE);
                    ttr75.startAnimation(a);
                    break;
                case 319:
                    ttr76.setVisibility(View.VISIBLE);
                    ttr76.startAnimation(a);
                    break;
                case 320:
                    ttr77.setVisibility(View.VISIBLE);
                    ttr77.startAnimation(a);
                    break;
                case 321:
                    ttr78.setVisibility(View.VISIBLE);
                    ttr78.startAnimation(a);
                    break;
                case 322:
                    ttr79.setVisibility(View.VISIBLE);
                    ttr79.startAnimation(a);
                    break;
                case 323:
                    ttr80.setVisibility(View.VISIBLE);
                    ttr80.startAnimation(a);
                    break;
                case 324:
                    ttr81.setVisibility(View.VISIBLE);
                    ttr81.startAnimation(a);
                    break;
                default:
                    break;
            }
        }
    }
}




