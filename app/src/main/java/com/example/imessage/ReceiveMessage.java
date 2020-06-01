package com.example.imessage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class ReceiveMessage extends Activity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_message_activity);

        /**
         * Receive message receives the activity intent from SendMessage, reads the
         * message, and displays the message in a new layout(window)
         */
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView receiveMessageView = findViewById(R.id.message);
        receiveMessageView.setText(messageText);
    }
}