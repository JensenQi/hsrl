package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnowfuryGiant_42765 : Card() {
    override val id = 42765
    override val name = "雪怒巨人"
    override val description = "在本局对战中，你每<b>过载</b>一个法力水晶，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 11
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "双11来了，你的卡准备好过载了吗？"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0344e72e3c735b37462fe5793e86eb7a305626d9587b603a71ea81c71d421731.png"
}
