package DataHandler;

import hotel.Person.Staff;

public class StaffStack {

    private StaffNode tail = null;
    private int count = 0;

    /**
     * Pushes a staff object onto the stack.
     *
     * @param data The staff object to be pushed.
     */
    public void push(Staff data) {
        StaffNode node = new StaffNode(data);
        if (tail == null) {
            tail = node;
        } else {
            node.previous = tail;
            tail = node;
        }
        count++;
    }

    /**
     * Pops and returns the topmost staff object from the stack.
     *
     * @return The staff object that was popped, or null if the stack is empty.
     */
    public Staff pop() {
        if (tail != null) {
            Staff data = tail.data;
            tail = tail.previous;
            count--;
            return data;
        }
        return null;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return tail == null;
    }

    /**
     * Retrieves a staff object from the stack based on its ID.
     *
     * @param id The ID of the staff object to be retrieved.
     * @return The staff object with the specified ID, or null if not found.
     */
    public Staff getById(int id) {
        StaffStack tempStack = new StaffStack();
        Staff staff = new Staff();

        while (!isEmpty()) {
            if (staff.getId() == id) {
                break;
            }
            staff = pop();
            tempStack.push(staff);
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }

        return staff;
    }

    /**
     * Deletes a staff object from the stack based on its ID.
     *
     * @param id The ID of the staff object to be deleted.
     */
    public void deleteById(int id) {
        StaffStack tempStack = new StaffStack();
        Staff staff = new Staff();
        
        if (id == tail.data.getId()) {
            pop();
            return;
        }
        
        while (!isEmpty()) {
            if (staff.getId() != (id + 1)) {
                staff = pop();
                tempStack.push(staff);
            } else {
                staff = pop();
            }
        }
        
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    /**
     * Returns the number of staff objects in the stack.
     *
     * @return The count of staff objects in the stack.
     */
    public int count() {
        return count;
    }

    /**
     * Returns the next available auto-generated ID for a staff object.
     *
     * @return The auto-generated ID for the next staff object.
     */
    public int getAutoNumber() {
        return tail.data.getId() + 1;
    }

    /**
     * Returns the total salary (including bonus) for a staff object.
     *
     * @param staffId The ID of the staff object.
     * @return The total salary (salary + bonus) for the specified staff object,
     * or 0 if not found.
     */
    public double getSalary(int staffId) {
        Staff staff = getById(staffId);
        if (staff == null) {
            return 0;
        }
        return staff.getSalary() + staff.getBonus();
    }

    /**
     * Displays the staff objects in the stack in the order they were added.
     * This method prints the staff details.
     */
    public void display() {
        StaffStack tempStack = new StaffStack();
        Staff staff;
        while (!isEmpty()) {
            staff = pop();
            tempStack.push(staff);
        }
        
        while (!tempStack.isEmpty()) {
            staff = tempStack.pop();
            push(staff);
            System.out.println(staff.toString());
        }
    }

    /**
     * Displays the staff objects in the stack in reverse order (as a stack).
     * This method prints the staff details.
     */
    /*
    public void displayAsStack() {
        StaffStack tempStack = new StaffStack();
        Staff staff;
        while (!isEmpty()) {
            staff = pop();
            tempStack.push(staff);
            System.out.println(staff.toString());
        }
        
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }
    */

}
