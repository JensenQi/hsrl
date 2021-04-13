package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpikedWheel_61951 : Card() {
    override val id = 61951
    override val name = "尖刺轮盘"
    override val description = "当你的英雄拥有护甲值时，获得+3攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "当车轮，完美；当车舵，完蛋。"
    override val artist = "Gabe Gonzalez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d33b66e44fc797b1fff314ffc4850fc1f636bab1da86a22c3f789d3c089c4e4.png"
}
