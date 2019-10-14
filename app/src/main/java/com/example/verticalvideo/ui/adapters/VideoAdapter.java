package com.example.verticalvideo.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.verticalvideo.R;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.utils.LogHelper;
import com.squareup.picasso.Picasso;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    private static final String TAG = "VideoAdapter";
    private Context mContext;
    private VideosInfoBean[] mVideosInfoList;

    public VideoAdapter(Context context, VideosInfoBean[] videosInfoList){
        this.mContext = context;
        this.mVideosInfoList = videosInfoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_show_video, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.jzvdStd.setUp(mVideosInfoList[position].getContent().getV_url(),
            mVideosInfoList[position].getContent().getTitle(), Jzvd.SCREEN_WINDOW_NORMAL);
        Picasso.with(mContext)
            .load(mVideosInfoList[position].getContent().getCover_img())
            .into(holder.jzvdStd.thumbImageView);
    }

    @Override
    public int getItemCount() {
        return mVideosInfoList.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        JzvdStd jzvdStd;

        ViewHolder(View itemView) {
            super(itemView);
            jzvdStd = itemView.findViewById(R.id.video_player);
        }
    }
}
