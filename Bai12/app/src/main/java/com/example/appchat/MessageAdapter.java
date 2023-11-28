package com.example.appchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {

    private List<Message> messageList;

    public MessageAdapter(Context context, List<Message> messages) {
        super(context, 0, messages);
        messageList = messages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message, parent, false);
        }

        TextView textViewUserId = convertView.findViewById(R.id.textViewUserId);
        TextView textViewMessageText = convertView.findViewById(R.id.textViewMessageText);

        textViewUserId.setText(message.getUserName());
        textViewMessageText.setText(message.getMessageText());

        return convertView;
    }
}
