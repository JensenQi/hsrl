package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GarrisonCommander_2517 : Card() {
    override val id = 2517
    override val name = "要塞指挥官"
    override val description = "每个回合你可以使用两次英雄技能。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "之所以对你如此严格要求是因为他很关心你，只不过不愿意承认罢了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1c30935f22c370f8b38302db6b43f3991d969c491c510e532bb5b09d5b2399cd.png"
}
