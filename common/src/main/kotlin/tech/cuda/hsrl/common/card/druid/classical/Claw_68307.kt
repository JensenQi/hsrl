package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Claw_68307 : Card() {
    override val id = 68307
    override val name = "爪击"
    override val description = "使你的英雄获得2点护甲值，并在本回合中获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "谁去谁留，都由爪子决定。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ae045933600a77a08dc880e3198907836e9a7a20ec4cb5e314bccc8dfc1c417.png"
}
