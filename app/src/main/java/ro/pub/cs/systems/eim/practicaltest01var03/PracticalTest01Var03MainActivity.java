package ro.pub.cs.systems.eim.practicaltest01var03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var03MainActivity extends AppCompatActivity {
    private EditText topEditText;
    private EditText downEditText;
    private EditText result;

    private final ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.left) {
                int topNum = Integer.parseInt(topEditText.getText().toString());
                int downNum = Integer.parseInt(downEditText.getText().toString());
                String sir1 = String.valueOf(topNum);
                String sir2 = String.valueOf(downNum);
                String sir3 = sir1 + " + " + sir2 + " = ";
                String sir4 = String.valueOf(topNum + downNum);
                String result1 = sir3.concat(sir4);
                result.setText(result1);
            } else if (view.getId() == R.id.right) {
                int topNum = Integer.parseInt(topEditText.getText().toString());
                int downNum = Integer.parseInt(downEditText.getText().toString());
                String sir1 = String.valueOf(topNum);
                String sir2 = String.valueOf(downNum);
                String sir3 = sir1 + " - " + sir2 + " = ";
                String sir4 = String.valueOf(topNum - downNum);
                String result1 = sir3.concat(sir4);
                result.setText(result1);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practical_test01_var03_main);

        topEditText = findViewById(R.id.top_edit_text);
        downEditText = findViewById(R.id.down_edit_text);
        Button left = findViewById(R.id.left);
        left.setOnClickListener(buttonClickListener);
        Button right = findViewById(R.id.right);
        right.setOnClickListener(buttonClickListener);
        result = findViewById(R.id.result);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("PracticalTest01Var03MainActivity", "onRestart() method was invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("PracticalTest01Var03MainActivity", "onStart() method was invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("PracticalTest01Var03MainActivity", "onResume() method was invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("PracticalTest01Var03MainActivity", "onPause() method was invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("PracticalTest01Var03MainActivity", "onStop() method was invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("PracticalTest01Var03MainActivity","onDestroy() method was invoked");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        EditText usernameEditText = (EditText) findViewById(R.id.top_edit_text);
        EditText passwordEditText = (EditText) findViewById(R.id.down_edit_text);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.containsKey(Constants.USERNAME_EDIT_TEXT)) {
            EditText usernameEditText = (EditText) findViewById(R.id.username_edit_text);
            usernameEditText.setText(savedInstanceState.getString(Constants.USERNAME_EDIT_TEXT));
        }
        if (savedInstanceState.containsKey(Constants.PASSWORD_EDIT_TEXT)) {
            EditText passwordEditText = (EditText) findViewById(R.id.password_edit_text);
            passwordEditText.setText(savedInstanceState.getString(Constants.PASSWORD_EDIT_TEXT));
        }
        if (savedInstanceState.containsKey(Constants.REMEMBER_ME_CHECKBOX)) {
            CheckBox rememberMeCheckBox = (CheckBox) findViewById(R.id.remember_me_checkbox);
            rememberMeCheckBox.setChecked(savedInstanceState.getBoolean(Constants.REMEMBER_ME_CHECKBOX));
        }
    }
}