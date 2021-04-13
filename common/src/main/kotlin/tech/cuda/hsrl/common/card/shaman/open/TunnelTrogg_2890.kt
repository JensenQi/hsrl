package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TunnelTrogg_2890 : Card() {
    override val id = 2890
    override val name = "坑道穴居人"
    override val description = "每当你<b>过载</b>时，每一个被锁的法力水晶会使其获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Loe
    override val background = "穴居人的确很丑，因为他们常年生活在不见天日的坑道里。不信你进去住几天试试。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56f5c4308800dbe56acc873ba91e062423611ec79bd9743ebd613b760f374dff.png"
}
