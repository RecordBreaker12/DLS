package dlfs;

public abstract class AbsSearch {
   Node startNode;
   Node goalNode;

   public AbsSearch(Node startNode, Node goalNode){
       this.startNode = startNode;
       this.goalNode = goalNode;
   }

   public abstract boolean execute();
}
