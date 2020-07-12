package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private CommentsInfo commentsInfo;
    private Attachment attachments;
    private boolean friendsOnly;
    private Date date;
    private String text;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canPinned;
    private boolean isFavorite;
    private int fromId;
    private String createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private String copyright;
    private String views;
    private String postType;
    private String geo;
    private int signerId;
    private boolean markedAsAds;
    private int postponedId;

}