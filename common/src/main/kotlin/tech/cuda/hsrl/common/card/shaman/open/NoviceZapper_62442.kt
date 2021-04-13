package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NoviceZapper_62442 : Card() {
    override val id = 62442
    override val name = "电击学徒"
    override val description = "<b>法术伤害+1</b> <b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "学徒做错了什么？"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22628c2d58a79ece991b21cde09d73dac4e6fbe618b7dee5cd5accde9fc2cacb.png"
}
