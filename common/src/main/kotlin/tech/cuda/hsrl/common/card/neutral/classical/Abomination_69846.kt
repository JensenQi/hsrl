package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Abomination_69846 : Card() {
    override val id = 69846
    override val name = "憎恶"
    override val description = "<b>嘲讽，亡语：</b>对所有角色造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "憎恶喜欢享用新鲜的肉，以及在海滩上漫步。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00e0e2a126b6973aad103b37ee3167b8e718ee4f093abb5426bbc559cdc4fa02.png"
}
