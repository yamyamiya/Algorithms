package lesson9.Homework8;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SpecialStack {
        ArrayList<Integer> items;
        ArrayList<Integer> minItems;
        ArrayList<Integer> maxItems;

        public SpecialStack(ArrayList<Integer> items, ArrayList<Integer> minItems, ArrayList<Integer> maxItems) {
            this.items = items;
            this.minItems = minItems;
            this.maxItems = maxItems;

        }

        public int push(int element) {
            if (this.items.size() == 0 || element <= this.minItems.get(this.minItems.size() - 1))
                this.minItems.add(element);
            if (this.items.size() == 0 || element >= this.maxItems.get(this.maxItems.size() - 1))
                this.maxItems.add(element);

            this.items.add(element);

            return this.items.size();
        }

        public int pop() {
            if (this.items.size() == 0) throw new EmptyStackException();
            if (this.items.get(this.items.size() - 1) == this.minItems.get(this.minItems.size() - 1))
                this.minItems.remove(this.minItems.size() - 1);

            if (this.items.get(this.items.size() - 1) == this.maxItems.get(this.maxItems.size() - 1))
                this.maxItems.remove(this.maxItems.size() - 1);
            return this.items.remove(this.items.size() - 1);
        }

        public int peek() {
            return this.items.get(this.items.size() - 1);
        }

        public boolean isEmpty() {
            return this.items.size() == 0;
        }

        public void clear() {
            this.items = new ArrayList<>();
        }

        public int getMin1() {
            int min = this.items.get(0);
            for (int i = 0; i < this.items.size(); i++) {
                if (this.items.get(i) < min) min = this.items.get(i);
            }
            return min;
        }

        public int getMax1() {
            int max = this.items.get(0);
            for (int i = 0; i < this.items.size(); i++) {
                if (this.items.get(i) > max) max = this.items.get(i);
            }
            return max;
        }

        public int getMin2(){
            return this.minItems.get(this.minItems.size()-1);
        }

        public int getMax2(){
            return this.maxItems.get(this.maxItems.size()-1);
        }
    }

