package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
   private int getUserQuantity;
   private int postsQuantity;
   private int commentsQuantity;
   private double avgPostsPerUser;
   private double avgCommentsPerUser;
  private double avgCommentsPerPost;

    public int getUserQuantity() {
        return getUserQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    Statistics statistics;

   public ForumStatistics(Statistics statistics){
       this.statistics = statistics;
   }
    public void calculateAdvStatistics(){

       getUserQuantity = statistics.usersNames().size();
       postsQuantity = statistics.postsCount();
       commentsQuantity = statistics.commentsCount();

        if(getUserQuantity != 0) {
            avgPostsPerUser = (double)postsQuantity / getUserQuantity;
            avgCommentsPerUser = (double)commentsQuantity / getUserQuantity;
        }
        if(postsQuantity != 0){
            avgCommentsPerPost =(double) commentsQuantity / postsQuantity;
        }
    }

    public void showStatistics(){
    System.out.println("Number of users: " + getUserQuantity);
    System.out.println("Number of posts: " + postsQuantity);
    System.out.println("Number of comments: " + commentsQuantity);
    System.out.println("Average number of comments per user: " + avgCommentsPerUser);
    System.out.println("Average number of posts per user: " + avgPostsPerUser);
    System.out.println("Average  number of comments per post: " + avgCommentsPerUser);
    }

}
