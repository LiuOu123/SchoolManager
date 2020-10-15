package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAccidIsNull() {
            addCriterion("accid is null");
            return (Criteria) this;
        }

        public Criteria andAccidIsNotNull() {
            addCriterion("accid is not null");
            return (Criteria) this;
        }

        public Criteria andAccidEqualTo(Integer value) {
            addCriterion("accid =", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotEqualTo(Integer value) {
            addCriterion("accid <>", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThan(Integer value) {
            addCriterion("accid >", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accid >=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThan(Integer value) {
            addCriterion("accid <", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThanOrEqualTo(Integer value) {
            addCriterion("accid <=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidIn(List<Integer> values) {
            addCriterion("accid in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotIn(List<Integer> values) {
            addCriterion("accid not in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidBetween(Integer value1, Integer value2) {
            addCriterion("accid between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotBetween(Integer value1, Integer value2) {
            addCriterion("accid not between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEamilIsNull() {
            addCriterion("eamil is null");
            return (Criteria) this;
        }

        public Criteria andEamilIsNotNull() {
            addCriterion("eamil is not null");
            return (Criteria) this;
        }

        public Criteria andEamilEqualTo(String value) {
            addCriterion("eamil =", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotEqualTo(String value) {
            addCriterion("eamil <>", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilGreaterThan(String value) {
            addCriterion("eamil >", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilGreaterThanOrEqualTo(String value) {
            addCriterion("eamil >=", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLessThan(String value) {
            addCriterion("eamil <", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLessThanOrEqualTo(String value) {
            addCriterion("eamil <=", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilLike(String value) {
            addCriterion("eamil like", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotLike(String value) {
            addCriterion("eamil not like", value, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilIn(List<String> values) {
            addCriterion("eamil in", values, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotIn(List<String> values) {
            addCriterion("eamil not in", values, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilBetween(String value1, String value2) {
            addCriterion("eamil between", value1, value2, "eamil");
            return (Criteria) this;
        }

        public Criteria andEamilNotBetween(String value1, String value2) {
            addCriterion("eamil not between", value1, value2, "eamil");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNull() {
            addCriterion("touxiang is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNotNull() {
            addCriterion("touxiang is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangEqualTo(String value) {
            addCriterion("touxiang =", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotEqualTo(String value) {
            addCriterion("touxiang <>", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThan(String value) {
            addCriterion("touxiang >", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("touxiang >=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThan(String value) {
            addCriterion("touxiang <", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThanOrEqualTo(String value) {
            addCriterion("touxiang <=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLike(String value) {
            addCriterion("touxiang like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotLike(String value) {
            addCriterion("touxiang not like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangIn(List<String> values) {
            addCriterion("touxiang in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotIn(List<String> values) {
            addCriterion("touxiang not in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangBetween(String value1, String value2) {
            addCriterion("touxiang between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotBetween(String value1, String value2) {
            addCriterion("touxiang not between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andQianmingIsNull() {
            addCriterion("qianming is null");
            return (Criteria) this;
        }

        public Criteria andQianmingIsNotNull() {
            addCriterion("qianming is not null");
            return (Criteria) this;
        }

        public Criteria andQianmingEqualTo(String value) {
            addCriterion("qianming =", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotEqualTo(String value) {
            addCriterion("qianming <>", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingGreaterThan(String value) {
            addCriterion("qianming >", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingGreaterThanOrEqualTo(String value) {
            addCriterion("qianming >=", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLessThan(String value) {
            addCriterion("qianming <", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLessThanOrEqualTo(String value) {
            addCriterion("qianming <=", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLike(String value) {
            addCriterion("qianming like", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotLike(String value) {
            addCriterion("qianming not like", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingIn(List<String> values) {
            addCriterion("qianming in", values, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotIn(List<String> values) {
            addCriterion("qianming not in", values, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingBetween(String value1, String value2) {
            addCriterion("qianming between", value1, value2, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotBetween(String value1, String value2) {
            addCriterion("qianming not between", value1, value2, "qianming");
            return (Criteria) this;
        }

        public Criteria andModificationIsNull() {
            addCriterion("modification is null");
            return (Criteria) this;
        }

        public Criteria andModificationIsNotNull() {
            addCriterion("modification is not null");
            return (Criteria) this;
        }

        public Criteria andModificationEqualTo(Date value) {
            addCriterion("modification =", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationNotEqualTo(Date value) {
            addCriterion("modification <>", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationGreaterThan(Date value) {
            addCriterion("modification >", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationGreaterThanOrEqualTo(Date value) {
            addCriterion("modification >=", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationLessThan(Date value) {
            addCriterion("modification <", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationLessThanOrEqualTo(Date value) {
            addCriterion("modification <=", value, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationIn(List<Date> values) {
            addCriterion("modification in", values, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationNotIn(List<Date> values) {
            addCriterion("modification not in", values, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationBetween(Date value1, Date value2) {
            addCriterion("modification between", value1, value2, "modification");
            return (Criteria) this;
        }

        public Criteria andModificationNotBetween(Date value1, Date value2) {
            addCriterion("modification not between", value1, value2, "modification");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("utype is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("utype is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Integer value) {
            addCriterion("utype =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Integer value) {
            addCriterion("utype <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Integer value) {
            addCriterion("utype >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("utype >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Integer value) {
            addCriterion("utype <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Integer value) {
            addCriterion("utype <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Integer> values) {
            addCriterion("utype in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Integer> values) {
            addCriterion("utype not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Integer value1, Integer value2) {
            addCriterion("utype between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("utype not between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}