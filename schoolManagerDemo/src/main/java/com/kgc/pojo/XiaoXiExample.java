package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaoXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaoXiExample() {
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

        public Criteria andXidIsNull() {
            addCriterion("xid is null");
            return (Criteria) this;
        }

        public Criteria andXidIsNotNull() {
            addCriterion("xid is not null");
            return (Criteria) this;
        }

        public Criteria andXidEqualTo(Integer value) {
            addCriterion("xid =", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotEqualTo(Integer value) {
            addCriterion("xid <>", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThan(Integer value) {
            addCriterion("xid >", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xid >=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThan(Integer value) {
            addCriterion("xid <", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThanOrEqualTo(Integer value) {
            addCriterion("xid <=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidIn(List<Integer> values) {
            addCriterion("xid in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotIn(List<Integer> values) {
            addCriterion("xid not in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidBetween(Integer value1, Integer value2) {
            addCriterion("xid between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotBetween(Integer value1, Integer value2) {
            addCriterion("xid not between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andChidIsNull() {
            addCriterion("chid is null");
            return (Criteria) this;
        }

        public Criteria andChidIsNotNull() {
            addCriterion("chid is not null");
            return (Criteria) this;
        }

        public Criteria andChidEqualTo(Integer value) {
            addCriterion("chid =", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotEqualTo(Integer value) {
            addCriterion("chid <>", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThan(Integer value) {
            addCriterion("chid >", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chid >=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThan(Integer value) {
            addCriterion("chid <", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidLessThanOrEqualTo(Integer value) {
            addCriterion("chid <=", value, "chid");
            return (Criteria) this;
        }

        public Criteria andChidIn(List<Integer> values) {
            addCriterion("chid in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotIn(List<Integer> values) {
            addCriterion("chid not in", values, "chid");
            return (Criteria) this;
        }

        public Criteria andChidBetween(Integer value1, Integer value2) {
            addCriterion("chid between", value1, value2, "chid");
            return (Criteria) this;
        }

        public Criteria andChidNotBetween(Integer value1, Integer value2) {
            addCriterion("chid not between", value1, value2, "chid");
            return (Criteria) this;
        }

        public Criteria andZhuIsNull() {
            addCriterion("zhu is null");
            return (Criteria) this;
        }

        public Criteria andZhuIsNotNull() {
            addCriterion("zhu is not null");
            return (Criteria) this;
        }

        public Criteria andZhuEqualTo(Integer value) {
            addCriterion("zhu =", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuNotEqualTo(Integer value) {
            addCriterion("zhu <>", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuGreaterThan(Integer value) {
            addCriterion("zhu >", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhu >=", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuLessThan(Integer value) {
            addCriterion("zhu <", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuLessThanOrEqualTo(Integer value) {
            addCriterion("zhu <=", value, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuIn(List<Integer> values) {
            addCriterion("zhu in", values, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuNotIn(List<Integer> values) {
            addCriterion("zhu not in", values, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuBetween(Integer value1, Integer value2) {
            addCriterion("zhu between", value1, value2, "zhu");
            return (Criteria) this;
        }

        public Criteria andZhuNotBetween(Integer value1, Integer value2) {
            addCriterion("zhu not between", value1, value2, "zhu");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNull() {
            addCriterion("neirong is null");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNotNull() {
            addCriterion("neirong is not null");
            return (Criteria) this;
        }

        public Criteria andNeirongEqualTo(String value) {
            addCriterion("neirong =", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotEqualTo(String value) {
            addCriterion("neirong <>", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThan(String value) {
            addCriterion("neirong >", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThanOrEqualTo(String value) {
            addCriterion("neirong >=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThan(String value) {
            addCriterion("neirong <", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThanOrEqualTo(String value) {
            addCriterion("neirong <=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLike(String value) {
            addCriterion("neirong like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotLike(String value) {
            addCriterion("neirong not like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongIn(List<String> values) {
            addCriterion("neirong in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotIn(List<String> values) {
            addCriterion("neirong not in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongBetween(String value1, String value2) {
            addCriterion("neirong between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotBetween(String value1, String value2) {
            addCriterion("neirong not between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNull() {
            addCriterion("xtype is null");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNotNull() {
            addCriterion("xtype is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeEqualTo(Integer value) {
            addCriterion("xtype =", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotEqualTo(Integer value) {
            addCriterion("xtype <>", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThan(Integer value) {
            addCriterion("xtype >", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xtype >=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThan(Integer value) {
            addCriterion("xtype <", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThanOrEqualTo(Integer value) {
            addCriterion("xtype <=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeIn(List<Integer> values) {
            addCriterion("xtype in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotIn(List<Integer> values) {
            addCriterion("xtype not in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeBetween(Integer value1, Integer value2) {
            addCriterion("xtype between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("xtype not between", value1, value2, "xtype");
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