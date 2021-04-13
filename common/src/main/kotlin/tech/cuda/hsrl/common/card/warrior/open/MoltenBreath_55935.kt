package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenBreath_55935 : Card() {
    override val id = 55935
    override val name = "熔火吐息"
    override val description = "对一个随从造成 5点伤害。如果你的手牌中有龙牌，便获得5点护甲值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "烫烫烫烫烫烫烫"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bb06754a3a2e1475703490106abcad1648acf80b8555a2adda64df92538e9ea2.png"
}
