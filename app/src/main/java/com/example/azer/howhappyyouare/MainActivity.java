package com.example.azer.howhappyyouare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView questions, Score;
    Button next;
    RadioGroup radioGroup;
    int selectedId;
    int questionno = 0;
    int totalmark1=0,totalmark2=0,totalmark3=0,totalmark4=0,totalmark5=0,totalmark6=0,totalmark7=0,totalmark8=0,totalmark9=0,totalmark10=0;
    String correctanswer;
    RadioButton ans1, ans2, ans3, ans4;
    int questionnumber=0;
    String[] question = {"আপনি কোন সময়ে নিজেকে সবচেয়ে সুখী অনুভব করেন?", "আপনি সাধারণত কীভাবে হাঁটেন?","আপনি কারো সঙ্গে কথা বলার সময়-"," আপনি যখন বিশ্রাম নেন, তখন যেভাবে বসে থাকেন-","যখন কোনো কিছু আপনাকে সত্যিকারের আনন্দ দেয়, তখন আপনি;","আপনি যখন কোনো পার্টিতে উপস্থিত হন, তখন,","আপনি কোনো কাজে অনেক বেশি মগ্ন, হঠাৎ কেউ আপনাকে নক করলে,","আপনার পছদের রঙ কোনটি?","রাতে ঘুমানোর আগে আপনি কীভাবে বিছানায় শুয়ে থাকেন?","আপনি প্রায়ই কীরকম স্বপ্ন দেখেন?"};
    String[][]options={{"সকালে", "বিকাল ও সন্ধ্যার মাঝামাঝি সময়ে", "মধ্যরাতে", "কখনোই না"}, {"দ্রুত, বড় বড় পায়ে", "দ্রুত, ছোট ছোট পায়ে", "কম দ্রুত, মাথা উঁচু করে চারপাশের প্রকৃতি দেখে।", "কম দ্রুত, মাথা নিচু করে"},{"দুই হাত বুকের উপর গুটিয়ে রাখেন","দুই হাত হ্যান্ডশেক এর মতো করে বা মুষ্টিবদ্ধ করে রাখেন","একহাত বা দুই হাত আপনার হিপে রেখে বা পকেটে ঢুকিয়ে রাখেন","যার সাথে কথা বলছেন, তাঁকে স্পর্শ করে কথা বলেন"},{"দুই হাঁটু ভাজ করে মুখের সামনে এনে বসেন","দুই পা কোনাকোনিভাবে মাটিতে রেখে বসেন","পা দুটো সোজা সামনের দিকে দিয়ে বসেন","এক পা ভাজ করে অন্য পা সোজা করে বসেন"},{"জোরে হাসি দিয়ে স্বাগত জানান","অল্প শব্দ করে হাসি দেন","আপনি নীরব থাকেন","মুচকি হাসি দেন"},{"সবাইকে ওয়েলকাম করে ভিতরে প্রবেশ করেন","নীরবে প্রবেশ করেন, এবং পরিচিত কাউকে খোঁজেন","নীরবে প্রবেশ করে এক কোনায় একা দাঁড়িয়ে থাকতে পছন্দ করেন","কিছুই করেন না"},{"আপনি তাকে স্বাগত জানান","আপনি খুবই রেগে যান","মাঝে মাঝে স্বাগত জানান, মাঝে মাঝে রেগে যান","আপনি এড়িয়ে যান"},{"লাল অথবা কমলা","কালো অথবা সবুজ","হলুদ অথবা হালকা নীল","ধূসর অথবা বাদামী"},{"সোজা হয়ে","উপুর হয়ে","একপাশে কাত হয়ে","একহাতের উপর মাথা রেখে"},{"আপনি কোনো কিছু থেকে পড়ে যাচ্ছেন","আপনি কারো সাথে মারামারি করছেন বা পালিয়ে বেড়াচ্ছেন","আপনি কাউকে খুঁজছেন","আপনি উড়ছেন বা ভাসছেন"}};
    int point=0;
    int i=0,j=0;
    int[][]score={{2,4,6,8},{4,5,6,7}};
    String[] answer = {"Dhaka", "Delhi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questions = (TextView) findViewById(R.id.question);
        radioGroup = (RadioGroup) findViewById(R.id.rg);
        ans1 = (RadioButton) findViewById(R.id.answer1);
        ans2 = (RadioButton) findViewById(R.id.answer2);
        ans3 = (RadioButton) findViewById(R.id.answer3);
        ans4 = (RadioButton) findViewById(R.id.answer4);
        Score=(TextView)findViewById(R.id.score);


        question1();






        /*updatequestion();

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans1.getText()==answer[questionno]){
                    Toast.makeText(getApplicationContext(),"Dhaka is selected",Toast.LENGTH_SHORT).show();
                    point=point+score[questionno][0];
                    updatescore(point);
                    updatequestion();
                }
            }
        });*/



    }

    private String getquestions(int q) {

        return question[q];

    }

    private String getoption0(int q) {

        return options[q][0];

    }

    private String getoption1(int q) {

        return options[q][1];

    }

    private String getoption2(int q) {

        return options[q][2];

    }

    private String getoption3(int q) {

        return options[q][3];

    }




    private void updatequestion(int i,int j){
        questions.setText(question[i]);
        ans1.setText(options[i][j]);
        ans2.setText(options[i][j+1]);
        ans3.setText(options[i][j+2]);
        ans4.setText(options[i][j+3]);
    }

    private void updatescore(int point){
        Score.setText("Score"+point);
    }

    private void getAll() {

        if (questionno < question.length) {


            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
    private void question1() {

        updatequestion(i,j);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question2();
                    totalmark1=2;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question2();
                    totalmark1=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question2();
                    totalmark1=6;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question2();
                    totalmark1=0;
                    Score.setText("Score: "+totalmark());
                }

               ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);



            }
        });



    }

    private void question2(){


        updatequestion(1,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question3();
                    totalmark2=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question3();
                    totalmark2=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question3();
                    totalmark2=7;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question3();
                    totalmark2=2;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question3(){


        updatequestion(2,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question4();
                    totalmark3=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question4();
                    totalmark3=2;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question4();
                    totalmark3=5;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question4();
                    totalmark3=7;
                    Score.setText("Score: "+totalmark());
                }




            }
        });

        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

    }

    private void question4(){


        updatequestion(3,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question5();
                    totalmark4=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question5();
                    totalmark4=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question5();
                    totalmark4=2;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question5();
                    totalmark4=1;
                    Score.setText("Score: "+totalmark());
                }




            }
        });

        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

    }

    private void question5(){


        updatequestion(4,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question6();
                    totalmark5=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question6();
                    totalmark5=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question6();
                    totalmark5=3;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question6();
                    totalmark5=5;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question6(){


        updatequestion(5,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question7();
                    totalmark6=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question7();
                    totalmark6=4;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question7();
                    totalmark6=2;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question7();
                    totalmark6=0;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question7(){


        updatequestion(6,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question8();
                    totalmark7=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question8();
                    totalmark7=2;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question8();
                    totalmark7=4;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question8();
                    totalmark7=0;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question8(){


        updatequestion(7,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question9();
                    totalmark8=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question9();
                    totalmark8=7;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question9();
                    totalmark8=5;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question9();
                    totalmark8=2;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question9(){


        updatequestion(8,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    question10();
                    totalmark9=7;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans2.getId()){
                    question10();
                    totalmark9=6;
                    Score.setText("Score: "+totalmark());
                }

                else if (d==ans3.getId()){
                    question10();
                    totalmark9=4;
                    Score.setText("Score: "+totalmark());
                }

                else {
                    question10();
                    totalmark9=2;
                    Score.setText("Score: "+totalmark());
                }


                ans1.setChecked(false);
                ans2.setChecked(false);
                ans3.setChecked(false);
                ans4.setChecked(false);

            }
        });

    }

    private void question10(){
        updatequestion(9,0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int d) {
                if(d==ans1.getId()){
                    totalmark10=4;
                    Score.setText("Score: "+totalmark());
                    Intent i=new Intent(MainActivity.this,NextActivity.class);
                    i.putExtra("score",totalmark());
                    startActivity(i);

                }

                else if (d==ans2.getId()){
                    totalmark10=2;
                    Score.setText("Score: "+totalmark());
                    Intent i=new Intent(MainActivity.this,NextActivity.class);
                    i.putExtra("score",totalmark());
                    startActivity(i);
                }

                else if (d==ans3.getId()){
                    totalmark10=3;
                    Score.setText("Score: "+totalmark());
                    Intent i=new Intent(MainActivity.this,NextActivity.class);
                    i.putExtra("score",totalmark());
                    startActivity(i);
                }

                else {
                    totalmark10=5;
                    Score.setText("Score: "+totalmark());
                    Intent i=new Intent(MainActivity.this,NextActivity.class);
                    i.putExtra("score",totalmark());
                    startActivity(i);
                }




            }
        });

    }

   /* private void question2() {
//        questions.setText(question[1]);
//        ans1.setText(ansof2[0]);
//        ans2.setText(ansof2[1]);
//        ans3.setText(ansof2[2]);
//        ans4.setText(ansof2[3]);


        for (i=1;i<2;i++){

            questions.setText(question[i]);
                ans1.setText(ansof2[j]);
            for (j=0;j<1;j++){
                ans2.setText(ansof2[j+1]);
                ans3.setText(ansof2[j+2]);
                ans4.setText(ansof2[j+3]);


            }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==ans1.getId()){

                    Toast.makeText(getApplicationContext(),"Dhaka is selected",Toast.LENGTH_SHORT).show();
                    totalmark2=10;
                }

                else if (i==ans2.getId()){
                    Toast.makeText(getApplicationContext(),"Kolkata is selected",Toast.LENGTH_SHORT).show();
                    totalmark2=20;
                }

                else if (i==ans3.getId()){
                    Toast.makeText(getApplicationContext(),"Delhi is selected",Toast.LENGTH_SHORT).show();
                    totalmark2=30;
                }

                else {
                    Toast.makeText(getApplicationContext(),"Mumbai is selected",Toast.LENGTH_SHORT).show();
                    totalmark2=40;
                }


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Total Mark: "+totalmark(), Toast.LENGTH_SHORT).show();
                    }
                });



            }
        });

    }
*/
    public int totalmark(){
        return totalmark1+totalmark2+totalmark3+totalmark4+totalmark5+totalmark6+totalmark7+totalmark8+totalmark9+totalmark10;
    }
}

