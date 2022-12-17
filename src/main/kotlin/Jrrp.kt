package work.crash.eicy

import net.mamoe.mirai.console.permission.*
import net.mamoe.mirai.console.permission.PermissionService.Companion.hasPermission
import net.mamoe.mirai.console.plugin.jvm.*
import net.mamoe.mirai.contact.*
import net.mamoe.mirai.event.events.*
import net.mamoe.mirai.event.*
import net.mamoe.mirai.message.data.*
import net.mamoe.mirai.utils.info
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random
/*
    第三代机器人使用的原语料曾在其它插件使用sql挂置。
    因尊重原作者及协议需要，Eicy将所有语料重新集成到此插件中并进行开源。
    代码能优化我是知道的，但又不是不能用。
    一代:https://github.com/bingling-sama/BakaHDT
    二代:https://github.com/GBLodb/ChlorineSharp
*/
object Jrrp : KotlinPlugin(
    JvmPluginDescription(
        id = "work.crash.eicy.Jrrp",
        name = "JrrpUtils",
        version = "1.0-SNAPSHOT",
    )
    { author("Eicy、Gary、Bingling") }
)
{
    override fun onEnable() {
        logger.info { "JrrpUtils loaded" }
        val eventChannel = GlobalEventChannel.parentScope(this)
        eventChannel.subscribeAlways<GroupMessageEvent> {
            val gID=group.id
            val twGr = (Your Group ID Here)L
            if (message.contentToString().equals("/jrrp")) {
                val senderID=this.sender.id
                val random = Random(
                    (SimpleDateFormat("yyMMdd").format(Date()).toInt() xor senderID.toInt()).toLong()
                )
                val chain = buildMessageChain {
                    +At(senderID)
                    +PlainText("今天的人品值是:")
                    +random.nextInt(101).toString()
                }
                group.sendMessage(chain)
            }
            /*
            if (message.contentToString().equals("/r今日猝死率")) {
                val senderID=this.sender.id
                val random = Random(
                    (SimpleDateFormat("yyMMdd").format(Date()).toInt()+1 xor senderID.toInt()).toLong()
                )
                val chain = buildMessageChain {
                    +At(senderID)
                    +PlainText("今天的猝死率是:0.")
                    +random.nextInt(100).toString()
                    +PlainText(" 请注意休息！")
                }
                group.sendMessage(chain)
            }
             */
            if (message.contentToString().equals("/modpacktoday?")) {
                val senderID=this.sender.id
                val random = Random(
                    (SimpleDateFormat("yyMMdd").format(Date()).toInt()+2 xor senderID.toInt()).toLong()
                )
                var answer: String? = null
                val randInt = random.nextInt(101)
                if(randInt<2){
                    answer = "你这辈子就只能做原生了。"
                }else if(randInt<10) {
                    answer = "摆！"
                }else if(randInt<15){
                    answer = "适合头脑风暴，做包容易摆。"
                }else if(randInt<25) {
                    answer = "只能搓一点点，不能搓多了。"
                }else if(randInt<35){
                    answer = "做包时可能偶尔要看Doc。"
                }else if(randInt<65){
                    answer = "宜:魔改。"
                }else if(randInt<80){
                    answer = "可以放开手脚地搓！"
                }else if(randInt<95){
                    answer = "也许能一天内搓完格雷魔改。"
                }else answer = "状态这么好，出门走走吧。"
                val chain = buildMessageChain {
                    +At(senderID)
                    +PlainText(answer)
                }
                group.sendMessage(chain)
            }
            if (message.contentToString().equals("/ping")){
                group.sendMessage("Pong!")
            }
            if (message.contentToString().equals("/help")&&gID==twGr){
                group.sendMessage(
"""指令一览：
/ping Bot存活测试
/info 显示Bot资料
/help 显示Bot帮助信息
/jrrp 获取今日随机人品值[roll 0~100]
/modpacktoday? 询问今日是否适合做包
/ask 教你提问
/pastebin pastebin使用方法
/logs log相关
/rules 显示群规
/crtcmds CraftTweaker 部分常用指令使用方法
/mtcmds MineTweaker 部分常用指令使用方法
/whyvsc 为什么要使用 VisualStudio Code ？
/links 实用链接"""
                )
            }
            if (message.contentToString().equals("/info")&&gID==twGr){
                group.sendMessage(
"""Shrink是由[Eicy]为Minecraft魔改交流群部署的QQ bot。
语料和部分插件代码来自
BakaHDT(https://github.com/bingling-sama/BakaHDT)
ChlorineSharp(https://github.com/GBLodb/ChlorineSharp)
JrrpUtils(https://github.com/cneicy/JrrpUtils)"""
                )
            }
            if (message.contentToString().equals("/ask")&&gID==twGr){
                group.sendMessage(
"""提问的正确方式：
简明清晰地描述你的游戏版本&遇到的问题
魔改问题请将[crafttweaker.log]和log中提到/你认为可能出错的代码使用pastebin发送到群内
(详见/pastebin)"""
                )
            }
            if (message.contentToString().equals("/pastebin")&&gID==twGr){
                group.sendMessage(
"""Mozilla Community Pastebin使用介绍：
1.打开https://pastebin.mozilla.org/
2.将信息复制到Content框内
3.点击Paste Snippet!
4.复制网址栏网址发送至群内"""
                )
            }
            if (message.contentToString().equals("/logs")&&gID==twGr){
                group.sendMessage(
"""常见常用日志文件类型/路径:
崩溃报告(cr) - .minecraft/crash-reports/crash-xxx.log
崩溃报告可能有多份, 请发送时间最近的。
游戏日志(latest.log) - .minecraft/logs/latest.log
游戏调试日志(debug.log) - .minecraft/logs/debug.log
CraftTweaker日志文件(crtlog) - .minecraft/crafttweaker.log
MineTweaker日志文件(mtlog) - .minecraft/minetweaker.log"""
                )
            }
            if (message.contentToString().equals("/rules")&&gID==twGr){
                group.sendMessage(
"""《Minecraft魔改交流群 群规》请熟读并背诵
1.不允许多次加群, 超过[3次]将被加入本群黑名单;
2.禁止以任何形式发布有关 [键政/商业广告/非私人服务器宣传] 的消息;
3.禁止以任何形式发布R18等[限制级]内容, 擦边球也不行;
4.禁止以任何形式发布付费资源;
5.看Wiki(真的有很多问题看Wiki就能解决);
6.看Wiki(第一次警告, 第二次十分钟, 第三次飞机票);
7.看Wiki(重要的事情说三遍);
8.群内大佬不是神, 拒绝伸手党和随意@;
9.仅在不影响他人的前提下讨论非MC内容/非魔改内容;
10.发消息尤其是问问题, 经过思考整理好语言再发, 且尽量不要刷屏式发消息;
*本消息可能不会被及时更新, 最新群规内容永远以群公告为准*"""
                )
            }
            if (message.contentToString().equals("/crtcmds")&&gID==twGr){
                group.sendMessage(
"""CraftTweaker 可用的部分实用指令：
/ct hand 输出玩家手上物品的 ID / 矿辞 (1.12-) / 标签 (1.14+) 等信息，你可以点击有关信息将其复制到剪贴板里。
/ct syntax 检查脚本的语法是否准确。注意语法正确也不代表一定能运行的符合预期，此指令仅能检查语法问题，无法检查逻辑问题。
/ct log 打开 CrT 日志文件，请配合 &pastebin 发送。
/ct inventory 输出玩家物品栏的所有物品的 ID。
/ct conflict 打印所有冲突配方和其总数。 (仅限工作台和熔炉)
/reload (1.14+ 可用) 重载脚本。但 CoT 脚本不可重载。"""
                )
            }
            if (message.contentToString().equals("/mtcmds")&&gID==twGr){
                group.sendMessage(
"""MineTweaker 可用的部分实用指令: 
/mt hand 输出玩家手上物品的 ID 等信息，你可以点击有关信息将其复制到剪贴板里。
/mt inventory 输出玩家物品栏的所有物品的 ID。
/mt oredict 打印所有游戏内存在的矿辞。
/mt liquids 输出游戏内所有流体的注册 ID。
/mt blocks 可以输出游戏内所有方块的注册ID。
/mt blockinfo 开启时左右键可查看方块数据，再次输入指令以关闭。
/mt reload 重载脚本。"""
                )
            }
            if (message.contentToString().equals("/whyvsc")&&gID==twGr){
                group.sendMessage(
"""VisualStudio Code(以下简称VSCode) 是当下编写 ZenScript 代码的最佳选择之一, 也是本群极力推荐的 文本编辑工具。
为什么? 请花半分钟阅读以下理由:
VSCode 是一款由微软维护的, 功能十分丰富, 用户社区和插件社区极其发达的文本编辑器。
对于 ZenScript 这种脚本语言, 是最佳的编写工具之一, 安装了插件后, 可以提供代码高亮和语法纠错, NBT 预览和编辑, Language 文件高亮等等功能。
就算对于其他脚本语言, 甚至程序设计语言, 其都是一个值得考虑的选择。
想要下载并安装 VSCode, 前往 https://code.visualstudio.com/download, 下载适合自己系统的安装包安装即可。
如果需要安装 ZenScript 高亮插件, 请参考 https://github.com/GBLodb/GBLodb/blob/master/personalModpackDevExperience.md。"""
                )
            }
            if (message.contentToString().equals("/links")&&gID==twGr){
                group.sendMessage(
"""实用链接:
CraftTweaker 官方文档: https://docs.blamejared.com/
MineTweaker 官方文档: http://minetweaker3.powerofbytes.com/wiki/Main_Page/
TweakerGroup Discord: https://discord.gg/4XsUtUfDFt/
BlameJared Discord: https://discord.blamejared.com/
Ubuntu Pastebin: https://paste.ubuntu.com.cn/
Mozilla Community Pastebin: https://pastebin.mozilla.org/
CurseForge Minecraft Mods: https://www.curseforge.com/minecraft/mc-mods/
ZenTutorial: https://youyi580.gitbook.io/zentutorial/
Cog: https://youyi580.gitbook.io/cog/
UsefulMods: https://github.com/TheUsefulLists/UsefulMods"""
                )
            }
        }
        eventChannel.subscribeAlways<MemberJoinEvent> {
            val groupID = group.id
            if(groupID == 624487948L||groupID == 214558144L){
                group.sendMessage(
"""欢迎加入Minecraft魔改交流群，进群请先阅读所有置顶公告。提问请携带尽可能多的相关信息
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
            }
        }
    }
}