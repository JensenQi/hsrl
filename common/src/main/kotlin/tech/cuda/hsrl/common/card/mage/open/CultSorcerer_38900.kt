package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CultSorcerer_38900 : Card() {
    override val id = 38900
    override val name = "异教女巫"
    override val description = "<b>法术伤害+1</b> 在你施放一个法术后，使你的克苏恩获得+1/+1<i>（无论它在哪里）。</i>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "不论我们告诫她多少回，她还是会偷偷拿东西去喂牌桌底下的克苏恩。"
    override val artist = "J. Meyers & T. Washington"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05560237a2594f23f256c6ac9959322b5fb85a91c2f32104bf805a05a0a1d3a4.png"
}
