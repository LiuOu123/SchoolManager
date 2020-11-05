package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExamItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamItemsExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEpaperidIsNull() {
            addCriterion("epaperid is null");
            return (Criteria) this;
        }

        public Criteria andEpaperidIsNotNull() {
            addCriterion("epaperid is not null");
            return (Criteria) this;
        }

        public Criteria andEpaperidEqualTo(Integer value) {
            addCriterion("epaperid =", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidNotEqualTo(Integer value) {
            addCriterion("epaperid <>", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidGreaterThan(Integer value) {
            addCriterion("epaperid >", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("epaperid >=", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidLessThan(Integer value) {
            addCriterion("epaperid <", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidLessThanOrEqualTo(Integer value) {
            addCriterion("epaperid <=", value, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidIn(List<Integer> values) {
            addCriterion("epaperid in", values, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidNotIn(List<Integer> values) {
            addCriterion("epaperid not in", values, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidBetween(Integer value1, Integer value2) {
            addCriterion("epaperid between", value1, value2, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEpaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("epaperid not between", value1, value2, "epaperid");
            return (Criteria) this;
        }

        public Criteria andEscoreIsNull() {
            addCriterion("escore is null");
            return (Criteria) this;
        }

        public Criteria andEscoreIsNotNull() {
            addCriterion("escore is not null");
            return (Criteria) this;
        }

        public Criteria andEscoreEqualTo(Integer value) {
            addCriterion("escore =", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreNotEqualTo(Integer value) {
            addCriterion("escore <>", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreGreaterThan(Integer value) {
            addCriterion("escore >", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("escore >=", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreLessThan(Integer value) {
            addCriterion("escore <", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreLessThanOrEqualTo(Integer value) {
            addCriterion("escore <=", value, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreIn(List<Integer> values) {
            addCriterion("escore in", values, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreNotIn(List<Integer> values) {
            addCriterion("escore not in", values, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreBetween(Integer value1, Integer value2) {
            addCriterion("escore between", value1, value2, "escore");
            return (Criteria) this;
        }

        public Criteria andEscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("escore not between", value1, value2, "escore");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNull() {
            addCriterion("etype is null");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNotNull() {
            addCriterion("etype is not null");
            return (Criteria) this;
        }

        public Criteria andEtypeEqualTo(Integer value) {
            addCriterion("etype =", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotEqualTo(Integer value) {
            addCriterion("etype <>", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThan(Integer value) {
            addCriterion("etype >", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("etype >=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThan(Integer value) {
            addCriterion("etype <", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThanOrEqualTo(Integer value) {
            addCriterion("etype <=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeIn(List<Integer> values) {
            addCriterion("etype in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotIn(List<Integer> values) {
            addCriterion("etype not in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeBetween(Integer value1, Integer value2) {
            addCriterion("etype between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("etype not between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEaIsNull() {
            addCriterion("ea is null");
            return (Criteria) this;
        }

        public Criteria andEaIsNotNull() {
            addCriterion("ea is not null");
            return (Criteria) this;
        }

        public Criteria andEaEqualTo(String value) {
            addCriterion("ea =", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaNotEqualTo(String value) {
            addCriterion("ea <>", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaGreaterThan(String value) {
            addCriterion("ea >", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaGreaterThanOrEqualTo(String value) {
            addCriterion("ea >=", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaLessThan(String value) {
            addCriterion("ea <", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaLessThanOrEqualTo(String value) {
            addCriterion("ea <=", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaLike(String value) {
            addCriterion("ea like", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaNotLike(String value) {
            addCriterion("ea not like", value, "ea");
            return (Criteria) this;
        }

        public Criteria andEaIn(List<String> values) {
            addCriterion("ea in", values, "ea");
            return (Criteria) this;
        }

        public Criteria andEaNotIn(List<String> values) {
            addCriterion("ea not in", values, "ea");
            return (Criteria) this;
        }

        public Criteria andEaBetween(String value1, String value2) {
            addCriterion("ea between", value1, value2, "ea");
            return (Criteria) this;
        }

        public Criteria andEaNotBetween(String value1, String value2) {
            addCriterion("ea not between", value1, value2, "ea");
            return (Criteria) this;
        }

        public Criteria andEbIsNull() {
            addCriterion("eb is null");
            return (Criteria) this;
        }

        public Criteria andEbIsNotNull() {
            addCriterion("eb is not null");
            return (Criteria) this;
        }

        public Criteria andEbEqualTo(String value) {
            addCriterion("eb =", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbNotEqualTo(String value) {
            addCriterion("eb <>", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbGreaterThan(String value) {
            addCriterion("eb >", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbGreaterThanOrEqualTo(String value) {
            addCriterion("eb >=", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbLessThan(String value) {
            addCriterion("eb <", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbLessThanOrEqualTo(String value) {
            addCriterion("eb <=", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbLike(String value) {
            addCriterion("eb like", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbNotLike(String value) {
            addCriterion("eb not like", value, "eb");
            return (Criteria) this;
        }

        public Criteria andEbIn(List<String> values) {
            addCriterion("eb in", values, "eb");
            return (Criteria) this;
        }

        public Criteria andEbNotIn(List<String> values) {
            addCriterion("eb not in", values, "eb");
            return (Criteria) this;
        }

        public Criteria andEbBetween(String value1, String value2) {
            addCriterion("eb between", value1, value2, "eb");
            return (Criteria) this;
        }

        public Criteria andEbNotBetween(String value1, String value2) {
            addCriterion("eb not between", value1, value2, "eb");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("ec is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("ec is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(String value) {
            addCriterion("ec =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(String value) {
            addCriterion("ec <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(String value) {
            addCriterion("ec >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(String value) {
            addCriterion("ec >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(String value) {
            addCriterion("ec <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(String value) {
            addCriterion("ec <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLike(String value) {
            addCriterion("ec like", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotLike(String value) {
            addCriterion("ec not like", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<String> values) {
            addCriterion("ec in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<String> values) {
            addCriterion("ec not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(String value1, String value2) {
            addCriterion("ec between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(String value1, String value2) {
            addCriterion("ec not between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEdIsNull() {
            addCriterion("ed is null");
            return (Criteria) this;
        }

        public Criteria andEdIsNotNull() {
            addCriterion("ed is not null");
            return (Criteria) this;
        }

        public Criteria andEdEqualTo(String value) {
            addCriterion("ed =", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdNotEqualTo(String value) {
            addCriterion("ed <>", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdGreaterThan(String value) {
            addCriterion("ed >", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdGreaterThanOrEqualTo(String value) {
            addCriterion("ed >=", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdLessThan(String value) {
            addCriterion("ed <", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdLessThanOrEqualTo(String value) {
            addCriterion("ed <=", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdLike(String value) {
            addCriterion("ed like", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdNotLike(String value) {
            addCriterion("ed not like", value, "ed");
            return (Criteria) this;
        }

        public Criteria andEdIn(List<String> values) {
            addCriterion("ed in", values, "ed");
            return (Criteria) this;
        }

        public Criteria andEdNotIn(List<String> values) {
            addCriterion("ed not in", values, "ed");
            return (Criteria) this;
        }

        public Criteria andEdBetween(String value1, String value2) {
            addCriterion("ed between", value1, value2, "ed");
            return (Criteria) this;
        }

        public Criteria andEdNotBetween(String value1, String value2) {
            addCriterion("ed not between", value1, value2, "ed");
            return (Criteria) this;
        }

        public Criteria andEeIsNull() {
            addCriterion("ee is null");
            return (Criteria) this;
        }

        public Criteria andEeIsNotNull() {
            addCriterion("ee is not null");
            return (Criteria) this;
        }

        public Criteria andEeEqualTo(String value) {
            addCriterion("ee =", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeNotEqualTo(String value) {
            addCriterion("ee <>", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeGreaterThan(String value) {
            addCriterion("ee >", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeGreaterThanOrEqualTo(String value) {
            addCriterion("ee >=", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeLessThan(String value) {
            addCriterion("ee <", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeLessThanOrEqualTo(String value) {
            addCriterion("ee <=", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeLike(String value) {
            addCriterion("ee like", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeNotLike(String value) {
            addCriterion("ee not like", value, "ee");
            return (Criteria) this;
        }

        public Criteria andEeIn(List<String> values) {
            addCriterion("ee in", values, "ee");
            return (Criteria) this;
        }

        public Criteria andEeNotIn(List<String> values) {
            addCriterion("ee not in", values, "ee");
            return (Criteria) this;
        }

        public Criteria andEeBetween(String value1, String value2) {
            addCriterion("ee between", value1, value2, "ee");
            return (Criteria) this;
        }

        public Criteria andEeNotBetween(String value1, String value2) {
            addCriterion("ee not between", value1, value2, "ee");
            return (Criteria) this;
        }

        public Criteria andEfIsNull() {
            addCriterion("ef is null");
            return (Criteria) this;
        }

        public Criteria andEfIsNotNull() {
            addCriterion("ef is not null");
            return (Criteria) this;
        }

        public Criteria andEfEqualTo(String value) {
            addCriterion("ef =", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotEqualTo(String value) {
            addCriterion("ef <>", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThan(String value) {
            addCriterion("ef >", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThanOrEqualTo(String value) {
            addCriterion("ef >=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThan(String value) {
            addCriterion("ef <", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThanOrEqualTo(String value) {
            addCriterion("ef <=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLike(String value) {
            addCriterion("ef like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotLike(String value) {
            addCriterion("ef not like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfIn(List<String> values) {
            addCriterion("ef in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotIn(List<String> values) {
            addCriterion("ef not in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfBetween(String value1, String value2) {
            addCriterion("ef between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotBetween(String value1, String value2) {
            addCriterion("ef not between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andEkeysIsNull() {
            addCriterion("ekeys is null");
            return (Criteria) this;
        }

        public Criteria andEkeysIsNotNull() {
            addCriterion("ekeys is not null");
            return (Criteria) this;
        }

        public Criteria andEkeysEqualTo(String value) {
            addCriterion("ekeys =", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysNotEqualTo(String value) {
            addCriterion("ekeys <>", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysGreaterThan(String value) {
            addCriterion("ekeys >", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysGreaterThanOrEqualTo(String value) {
            addCriterion("ekeys >=", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysLessThan(String value) {
            addCriterion("ekeys <", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysLessThanOrEqualTo(String value) {
            addCriterion("ekeys <=", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysLike(String value) {
            addCriterion("ekeys like", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysNotLike(String value) {
            addCriterion("ekeys not like", value, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysIn(List<String> values) {
            addCriterion("ekeys in", values, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysNotIn(List<String> values) {
            addCriterion("ekeys not in", values, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysBetween(String value1, String value2) {
            addCriterion("ekeys between", value1, value2, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEkeysNotBetween(String value1, String value2) {
            addCriterion("ekeys not between", value1, value2, "ekeys");
            return (Criteria) this;
        }

        public Criteria andEhintsIsNull() {
            addCriterion("ehints is null");
            return (Criteria) this;
        }

        public Criteria andEhintsIsNotNull() {
            addCriterion("ehints is not null");
            return (Criteria) this;
        }

        public Criteria andEhintsEqualTo(String value) {
            addCriterion("ehints =", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsNotEqualTo(String value) {
            addCriterion("ehints <>", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsGreaterThan(String value) {
            addCriterion("ehints >", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsGreaterThanOrEqualTo(String value) {
            addCriterion("ehints >=", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsLessThan(String value) {
            addCriterion("ehints <", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsLessThanOrEqualTo(String value) {
            addCriterion("ehints <=", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsLike(String value) {
            addCriterion("ehints like", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsNotLike(String value) {
            addCriterion("ehints not like", value, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsIn(List<String> values) {
            addCriterion("ehints in", values, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsNotIn(List<String> values) {
            addCriterion("ehints not in", values, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsBetween(String value1, String value2) {
            addCriterion("ehints between", value1, value2, "ehints");
            return (Criteria) this;
        }

        public Criteria andEhintsNotBetween(String value1, String value2) {
            addCriterion("ehints not between", value1, value2, "ehints");
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