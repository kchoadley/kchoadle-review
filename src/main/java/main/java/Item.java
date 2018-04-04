package main.java;
/*
  File:	Item.java
  Author: Kristofer , Alex Mehlhase	
  Date:	April 4th, 2018
  
  Description: A simple Item class that encapsulates an integer Key value.
*/

/**
  Class: Item	
  
  Description: A simple Item class that encapsulates an integer Key value.
*/
public final class Item implements Comparable {
        private int key;
        
        public Item() { 
        }
        public Item(int keyValue) { 
                key = keyValue;
        }
        
        public int getKey() {
                return this.key;
        }
        public void setKey(int key) {
                this.key = key;
        }
        /**
         Method: equals
        Inputs: Object obj
        Returns: boolean

        Description: Overrides Object equals method.
        */
        @Override
	public boolean equals(Object obj) {
		if (obj == null)
		   return false;
		if (getClass() != obj.getClass())
		   return false;
		return (this.key == ((Item)obj).key);
	}
        /**
         Method: hashCode
        Inputs:
        Returns: int key

        Description: Overrides Object hashCode method.
        */
	@Override
	public int hashCode() {
		return key;
        }
        /**
         Method: compareTo
        Inputs: Object other
        Returns: int

        Description: implements Comparable compareTo method.
        */
        public int compareTo(Object other) throws ClassCastException {
                if (!(other instanceof Item))
                throw new ClassCastException("An Item object expected.");
                return this.getKey() - ((Item) other).getKey();    
        }
}