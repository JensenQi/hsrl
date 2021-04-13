package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BonechewerVanguard_57176 : Card() {
    override val id = 57176
    override val name = "噬骨先锋"
    override val description = "<b>嘲讽</b> 每当该随从受到伤害，便获得+2攻击力。"
    override var cost: Int? = 7
    override var health: Int? = 10
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "她们山寨配发的盾牌是真的山寨。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4903711ce623ff856551da6e9f1521af802acb20418d9c28383392ad5651d7c.png"
}
