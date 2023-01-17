package com.blairsaintklaus.sendthezentinel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.blairsaintklaus.daos.Mensaje;
import com.blairsaintklaus.mainlistchat.databinding.MainActivityfullscreenBinding;
import com.blairsaintklaus.mainlistchat.databinding.OpenNewChatactivityfullscreenBinding;

import java.util.List;

public class OpenChatWithUser extends AppCompatActivity {

    private EditText messageSend;
    private ListView listadoChat;
    private Button send;
    private List<Mensaje> messages;
    private ArrayAdapter<Mensaje> adapter;
    private View contentView;
    private View controlsView;
    private OpenNewChatactivityfullscreenBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = OpenNewChatactivityfullscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        contentView = binding.sendNewMessage;
        controlsView = binding.sendButton;

//        TextView messageEditText = findViewById(R.id.message_by_me);
//        Mensaje message = new Mensaje();
//        message.setText(messageEditText.getText().toString());
//        list_chat.add(message);
//        adapter_chat.notifyDataSetChanged();
    }
}
