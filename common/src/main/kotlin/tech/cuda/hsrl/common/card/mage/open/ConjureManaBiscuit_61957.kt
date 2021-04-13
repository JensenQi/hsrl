package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConjureManaBiscuit_61957 : Card() {
    override val id = 61957
    override val name = "制造法力饼干"
    override val description = "将一张可以复原两个法力水晶的饼干置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "她挂机就是为了这个。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cd3b63b15c3e9c2348635840c0d36810ad64e72beab9b115416b1766716b81d.png"
}
