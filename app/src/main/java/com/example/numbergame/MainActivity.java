package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class number{
        int n;
        int i;
        public Boolean isSquare(){
            for (i=1;i<=n;i++){
                if(n/i==i) {
                    return true;
                }
            else{
                return false;
                }
            }
            return null;
        }
        public boolean isTriangle(){
            for(i=1;i<=n;i++) {
                if ((i * (i + 1)) / 2 == n) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
    }
    public void isFunction(View view){
        EditText editTextTextPersonName=(EditText) findViewById(R.id.editTextTextPersonName);
        String str=editTextTextPersonName.getText().toString();
        int lm=Integer.parseInt(str);
        number num=new number();
        String message="The number is a";
        num.n=lm;
        Log.i("value",str);

        if (num.isSquare()==true && num.isTriangle()==true){
            message+="The number is a square and triangular both";
        }
        else if (num.isSquare()==true){
             message+="The number is a square";
        }
        else if(num.isTriangle()==true){
             message+="the number is a triangle number";
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}