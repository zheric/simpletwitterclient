package com.codepath.apps.simpletwitterclient;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.simpletwitterclient.models.Tweet;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.zhang1 on 12/11/2015.
 */
public class TweetsArrayAdaptor extends ArrayAdapter<Tweet>{
    public TweetsArrayAdaptor(Context context, List<Tweet> tweets) {
        super(context, android.R.layout.simple_list_item_1, tweets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Tweet tweet = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_tweet,parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivProfileImage);
        TextView tvUserName = (TextView) convertView.findViewById(R.id.tvUserName);
        TextView tvBody = (TextView) convertView.findViewById(R.id.tvBody);
        TextView tvTimeStamp = (TextView) convertView.findViewById(R.id.tvTimeStamp);

        tvUserName.setText(tweet.getUser().getScreenname());
        tvBody.setText(tweet.getBody());
        tvTimeStamp.setText(RelativeDate.getRelativeDate(tweet.getCreatedAt()));
        imageView.setImageResource(android.R.color.transparent);
        Picasso.with(getContext()).load(tweet.getUser().getProfileImageUrl()).into(imageView);

        return convertView;
    }
}
