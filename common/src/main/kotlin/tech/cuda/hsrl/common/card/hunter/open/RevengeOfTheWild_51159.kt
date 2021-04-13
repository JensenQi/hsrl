package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RevengeOfTheWild_51159 : Card() {
    override val id = 51159
    override val name = "荒野的复仇"
    override val description = "召唤在 本回合中死亡的友方野兽。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "委婉一点的书面说法是：大自然的正当防卫。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7642333722ff32068f1cf9a0e8a069d28a4e560966eeedb201c558368eca10bf.png"
}
