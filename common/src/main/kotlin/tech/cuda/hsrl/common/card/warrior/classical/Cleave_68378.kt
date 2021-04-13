package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cleave_68378 : Card() {
    override val id = 68378
    override val name = "顺劈斩"
    override val description = "随机对两个敌方随从造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "嘿，你们俩...你们能不能站在一起？就一会儿..."
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a4e3252bb2c27328e3130f065e812d1842e498bdb13eef71f9899d7da6868384.png"
}
