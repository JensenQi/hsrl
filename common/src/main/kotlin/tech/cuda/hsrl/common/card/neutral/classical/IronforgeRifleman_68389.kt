package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronforgeRifleman_68389 : Card() {
    override val id = 68389
    override val name = "铁炉堡火枪手"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“准备！瞄准！干杯！”"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/583555c1cc40b20834b8218bc4672003e18f9b6361973056c19cfc0facdee25b.png"
}
