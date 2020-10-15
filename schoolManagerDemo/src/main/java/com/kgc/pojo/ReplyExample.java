package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
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

        public Criteria andReplyneiIsNull() {
            addCriterion("replynei is null");
            return (Criteria) this;
        }

        public Criteria andReplyneiIsNotNull() {
            addCriterion("replynei is not null");
            return (Criteria) this;
        }

        public Criteria andReplyneiEqualTo(String value) {
            addCriterion("replynei =", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiNotEqualTo(String value) {
            addCriterion("replynei <>", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiGreaterThan(String value) {
            addCriterion("replynei >", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiGreaterThanOrEqualTo(String value) {
            addCriterion("replynei >=", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiLessThan(String value) {
            addCriterion("replynei <", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiLessThanOrEqualTo(String value) {
            addCriterion("replynei <=", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiLike(String value) {
            addCriterion("replynei like", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiNotLike(String value) {
            addCriterion("replynei not like", value, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiIn(List<String> values) {
            addCriterion("replynei in", values, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiNotIn(List<String> values) {
            addCriterion("replynei not in", values, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiBetween(String value1, String value2) {
            addCriterion("replynei between", value1, value2, "replynei");
            return (Criteria) this;
        }

        public Criteria andReplyneiNotBetween(String value1, String value2) {
            addCriterion("replynei not between", value1, value2, "replynei");
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