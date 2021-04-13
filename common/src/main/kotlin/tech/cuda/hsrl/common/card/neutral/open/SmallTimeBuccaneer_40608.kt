package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmallTimeBuccaneer_40608 : Card() {
    override val id = 40608
    override val name = "蹩脚海盗"
    override val description = "如果你装备一把武器，该随从具有 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "看在你块头比我大的份上，今天暂且放过你！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0081288c7f9b128846889c9246e39cb8c402e427497a9ba0812a43587c6596b.png"
}
