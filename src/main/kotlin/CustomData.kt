package work.crash.eicy

class CustomData {

    companion object Instance{
        val festivalMap = mapOf(
            240209 to "除夕",
            240210 to "春节",
            240214 to "情人节",
            240224 to "元宵节",
            240404 to "清明节",
            240501 to "劳动节",
            240610 to "端午节",
            240810 to "七夕节",
            240917 to "中秋节",
            241001 to "国庆节"
        )
        val groupArray= arrayOf(
            624487948L,695610436L,214558144L
        )

        val welcomeMap = mapOf(
            695610436L to """欢迎加入Minecraft整合包制作交流群，进群请先阅读所有置顶公告。提问请携带尽可能多的相关信息
CRT等魔改类模组错误还需附带脚本内容和输出LOG。
详见/ask/pastebin/log
-----------------
若有项目合作需求请查看置顶群公告。
-----------------
能解决你大部分疑惑的视频:
https://b23.tv/Qu6aAY
https://b23.tv/d2brHg
-----------------
群内可以自由分享CurseForge、MCBBS等导出格式的整合包。
群内分享的代码片段、音效、材质等资源，使用协议和最终解释权归[发布者]，[商业使用]请提前咨询以避免踩雷。
-----------------""",
            624487948L to """欢迎加入Minecraft魔改交流群，进群请先阅读所有置顶公告。提问请携带尽可能多的相关信息
Discord群：https://discord.gg/sB9PhGcutE/
CRT等魔改类模组错误还需附带脚本内容和输出LOG。
详见/ask/pastebin/log
-----------------
能解决你大部分疑惑的视频:
https://b23.tv/Qu6aAY
https://b23.tv/d2brHg
-----------------
本群会不定期清理长期不发言的人。
本群允许分享整合包(私人整合包自建整合包领域服个人服务器包)。
-----------------
群内分享的代码片段、音效、材质等资源，使用协议和最终解释权归[发布者]，[商业使用]请提前咨询以避免踩雷。
-----------------"""
        )

        val gameDev: Array<String> = arrayOf(
            " 喜报：你Tilemap Collider2D + Composite Collider2D失效了。",
            " 今天也是超级游戏人！",
            " 摆了。",
            " 今日运势不错，Update里写While。",
            " ArgumentOutOfRangeException!",
            " NullReferenceException!",
            " UnassignedReferenceException!",
            " 小心约翰里奇蒂洛！",
            " 你染上游戏开发了？",
            " 今天写的Bug有可能成为游戏特性。",
            " 吉：策划的需求能做完。",
            " 今日Bug频发，小心空中指针报错！",
            " 今日渲染器爆炸。",
            " 今日灵感丰富。",
            " 小 心 策 划 ！",
            " 游开报：近日发生一起恶性伤人事件，项目组内程序对策划长期积压的不满爆发导致策划被程序殴打其Hitbox多次，策划hp几近于零。",
            " 适合开发组团建。",
            " 这是一条运势。",
            " 文档出没，大脑慢行。",
            " 写逻辑时记得画思维导图！",
            " 你面数乱了。"
        )
        
        val corpus: Array<String> = arrayOf(
            " 你这辈子就只能做原生了。",
            " 天灵灵地灵灵，魔改大仙快显灵。",
            " 冒险包没有暮色，就像丁真没了雪豹。",
            " 适合头脑风暴，做包容易摆。",
            " 没有日志我能做的事只有帮你算一卦。",
            " 来点酷炫的实现！",
            "今天的人品值是: NaN",
            " 文档出没，大脑慢行。",
            " 只能搓一点点，不能搓多了。",
            " 魔改虽好，请不要贪杯哦。",
            " 空中有指针划过，谨防报错。",
            " /modpacktoday?",
            " 你看我整不整活就完事了。",
            " 草！(脚本报错)走！(进群问)忽略！(忘发pastebin)",
            " 做包时可能偶尔要看Doc。",
            " 做冒险包？考虑一下用数据包实现Boss技能吧！",
            " 整片天空都是CrT的颜色。",
            " 今日运势：凶，当心任务线绊倒人。",
            " 魔改一写、一Debug、一天就过去了哈~",
            " 宜:魔改。",
            " 谨防配方伤人事件。",
            " 试试搓个库吧。",
            " 小 心 迷 信",
            " 最讨厌的两种人，一种是报错发群不发全，另一种是",
            " 可以放开手脚地搓！",
            " 谨防伪劣魔改伤人。",
            " 今天玩玩自己的包？",
            " 你染上魔改了？",
            " 原来你是在改配方，我还以为是在画法阵呢。",
            " 友谊护佑，今日代码出错概率降低。",
            " 超级魔改人！",
            " 昨天晚上我家闹鬼了，但还好我提前印了你画的配方在门口。",
            " 视金钱如粪土不是说让你写钻石到泥土的配方！",
            " 在帮助玩家解决问题时你发现TA电脑里有二十多个Java",
            " 恐怖魔改人！",
            " ---CLEANROOM---",
            " 今日运势：吉，艺术细胞复苏；宜做材质，忌摆配方。",
            " 吾日三省吾身，看文档了没，拜友谊了没，语法检查了没。",
            " 有没有考虑过自己玩自己的整合包?",
            " 小改怡情，大改伤身，全改鸽子纷飞。",
            " 今日在scripts路出现了一起分号失踪事件，造成三个配方报错，两位大佬升压，请各位魔改人保管好自己的分号。",
            " 魔改千万条，安全第一条；代码不规范，友谊两行泪。",
            " 魔改千万条，安全第一条；数值不规范，玩家泪两行。",
            " 谨防GT污染!!!",
            " 前途一片光明啊！（赞赏",
            " 本条语料由格雷科技无限公司赞助!",
            " 本条语料由沉浸重工友情冠名！",
            " 本条语料由热力建筑倾情赞助",
            " 本条语料由末影接口独家代言",
            " 虫子出没，谨防报错!",
            " 伤肝事小，费时事大，做包适度！",
            " 今日在minecraft街道出现一起魔改伤人事件，当事整合包咬伤过路行人肝五个，现已被魔改规范局逮捕！希望各位玩家和作者谨防大型整合包伤人。",
            " 你看那天上的烟花像不像你的报错 五花八门~",
            " 你的整合包已经被我reika的替身【瞬间崩溃】摸过了！",
            " 报错就像海绵里的水，只要你肯挤，总会出来的。",
            " 行",
            " 做整合包哪有不疯的，硬撑罢了！",
            " 今日已控制数名意欲行刺整合包作者的玩家，他们被捕前大喊反对赛博徭役口号。",
            " 不行"
        )
    }
}