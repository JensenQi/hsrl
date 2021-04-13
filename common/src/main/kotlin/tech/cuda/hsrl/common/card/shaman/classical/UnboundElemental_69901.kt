package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnboundElemental_69901 : Card() {
    override val id = 69901
    override val name = "无羁元素"
    override val description = "每当你使用一张具有<b>过载</b>的牌，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "无拘无束的它喜欢在灯红酒绿的城里度过每个夜晚。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bb601019024be2f3b2cacdab55073e51ed8534c3837a1858b82036f3e0b6e4d.png"
}
