package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Initiation_59221 : Card() {
    override val id = 59221
    override val name = "通窍"
    override val description = "对一个随从造成 4点伤害。如果“通窍”消灭该随从，召唤一个新的复制。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "这是鱼人毕业前逃不掉的一劫……"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fd5f31087d7bcd38a54cf0151b762e0504806acbc1ec4039ba2dbb5b941a6078.png"
}
