package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlaguedProtodrake_59948 : Card() {
    override val id = 59948
    override val name = "魔药始祖龙"
    override val description = "<b>亡语：</b>随机召唤一个法力值消耗为（7）的随从。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“始祖龙里有什么？！始祖龙里到底有什么？！”"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc552ce1ca78e0769f5e7035e136e2372d3a21d3f122cf1cd2c638bc5a093981.png"
}
