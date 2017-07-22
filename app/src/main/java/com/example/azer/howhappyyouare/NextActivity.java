package com.example.azer.howhappyyouare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by azeR on 7/20/2017.
 */

public class NextActivity extends AppCompatActivity {
TextView tv_result;
    Button restart;
    int totalscore;
    String a="আপনি আত্মকেন্দ্রিক, আপনি ডমিন্যান্ট করতে পছন্দ করেন। আপনি প্রশংসিত হবেন, কিন্তু সবসময় বিশ্বাসযোগ্য হবেন না। আপনার সাথে কেউ ঘনিষ্ঠ হতে অনেক দ্বিধায় ভুগবে।";
    String b="আপনি একজন আকর্ষণীয়, প্রাণবন্ত, আবেগী, ব্যক্তিত্বসম্পন্ন, দলনেতা, দূরদর্শী, যেকোনো কিছুর সিদ্ধান্ত অনেক তাড়াতাড়ি নিতে পারেন, সেটা ভুল হোক আর ঠিক হোক। আপনি সাহসী, অ্যাডভেঞ্চারপ্রিয়, আপনার সঙ্গ পেতে সবাই পছন্দ করবে।";
    String c="আপনি সতেজ, জীবনঘনিষ্ঠ, সুন্দর, বাস্তববাদী একজন মানুষ। আপনি দয়ালু, সুবিবেচক, মানুষকে সাহায্য করতে পছন্দ করেন ।";
    String d="আপনি বিচক্ষন, সতর্ক, যত্নশীল, বাস্তববাদী, চালাক, মেধাবী এবং বিনয়ী। আপনার সাথেই সহজে একজন বন্ধুত্ব করে ফেলবে। আপনি সহজেই কাউকে বিশ্বাস করে ফেলবেন, কিন্তু কেউ আপনার বিশ্বাস ভাঙলে তাঁকে আর কখনোই বিশ্বাস করতে পারবেন না।";
    String e="আপনি বিরক্তিকর এবং ব্যস্ত। আপনাকে সবাই অত্যন্ত কৌশলী বলেই জানবে। আপনি প্রতিভাবান নন, কিন্তু উদ্যমী।";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextlayout);
        tv_result=(TextView)findViewById(R.id.result);
        restart=(Button)findViewById(R.id.restart);
        totalscore=getIntent().getIntExtra("score",0);
        if(totalscore>=60){
            tv_result.setText(a);
        }
        else if (totalscore>=51&&totalscore<60 ){
            tv_result.setText(b);
        }

        else if (totalscore>=41&&totalscore<=50 ){
            tv_result.setText(c);
        }
        else if (totalscore>=31&&totalscore<=40 ){
            tv_result.setText(d);
        }
        else if (totalscore>=21&&totalscore<=30 ){
            tv_result.setText(e);
        }

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(NextActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

}
