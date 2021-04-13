package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnboundElemental_774 : Card() {
    override val id = 774
    override val name = "无羁元素"
    override val description = "每当你使用一张具有<b>过载</b>的牌，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "无拘无束的它喜欢在灯红酒绿的城里度过每个夜晚。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f6fd8f2a153b59d7693890afb87a78b94230ac549646073ac852cc44fbe832a.png"
}
