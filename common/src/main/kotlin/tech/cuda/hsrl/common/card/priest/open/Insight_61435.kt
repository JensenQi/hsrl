package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Insight_61435 : Card() {
    override val id = 61435
    override val name = "洞察"
    override val description = "抽一张随从牌。<b>腐蚀：</b>使其法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "洞察难道就是用眼球钻出一个洞？"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22a7fdf7c60d2180f72f2e785b0735eee176241894b290cac445f3c9afd228e3.png"
}
