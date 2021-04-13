package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PilotedReaper_48223 : Card() {
    override val id = 48223
    override val name = "载人毁灭机"
    override val description = "<b>亡语：</b>随机从你的手牌中召唤一个法力值消耗小于或等于（2）点的随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "新的人脸识别系统现已排除出游学者周卓和末日预言者。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4ae3e6729ef3ce14a27b73e59a56ea8ec96b18fe10419f748b17c4e6ae8a3b1.png"
}
