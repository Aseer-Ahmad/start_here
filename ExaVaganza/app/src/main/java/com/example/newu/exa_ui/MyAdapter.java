package com.example.newu.exa_ui;

/**
 * Created by cruzer on 9/3/18.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cruzer on 8/3/18.
 */

/*
The adapter is the piece that will connect our data to our RecyclerView and determine the
ViewHolder(s) which will need to be used to display that data.
*/

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // Inputing Data in the list

    private List<ListItem> listItems;;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /*
        This method is called right when the adapter is created and is
        used to initialize your ViewHolder(s).This new ViewHolder should
        be constructed with a new View that can represent the items of the
        given type. You can either create a new View manually or inflate
        it from an XML layout file.
        */

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        /*
        This method is called for each ViewHolder to bind it to the adapter.
        This is where we will pass our data to our ViewHolder.
        Called by RecyclerView to display the data at the specified position.
        This method should update the contents of the itemView to reflect the
        item at the given position.
        */

        ListItem listItem = listItems.get(position); // Will give the specific position object of listitem

        // Setting the values in holder so as to display in the recycler view

        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
        /*
        This method returns the size of the collection that contains the items
        we want to display.
        */
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        /*
        The RecyclerView.ViewHolder class has a field that is public final View itemView.
        It says that the onBindViewHolder method should update the contents of the itemView to
        reflect the item at the given position .
        */

        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = itemView.findViewById(R.id.textViewHead);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);

        }
    }
}



