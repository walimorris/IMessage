package com.example.imessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class SendMessage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_message_activity);
    }

    /**
     * Activates and starts activity of sending an intent with a message to ReceiveMessage
     * when the widget button"Send" is clicked
     *
     * @param : Button is a widget of type View
     *
     * Gets message from send_message_activity, converts message into into a type String,
     * pushes the intent to ReceiveMessage along with the message
     */
    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessage.class);
        intent.putExtra(ReceiveMessage.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}
