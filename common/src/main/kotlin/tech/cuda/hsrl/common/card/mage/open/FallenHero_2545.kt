package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FallenHero_2545 : Card() {
    override val id = 2545
    override val name = "英雄之魂"
    override val description = "你的英雄技能会额外造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "即便是死后，也要继续发挥余热。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fd4658b26abd0e15afd52bb33ffec2edc426841a338caa2d87c503ca5930a1b8.png"
}
