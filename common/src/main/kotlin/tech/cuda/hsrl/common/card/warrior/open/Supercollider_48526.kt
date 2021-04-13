package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Supercollider_48526 : Card() {
    override val id = 48526
    override val name = "超级对撞器"
    override val description = "在你攻击一个随从后，迫使其攻击相邻的一个 随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "砰砰三定律第二条：使劲打用力抽！"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9cbe0ae44784f732272d9535ace77881faf787306680cd06ef77a52c558f11be.png"
}
