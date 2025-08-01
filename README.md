# Java Project

这是一个基础的Java Maven项目，包含了基本的项目结构和配置。

## 项目结构

```
.
├── src
│   ├── main/java        # 源代码目录
│   ├── main/resources   # 资源文件目录
│   ├── test/java       # 测试代码目录
│   └── test/resources  # 测试资源目录
├── pom.xml             # Maven配置文件
└── README.md           # 项目说明文档
```

## 构建和运行

### 构建项目
```bash
mvn clean install
```

### 运行测试
```bash
mvn test
```

### 运行应用
```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## 开发环境要求

- JDK 11或更高版本
- Maven 3.6.x或更高版本