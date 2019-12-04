package com.bw.movie.bean.fragment_bean;

import java.util.List;

/**
 * @name APP
 * @class name：com.bw.movie.bean.fragment_bean
 * @class describe
 * @anthor 24673
 * @time 2019/11/29 10:43
 * @change
 * @chang time
 * @class describe
 */
public class CommentBean {

    /**
     * result : [{"commentContent":"不错","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-10-31/20191031165328.png","commentId":92,"commentTime":1572512063000,"commentUserId":13678,"commentUserName":"abnetming","greatHeadPic":[],"greatNum":0,"hotComment":0,"isGreat":0},{"commentContent":"很好","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-11-07/20191107204040.png","commentId":52,"commentTime":1570604666000,"commentUserId":13597,"commentUserName":"狂饮风中血","greatHeadPic":[],"greatNum":0,"hotComment":0,"isGreat":0},{"commentContent":"你傻逼把","commentHeadPic":"http://172.17.8.100/images/movie/head_pic/2019-09-07/20190907140903.jpg","commentId":20,"commentTime":1567341427000,"commentUserId":13472,"commentUserName":"红衣佳人白衣友","greatHeadPic":[],"greatNum":0,"hotComment":0,"isGreat":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commentContent : 不错
         * commentHeadPic : http://172.17.8.100/images/movie/head_pic/2019-10-31/20191031165328.png
         * commentId : 92
         * commentTime : 1572512063000
         * commentUserId : 13678
         * commentUserName : abnetming
         * greatHeadPic : []
         * greatNum : 0
         * hotComment : 0
         * isGreat : 0
         */

        private String commentContent;
        private String commentHeadPic;
        private int commentId;
        private long commentTime;
        private int commentUserId;
        private String commentUserName;
        private int greatNum;
        private int hotComment;
        private int isGreat;
        private List<?> greatHeadPic;

        public String getCommentContent() {
            return commentContent;
        }

        public void setCommentContent(String commentContent) {
            this.commentContent = commentContent;
        }

        public String getCommentHeadPic() {
            return commentHeadPic;
        }

        public void setCommentHeadPic(String commentHeadPic) {
            this.commentHeadPic = commentHeadPic;
        }

        public int getCommentId() {
            return commentId;
        }

        public void setCommentId(int commentId) {
            this.commentId = commentId;
        }

        public long getCommentTime() {
            return commentTime;
        }

        public void setCommentTime(long commentTime) {
            this.commentTime = commentTime;
        }

        public int getCommentUserId() {
            return commentUserId;
        }

        public void setCommentUserId(int commentUserId) {
            this.commentUserId = commentUserId;
        }

        public String getCommentUserName() {
            return commentUserName;
        }

        public void setCommentUserName(String commentUserName) {
            this.commentUserName = commentUserName;
        }

        public int getGreatNum() {
            return greatNum;
        }

        public void setGreatNum(int greatNum) {
            this.greatNum = greatNum;
        }

        public int getHotComment() {
            return hotComment;
        }

        public void setHotComment(int hotComment) {
            this.hotComment = hotComment;
        }

        public int getIsGreat() {
            return isGreat;
        }

        public void setIsGreat(int isGreat) {
            this.isGreat = isGreat;
        }

        public List<?> getGreatHeadPic() {
            return greatHeadPic;
        }

        public void setGreatHeadPic(List<?> greatHeadPic) {
            this.greatHeadPic = greatHeadPic;
        }
    }
}
