package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FightPromoter_40617 : Card() {
    override val id = 40617
    override val name = "竞技推广员"
    override val description = "<b>战吼：</b>如果你控制一个生命值大于或等于6的随从，抽两张牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "想打架吗？我来帮你约战纳克斯。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa2789678600a04f56dede0863b38361ea51d7c788972e8f297fc2396ec81005.png"
}
