package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvolvingSpores_40991 : Card() {
    override val id = 40991
    override val name = "生长孢子"
    override val description = "<b>进化</b>你所有的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "那些能让你变大的蘑菇通常都装在标有“？”的箱子里。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e46a3cf16ea58660029ad19c0a2b14ac2e9e6ac5631b3897f53de31ad7f2e78b.png"
}
