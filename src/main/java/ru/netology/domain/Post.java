package ru.netology.domain;

public class Post {
    private String id;
    private String owner_id;
    private CommentsInfo commentsInfo;
    private Article article;
    private boolean like;
    private boolean friendsOnly;
    private String date;
    private String text;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canPinned;
    private boolean isFavorite;
    private boolean repost;

}
