package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Claw_1050 : Card() {
    override val id = 1050
    override val name = "爪击"
    override val description = "使你的英雄获得2点护甲值，并在本回合中获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "谁去谁留，都由爪子决定。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24f4f68eafb19e275a9dbdd3e02df090f129811985624b7d9c8bca2db49c9a40.png"
}
