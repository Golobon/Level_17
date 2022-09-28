package Lecture_1;

class Tiger extends Cat
{
    public Object getMyParent()
    {
        if (this.parent != null)
            return this.parent;
        else
            return "я - сирота";
    }
}