package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int userQuantity;
    int postsQuantity;
    int commentsQuantity;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    Statistics statistics;

   public ForumStatistics(Statistics statistics){
       this.statistics = statistics;
   }
    public void calculateAdvStatistics(){

       userQuantity = statistics.usersNames().size();
       postsQuantity = statistics.postsCount();
       commentsQuantity = statistics.commentsCount();

        if(userQuantity != 0) {
            avgPostsPerUser = (double)postsQuantity / userQuantity;
            avgCommentsPerUser = (double)commentsQuantity / userQuantity;
        }
        if(postsQuantity != 0){
            avgCommentsPerPost =(double) commentsQuantity / postsQuantity;
        }
    }

    public void showStatistics(){
    System.out.println("Number of users: " + userQuantity);
    System.out.println("Number of posts: " + postsQuantity);
    System.out.println("Number of comments: " + commentsQuantity);
    System.out.println("Average number of comments per user: " + avgCommentsPerUser);
    System.out.println("Average number of posts per user: " + avgPostsPerUser);
    System.out.println("Average  number of comments per post: " + avgCommentsPerUser);
    }

}
