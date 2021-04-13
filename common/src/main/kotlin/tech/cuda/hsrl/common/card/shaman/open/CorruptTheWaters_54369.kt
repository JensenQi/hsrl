package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorruptTheWaters_54369 : Card() {
    override val id = 54369
    override val name = "腐化水源"
    override val description = "<b>任务：</b>使用6张<b>战吼</b>牌。<b>奖励：</b>维尔纳尔之心。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这就是哈加莎被公共泳池拒之门外的原因。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14546110b7d1a9bc52b98dd3ae1464d53f951498c4c116872991cf1f2e498f5b.png"
}
