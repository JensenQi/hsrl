package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelReaver_1982 : Card() {
    override val id = 1982
    override val name = "魔能机甲"
    override val description = "每当你的对手使用一张卡牌时，便移除你的牌库顶的三张牌。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "当你变得足够强大，就不会在意曾经付出过多少代价。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d38dc36457e271a45c57353a6866b9472fd2b19b621912bea8a993ba9a115489.png"
}
