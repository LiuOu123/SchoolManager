package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class PathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andWoridIsNull() {
            addCriterion("worid is null");
            return (Criteria) this;
        }

        public Criteria andWoridIsNotNull() {
            addCriterion("worid is not null");
            return (Criteria) this;
        }

        public Criteria andWoridEqualTo(Integer value) {
            addCriterion("worid =", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridNotEqualTo(Integer value) {
            addCriterion("worid <>", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridGreaterThan(Integer value) {
            addCriterion("worid >", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("worid >=", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridLessThan(Integer value) {
            addCriterion("worid <", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridLessThanOrEqualTo(Integer value) {
            addCriterion("worid <=", value, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridIn(List<Integer> values) {
            addCriterion("worid in", values, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridNotIn(List<Integer> values) {
            addCriterion("worid not in", values, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridBetween(Integer value1, Integer value2) {
            addCriterion("worid between", value1, value2, "worid");
            return (Criteria) this;
        }

        public Criteria andWoridNotBetween(Integer value1, Integer value2) {
            addCriterion("worid not between", value1, value2, "worid");
            return (Criteria) this;
        }

        public Criteria andPathnameIsNull() {
            addCriterion("pathname is null");
            return (Criteria) this;
        }

        public Criteria andPathnameIsNotNull() {
            addCriterion("pathname is not null");
            return (Criteria) this;
        }

        public Criteria andPathnameEqualTo(String value) {
            addCriterion("pathname =", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotEqualTo(String value) {
            addCriterion("pathname <>", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThan(String value) {
            addCriterion("pathname >", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThanOrEqualTo(String value) {
            addCriterion("pathname >=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThan(String value) {
            addCriterion("pathname <", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThanOrEqualTo(String value) {
            addCriterion("pathname <=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLike(String value) {
            addCriterion("pathname like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotLike(String value) {
            addCriterion("pathname not like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameIn(List<String> values) {
            addCriterion("pathname in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotIn(List<String> values) {
            addCriterion("pathname not in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameBetween(String value1, String value2) {
            addCriterion("pathname between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotBetween(String value1, String value2) {
            addCriterion("pathname not between", value1, value2, "pathname");
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