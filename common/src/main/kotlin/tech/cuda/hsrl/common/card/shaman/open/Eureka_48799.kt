package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Eureka_48799 : Card() {
    override val id = 48799
    override val name = "我找到了"
    override val description = "随机召唤你手牌中的一张随从牌的一个复制。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "三分天注定，七分靠打拼，九十分靠发牌员。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d20c3c8a9a8722a17caef4e2f13d6d79222836908ff52d7f5a9d58ed08ef0276.png"
}
