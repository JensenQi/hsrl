package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowHunterVoljin_62176 : Card() {
    override val id = 62176
    override val name = "暗影猎手沃金"
    override val description = "<b>战吼：</b>选择一个随从，与其拥有者手牌中的随机一个随从交换。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "在赞达拉巨魔的路演里，你可看不到这么精彩的交换大戏。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5b20c23ca66e5d500f413d56af630fa1d5d3f0669e050e0e7400ed11eac241b.png"
}
