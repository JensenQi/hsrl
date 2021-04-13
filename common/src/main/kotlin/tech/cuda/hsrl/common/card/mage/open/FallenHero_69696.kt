package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FallenHero_69696 : Card() {
    override val id = 69696
    override val name = "英雄之魂"
    override val description = "你的英雄技能会额外造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "即便是死后，也要继续发挥余热。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9f2a5a4a33f11706c9fc5a7e07c2f6d38863a92da9c63113c41d3fb0b733839.png"
}
