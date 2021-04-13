package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cleave_940 : Card() {
    override val id = 940
    override val name = "顺劈斩"
    override val description = "随机对两个敌方随从造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "嘿，你们俩...你们能不能站在一起？就一会儿..."
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4aad5dfed4dd4c372d7b94cbb9f880b9d66ccf106f05d9c9124e4224e43a85b.png"
}
