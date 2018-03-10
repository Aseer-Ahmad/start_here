package com.example.newu.exa_ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<Book> mdata;

    public RecyclerViewAdapter(Context mcontext, List<Book> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        v=mInflater.inflate(R.layout.cardview_book,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mdata.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mdata.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(mcontext, Book_activity.class);
                intent.putExtra("Title", mdata.get(position).getTitle()   );
                intent.putExtra("Thumbnail",mdata.get(position).getThumbnail());
                intent.putExtra("Description",mdata.get(position).getDescription());

                mcontext.startActivity(intent);


            }
        });



    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            tv_book_title=itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail=itemView.findViewById(R.id.book_image_id);
            cardView=itemView.findViewById(R.id.cardview_id);
        }
    }
}
