package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnboundElemental_69628 : Card() {
    override val id = 69628
    override val name = "无羁元素"
    override val description = "每当你使用一张具有<b>过载</b>的牌，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "无拘无束的它喜欢在灯红酒绿的城里度过每个夜晚。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e7ae661bbe2d689925dc1e928b2cbbf4db475e29142e96806c7af6f68b82111.png"
}
