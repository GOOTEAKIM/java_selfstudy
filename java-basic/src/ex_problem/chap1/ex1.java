package ex_problem.chap1;

public class ex1 {
    public static void main(String[] args) {
//        MovieReview inception = new MovieReview();
//
//        inception.title = "인셉션";
//        inception.review = "인생은 무한 루프";
//
//        MovieReview abouttime = new MovieReview();
//
//        abouttime.title = "어바웃타임";
//        abouttime.review = "인생 시간 영화!";
//
//        System.out.println("영화 제목: " + inception.title
//                + ", 리뷰: " + inception.review);
//
//        System.out.println("영화 제목: " + abouttime.title
//                + ", 리뷰: " + abouttime.review);

        MovieReview [] movies = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review ="인생은 무한루프";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃 타임";
        abouttime.review = "인생 시간 영화";

        movies[0] = inception;
        movies[1] = abouttime;

        for (MovieReview movie : movies) {
            System.out.println("영화 제목: " + movie.title +
                    ", 리뷰: " + movie.review);

        }
    }
}
