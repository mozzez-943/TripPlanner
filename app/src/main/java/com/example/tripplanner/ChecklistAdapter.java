// ChecklistAdapter.java
package com.example.tripplanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChecklistAdapter extends RecyclerView.Adapter<ChecklistAdapter.ViewHolder> {
    private List<String> checklist;

    public ChecklistAdapter(List<String> checklist) {
        this.checklist = checklist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_checklist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = checklist.get(position);
        holder.itemTextView.setText(item);
    }

    @Override
    public int getItemCount() {
        return checklist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTextView);
        }
    }
}
