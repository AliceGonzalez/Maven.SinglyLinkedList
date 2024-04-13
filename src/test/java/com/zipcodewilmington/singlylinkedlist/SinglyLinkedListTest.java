package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList<Integer>list  = new SinglyLinkedList<>();

        list.add(1);
        list.add(2);
        boolean assertListContains = list.isEmpty();
        Assert.assertFalse(assertListContains);
    }
        @Test
    public void copyTest(){
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        int expectedSizeOfOriginal = 3;
        int actualSizeOfCopy = list1.copy().size();

        Assert.assertEquals(expectedSizeOfOriginal, actualSizeOfCopy);

    }

    @Test
    public void sortTest(){
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList();

        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.sort();
        int expectedIndex = 1;
        int actualIndex = list1.get(0);

        Assert.assertEquals(expectedIndex, actualIndex);
    }
@Test
public void containsTest(){
    SinglyLinkedList<Integer> list = new SinglyLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);

    //Object expectedItemInList = 3;
    boolean actualItemInList = list.contains(3);

    Assert.assertTrue(actualItemInList);
}

    @Test
    public void removeTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add("I love rock & roll");
        list.add("Boyz");

        int expectedListSize = 3;
        list.remove("Boyz");
        int actualListSize = list.size();

        Assert.assertEquals(expectedListSize, actualListSize);
    }


    @Test
    public void findTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        int expectedIndex = 2;
        int actualIndex = list.find(3);

        Assert.assertEquals(expectedIndex, actualIndex);

    }

    @Test
    public void getTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Object expectedItemReturned = 3;
        Object actualItemReturned = list.get(2);

        Assert.assertEquals(expectedItemReturned, actualItemReturned);
    }

    @Test
    public void sizeTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        int expectedSize = 3;
        int actualSize = list.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

}
